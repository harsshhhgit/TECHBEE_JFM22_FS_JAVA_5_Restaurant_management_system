import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { SupplierService } from '../../services/supplier.service';

@Component({
  selector: 'app-supplier',
  templateUrl: './supplier.component.html',
  styleUrls: ['./supplier.component.css']
})
export class SupplierComponent implements OnInit {

  supplierDetails = null as any;
  supplierToUpdate={
    supplierId:"",
    firstName:"",
    lastName:"",
    city:"",
    emailId:"",
    phoneNumber:""
  };

  constructor(private supplierService:SupplierService) {
    this.getSuppliersDetails();
  }

  ngOnInit(): void {
  }

  onSubmit(supplierAddForm: NgForm){

    this.supplierService.registerSupplier(supplierAddForm.value).subscribe(
      // {
      // next: (v) => console.log(v),
      // error: (e) => console.error(e),
      // complete: () => console.info('complete')

      {
        next : (resp)=>{
          console.log(resp);
          supplierAddForm.reset();
          this.getSuppliersDetails();
  
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

  getSuppliersDetails(){
    this.supplierService.getSuppliers().subscribe(
      {
        next : (resp) => {
          console.log(resp);
          this.supplierDetails=resp;
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

  deleteSupplier(supplier : any){
    this.supplierService.deleteSupplier(supplier.supplierId).subscribe(

      {
        next : (resp) => {
          console.log(resp);
          this.getSuppliersDetails();
        },
        error : (err) => {
          console.log(err);
        }
      }

    );
  }

  edit(supplier:any){
    this.supplierToUpdate=supplier;
  }

  updateSupplier(){
    this.supplierService.updateSupplier(this.supplierToUpdate).subscribe(
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
