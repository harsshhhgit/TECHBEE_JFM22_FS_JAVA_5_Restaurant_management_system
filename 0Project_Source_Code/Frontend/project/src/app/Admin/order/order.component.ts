import { Component, OnInit } from '@angular/core';
import { OrderService } from '../../services/order.service';

@Component({
  selector: 'app-order',
  templateUrl: './order.component.html',
  styleUrls: ['./order.component.css']
})
export class OrderComponent implements OnInit {

  orderDetails = null as any;
  colorForStatus=['COMPLETED', 'PENDING', 'CANCELLED']
  orderToUpdate={
    orderId:"",
    customerId:"",
    location:"",
    status:"",
    price:""
  };

  ngOnInit(): void {
  }

  constructor(private orderService:OrderService) {
    this.getOrdersDetails();
  }

  getOrdersDetails(){
    this.orderService.getOrderStatus().subscribe(
      {
        next : (resp) => {
          console.log(resp);
          this.orderDetails=resp;
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

}
