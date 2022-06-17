import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class SupplierService {

  constructor(private http: HttpClient) { }

  API = "http://localhost:8090"
  public registerSupplier(supplierData: any){
    return this.http.post(this.API+ '/registerSupplier' , supplierData);
  }

  public getSuppliers(){
    return this.http.get(this.API + '/getSuppliers');
  }

  public deleteSupplier(supplierId: any){
    return this.http.delete(this.API + '/deleteSupplier?supplierId=' + supplierId)
  }

  public updateSupplier(supplier: any){
    return this.http.put(this.API + '/updateSupplier', supplier);
  }
  
}
