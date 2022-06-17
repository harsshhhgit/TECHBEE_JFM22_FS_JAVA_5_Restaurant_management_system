import { Component, OnInit } from '@angular/core';
import { BookingService } from '../../services/booking.service';

@Component({
  selector: 'app-booking',
  templateUrl: './booking.component.html',
  styleUrls: ['./booking.component.css']
})
export class BookingComponent implements OnInit {

  bookingDetails = null as any;
  bookingToUpdate={
    bookingId:"",
    fullName:"",
    venue:"",
    // picture:"",
    time:"",
    people:"",
    date:"",
    phoneNumber:""
  };

  constructor(private menuService:BookingService) {
    this.getBookingsDetails();
  }

  ngOnInit(): void {
  }

  getBookingsDetails(){
    this.menuService.getBookings().subscribe(
      {
        next : (resp) => {
          console.log(resp);
          this.bookingDetails=resp;
          // this.retrieveResonse = resp;
          // this.base64Data = this.retrieveResonse.picByte;
          // this.retrievedImage = 'data:image/jpeg;base64,' + this.base64Data;
        },
        error : (err) => {
          console.log(err);
        }
      }
    )
  }

}
