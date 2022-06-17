import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class OrderService {

  constructor(private http: HttpClient) { }

  API = "http://localhost:8090"
  public registerOrder(orderData: any){
    return this.http.post(this.API+ '/registerMenu' , orderData);
  }

  public getOrderStatus(){
    return this.http.get(this.API + '/getOrderStatuss');
  }

  public deleteOrderStatus(orderId: any){
    return this.http.delete(this.API + '/deleteOrderStatus?orderId=' + orderId)
  }

  
}
