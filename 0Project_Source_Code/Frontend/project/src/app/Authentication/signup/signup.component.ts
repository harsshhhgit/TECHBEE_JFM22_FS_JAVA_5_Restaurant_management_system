import { Component, OnInit } from '@angular/core';
import { AbstractControl, FormBuilder, FormControl, FormGroup, ValidationErrors, ValidatorFn, Validators } from '@angular/forms';
import { UserServiceService } from '../../services/user-service.service';
import { Router } from '@angular/router';
import { NewUser } from '../../shared/models/NewUser';
import swal from 'sweetalert2';
import {MatSnackBar, MatSnackBarModule} from '@angular/material/snack-bar';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  newUser:NewUser = new NewUser();
  constructor(private formBuilder:FormBuilder, private router:Router,private userService:UserServiceService,private snack:MatSnackBar) { }
  registerForm!: FormGroup;
 
  ngOnInit(): void {
    this.registerForm = this.formBuilder.group({
      password: ['', Validators.compose([
        Validators.required,
        Validators.minLength(8),
        Validators.pattern("^(?=.*[A-Z])(?=.*[0-9])(?=.*[a-z]).{8,}$"),
         
      ])],
      mobile: ['', Validators.compose([
        Validators.required,
        Validators.pattern("[6-9]{1}[0-9]{9}")
       
      ])],
      name: ['', Validators.compose([
        Validators.required,
       
      ])],
      address: ['', Validators.compose([
        Validators.required,
      ])],
      // confirmPassword: ['', Validators.compose([
      //   Validators.required,
       
      // ])],
      email: ['', Validators.compose([
        Validators.required,
      ])],
     
    }
    
    );
    
  }
  
 
  registerUser(){
    console.log(this.newUser);
    this.userService.signUp(this.newUser).subscribe(
      (data) => {
        console.log(data);
       swal.fire('Success','User is successfully registered','success');
      },
      (error) => {
        console.log(error);
        this.snack.open("User is already exist",'',{
          duration:3000,
          verticalPosition: 'top',
        });
        
      }
    )
  }
  
  
  
}
