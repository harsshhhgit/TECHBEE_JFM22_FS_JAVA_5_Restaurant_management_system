import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class InventoryService {

  constructor(private http: HttpClient) { }

  API = "http://localhost:8090"
  public registerInventory(inventoryData: any){
    return this.http.post(this.API+ '/registerInventory' , inventoryData);
  }

  public getInventorys(){
    return this.http.get(this.API + '/getInventorys');
  }

  public deleteInventory(inventoryId: any){
    return this.http.delete(this.API + '/deleteInventory?inventoryId=' + inventoryId)
  }

  public updateInventory(inventory: any){
    return this.http.put(this.API + '/updateInventory', inventory);
  }
}
