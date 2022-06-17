import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { MenuService } from '../../services/menu.service';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {


  // selectedFile:any = null;
  // onFileSelected(event:any){
  //   this.selectedFile = <File>event.target.files[0];
  // }

  menuDetails = null as any;
  menuToUpdate={
    menuId:"",
    name:"",
    url:"",
    // picture:"",
    quantity:"",
    status:"",
    price:""
  };

  // public onFileChanged(event:any) {
  //   //Select File
  //   this.selectedFile = event.target.files[0];
  // }

  constructor(private menuService:MenuService) {
    this.getMenusDetails();
  }
  
  ngOnInit(): void {
  }

  onSubmit(menuAddForm: NgForm){

    this.menuService.registerMenu(menuAddForm.value).subscribe(
      // {
      // next: (v) => console.log(v),
      // error: (e) => console.error(e),
      // complete: () => console.info('complete')

      {
        next : (resp)=>{
          console.log(resp);
          menuAddForm.reset();
          this.getMenusDetails();
  
        },
        error : (err)=>{
          console.log(err);
        }
      }

  // }
  )
    // console.log(menuAddForm);
    // // console.log("menu ID : ",menuAddForm.value.menuId);
    // console.log("menu First Name : ",menuAddForm.value.menuFirstName);
    // console.log("menu Last Name : ",menuAddForm.value.menuLastName);
    // console.log("menu Mail : ",menuAddForm.value.menuMail);
    // console.log("menu Designation : ",menuAddForm.value.menuDesg);
    // console.log("menu Number : ",menuAddForm.value.menuNumber);
  }

  getMenusDetails(){
    this.menuService.getMenus().subscribe(
      {
        next : (resp) => {
          console.log(resp);
          this.menuDetails=resp;
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

  deleteMenu(menu : any){
    this.menuService.deleteMenu(menu.menuId).subscribe(

      {
        next : (resp) => {
          console.log(resp);
          this.getMenusDetails();
        },
        error : (err) => {
          console.log(err);
        }
      }

    );
  }

  edit(menu:any){
    this.menuToUpdate=menu;
  }

  updateMenu(){
    this.menuService.updateMenu(this.menuToUpdate).subscribe(
      {
        next : (resp) => {
          console.log(resp);
        },
        error : (err) => {
          console.log(err);
        }
      }
    );
  }

}
