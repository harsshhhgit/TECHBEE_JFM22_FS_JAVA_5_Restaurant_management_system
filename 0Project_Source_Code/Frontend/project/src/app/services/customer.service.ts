import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  constructor(private http: HttpClient) { }

  API = "http://localhost:8090"
  public getCustomer(){
    return this.http.get(this.API + '/getUsers');
  }

  public deleteCustomer(id: any){
    return this.http.delete(this.API + '/deleteUser?id=' + id)
  }


}