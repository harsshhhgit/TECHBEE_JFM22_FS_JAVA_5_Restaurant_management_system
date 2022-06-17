import { Component, OnInit } from '@angular/core';
import { LoginComponent } from '../../Authentication/login/login.component';
import {MatDialog} from '@angular/material/dialog';
@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent  {

  constructor(private dialogRef : MatDialog){}
  openDialog(){
    this.dialogRef.open(LoginComponent);
  }
  

}


