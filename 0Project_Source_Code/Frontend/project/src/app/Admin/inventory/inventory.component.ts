import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { InventoryService } from '../../services/inventory.service';

@Component({
  selector: 'app-inventory',
  templateUrl: './inventory.component.html',
  styleUrls: ['./inventory.component.css']
})
export class InventoryComponent implements OnInit {

  inventoryDetails = null as any;
  inventoryToUpdate={
    ingredientId:"",
    ingredientName:"",
    type:"",
    ingredientQuantity:"",
    supplierId:""
  };

  constructor(private inventoryService:InventoryService) {
    this.getInventorysDetails();
  }

  ngOnInit(): void {
  }

  onSubmit(inventoryAddForm: NgForm){

    this.inventoryService.registerInventory(inventoryAddForm.value).subscribe(
      // {
      // next: (v) => console.log(v),
      // error: (e) => console.error(e),
      // complete: () => console.info('complete')

      {
        next : (resp)=>{
          console.log(resp);
          inventoryAddForm.reset();
          this.getInventorysDetails();
  
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

  getInventorysDetails(){
    this.inventoryService.getInventorys().subscribe(
      {
        next : (resp) => {
          console.log(resp);
          this.inventoryDetails=resp;
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

  deleteInventory(inventory : any){
    this.inventoryService.deleteInventory(inventory.inventoryId).subscribe(

      {
        next : (resp) => {
          console.log(resp);
          this.getInventorysDetails();
        },
        error : (err) => {
          console.log(err);
        }
      }

    );
  }

  edit(inventory:any){
    this.inventoryToUpdate=inventory;
  }

  updateInventory(){
    this.inventoryService.updateInventory(this.inventoryToUpdate).subscribe(
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
