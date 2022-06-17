import { NgModule } from '@angular/core';
// import { FormsModule } from '@angular/forms';
import { RouterModule, Routes } from '@angular/router';
import { CartPageComponent } from './customer/cart-page/cart-page.component';
import { FoodPageComponent } from './customer/food-page/food-page.component';

import { MenuPageComponent } from './customer/menu-page/menu-page.component';

import { BookingsComponent } from './customer/bookings/bookings.component';
import { HomeComponent } from './home/home.component';
import { HygieneComponent } from './customer/hygiene/hygiene.component';
import { CustomerComponent } from './customer/customer.component';
import { SignupComponent } from './Authentication/signup/signup.component';
import { LoginComponent } from './Authentication/login/login.component';
// import { AdminComponent } from './Admin/admin.component';
import { BookingComponent } from './Admin/booking/booking.component';
import { FeedbackComponent } from './Admin/feedback/feedback.component';
import { CustomersComponent } from './Admin/customers/customers.component';
import { MenuComponent } from './Admin/menu/menu.component';
import { OrderComponent } from './Admin/order/order.component';
import { SupplierComponent } from './Admin/supplier/supplier.component';
import { InventoryComponent } from './Admin/inventory/inventory.component';
import { DashboardComponent } from './Admin/dashboard/dashboard.component';
import { StaffComponent } from './Admin/staff/staff.component';


const routes: Routes = [
  {path:'',component:HomeComponent},
  
  {path:'customer',component:CustomerComponent},
  {path:'booking',component:BookingsComponent},
  {path:'hygiene',component:HygieneComponent},
  {path:'menu-page',component:MenuPageComponent},
  {path:'search/:searchItem', component:MenuPageComponent},
  {path:'tag/:tag', component:MenuPageComponent},
  {path:'food/:id', component:FoodPageComponent},
  {path:'cart-page', component:CartPageComponent},
  {path:'login', component:LoginComponent},
  {path:'signup', component:SignupComponent},
  // {path:'admin', component:AdminComponent},
  {path:'dashboard', component:DashboardComponent},
  {path:'admin-booking', component:BookingComponent},
  {path:'feedback', component:FeedbackComponent},
  {path:'customers', component:CustomersComponent},
  {path:'menu', component:MenuComponent},
  {path:'orderStatus', component:OrderComponent},
  {path:'supplier', component:SupplierComponent},
  {path:'inventory', component:InventoryComponent},
  {path:'customers', component:CustomersComponent},
  {path:'staff', component:StaffComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
