import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class MenuService {

  constructor(private http: HttpClient) { }

  API = "http://localhost:8090"
  public registerMenu(menuData: any){
    return this.http.post(this.API+ '/registerMenu' , menuData);
  }

  public getMenus(){
    return this.http.get(this.API + '/getMenus');
  }

  public deleteMenu(menuId: any){
    return this.http.delete(this.API + '/deleteMenu?menuId=' + menuId)
  }

  public updateMenu(menu: any){
    return this.http.put(this.API + '/updateMenu', menu);
  }

}
