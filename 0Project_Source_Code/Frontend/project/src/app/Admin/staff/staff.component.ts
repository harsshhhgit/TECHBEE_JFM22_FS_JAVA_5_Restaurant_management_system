import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { StaffService } from '../../services/staff.service';

@Component({
  selector: 'app-staff',
  templateUrl: './staff.component.html',
  styleUrls: ['./staff.component.css']
})
export class StaffComponent implements OnInit {

  staffDetails = null as any;
  staffToUpdate={
    id:"",
    firstName:"",
    lastName:"",
    emailId:"",
    designation:"",
    phoneNumber:""
  };

  ngOnInit(): void {
  }

  constructor(private staffService:StaffService) {
    this.getStaffsDetails();
  }

  onSubmit(staffAddForm: NgForm){

    this.staffService.registerStaff(staffAddForm.value).subscribe(
      // {
      // next: (v) => console.log(v),
      // error: (e) => console.error(e),
      // complete: () => console.info('complete')

      {
        next : (resp)=>{
          console.log(resp);
          staffAddForm.reset();
          this.getStaffsDetails();
  
        },
        error : (err)=>{
          console.log(err);
        }
      }

  // }
  )
    // console.log(staffAddForm);
    // // console.log("Staff ID : ",staffAddForm.value.staffId);
    // console.log("Staff First Name : ",staffAddForm.value.staffFirstName);
    // console.log("Staff Last Name : ",staffAddForm.value.staffLastName);
    // console.log("Staff Mail : ",staffAddForm.value.staffMail);
    // console.log("Staff Designation : ",staffAddForm.value.staffDesg);
    // console.log("Staff Number : ",staffAddForm.value.staffNumber);
  }

  getStaffsDetails(){
    this.staffService.getStaffs().subscribe(
      {
        next : (resp) => {
          console.log(resp);
          this.staffDetails=resp;
        },
        error : (err) => {
          console.log(err);
        }
      }
      //   {
      //   next: (h) => console.log(h),
      //   error: (g) => console.error(g),
      //   complete: () => console.info('Fetched')
      // }
    )
  }

  deleteStaff(staff : any){
    this.staffService.deleteStaff(staff.id).subscribe(

      {
        next : (resp) => {
          console.log(resp);
          this.getStaffsDetails();
        },
        error : (err) => {
          console.log(err);
        }
      }

    );
  }

  edit(staff:any){
    this.staffToUpdate=staff;
  }

  updateStaff(){
    this.staffService.updateStaff(this.staffToUpdate).subscribe(
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
