import { Component, OnInit } from '@angular/core';
import { CustomerService } from '../../services/customer.service';

@Component({
  selector: 'app-customers',
  templateUrl: './customers.component.html',
  styleUrls: ['./customers.component.css']
})
export class CustomersComponent implements OnInit {

  customerDetails = null as any;

  constructor(private customerService:CustomerService) {
    this.getCustomersDetails();
  }

  ngOnInit(): void {
  }

  getCustomersDetails(){
    this.customerService.getCustomer().subscribe(
      {
        next : (resp) => {
          console.log(resp);
          this.customerDetails=resp;
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

  deleteCustomer(customer : any){
    this.customerService.deleteCustomer(customer.id).subscribe(

      {
        next : (resp) => {
          console.log(resp);
          this.getCustomersDetails();
        },
        error : (err) => {
          console.log(err);
        }
      }

    );
  }

}