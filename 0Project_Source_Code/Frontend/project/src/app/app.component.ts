import { Component } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { Router } from '@angular/router';
import { LoginComponent } from './Authentication/login/login.component';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'UserModule';
  constructor(private router:Router){

  }
//  admin(){

//   this.router.navigate(["/admin"]);
//  }
//  user(){

//  }
}
