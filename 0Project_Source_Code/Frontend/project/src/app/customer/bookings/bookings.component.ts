import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { BookingService } from 'src/app/services/booking.service';

@Component({
  selector: 'app-bookings',
  templateUrl: './bookings.component.html',
  styleUrls: ['./bookings.component.css']
})
export class BookingsComponent implements OnInit {

  bookingDetails = null as any;

  constructor(private bookingService:BookingService) {
    this.getBookingsDetails();
  }

  ngOnInit(): void {
  }

  submit(bookingAddForm: NgForm){

    this.bookingService.registerBooking(bookingAddForm.value).subscribe(
      // {
      // next: (v) => console.log(v),
      // error: (e) => console.error(e),
      // complete: () => console.info('complete')

      {
        next : (resp)=>{
          console.log(resp);
          bookingAddForm.reset();
          this.getBookingsDetails();
  
        },
        error : (err)=>{
          console.log(err);
        }
      }

  // }
  )
  }

  getBookingsDetails(){
    this.bookingService.getBookings().subscribe(
      {
        next : (resp) => {
          console.log(resp);
          this.bookingDetails=resp;
        },
        error : (err) => {
          console.log(err);
        }
      }
      //   {
      //   next: (h) => console.log(h),
      //   error: (g) => console.error(g),
      //   complete: () => console.info('Fetched')
      // }
    )
  }

}

