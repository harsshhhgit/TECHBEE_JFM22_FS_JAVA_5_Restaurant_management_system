import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class StaffService {

  constructor(private http: HttpClient) { }

  API = "http://localhost:8090"
  public registerStaff(staffData: any){
    return this.http.post(this.API+ '/registerStaff' , staffData);
  }

  public getStaffs(){
    return this.http.get(this.API + '/getStaffs');
  }

  public deleteStaff(id: any){
    return this.http.delete(this.API + '/deleteStaff?id=' + id)
  }

  public updateStaff(staff: any){
    return this.http.put(this.API + '/updateStaff', staff);
  }

}
