import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class BookingService {

  constructor(private http: HttpClient) { }

  API = "http://localhost:8090"
  public registerBooking(bookingData: any){
    return this.http.post(this.API+ '/registerBooking' , bookingData);
  }

  public getBookings(){
    return this.http.get(this.API + '/getBookings');
  }

  public deleteBooking(bookingId: any){
    return this.http.delete(this.API + '/deleteBooking?bookingId=' + bookingId)
  }

  public updateBooking(booking: any){
    return this.http.put(this.API + '/updateBooking', booking);
  }
  
}
