import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { MatIconModule } from  '@angular/material/icon';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './shared/navbar/navbar.component';
import { FooterComponent } from './shared/footer/footer.component';
import { HomeComponent } from './home/home.component';
import { BookingsComponent } from './customer/bookings/bookings.component';
import { HygieneComponent } from './customer/hygiene/hygiene.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatDatepickerModule} from '@angular/material/datepicker';
import { FormsModule } from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms';
import { LoginComponent } from './Authentication/login/login.component';
import { MatDialogModule } from '@angular/material/dialog';
import { SignupComponent } from './Authentication/signup/signup.component';

import { MatInputModule } from '@angular/material/input';
import { MatFormFieldModule } from '@angular/material/form-field';

import { MatButtonModule } from '@angular/material/button';
import { MenuPageComponent } from './customer/menu-page/menu-page.component';
// import { BodyComponent } from './body/body.component';
import { HttpClientModule } from '@angular/common/http';
import { SearchComponent } from './customer/search/search.component';

import { TagsComponent } from './customer/tags/tags.component';
import {CartPageComponent} from './customer/cart-page/cart-page.component';
import { FoodPageComponent } from './customer/food-page/food-page.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import {RatingModule} from 'ng-starrating';
import { MDBBootstrapModule } from 'angular-bootstrap-md';
import {MatSnackBarModule} from '@angular/material/snack-bar';
import { CustomerComponent } from './customer/customer.component';
import { CustomerNavbarComponent } from './customer/customer-navbar/customer-navbar.component';
import { DashboardComponent } from './Admin/dashboard/dashboard.component';
import { AdminNavbarComponent } from './Admin/admin-navbar/admin-navbar.component';
import { FeedbackComponent } from './Admin/feedback/feedback.component';
import { InventoryComponent } from './Admin/inventory/inventory.component';
import { BookingComponent } from './Admin/booking/booking.component';
import { OrderComponent } from './Admin/order/order.component';
import { StaffComponent } from './Admin/staff/staff.component';
import { MenuComponent } from './Admin/menu/menu.component';
import { SupplierComponent } from './Admin/supplier/supplier.component';
// import { AdminComponent } from './Admin/admin.component';
import { BodyComponent } from './Admin/body/body.component';
import { CustomersComponent } from './Admin/customers/customers.component';


@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    FooterComponent,
    HomeComponent,
    BookingsComponent,
    HygieneComponent,
    LoginComponent,
    SignupComponent,
    MenuPageComponent,
    // BodyComponent,
    SearchComponent,
    TagsComponent,
    CartPageComponent,
    FoodPageComponent,
    CustomerComponent,
    CustomerNavbarComponent,
    DashboardComponent,
    AdminNavbarComponent,
    FeedbackComponent,
    InventoryComponent,
    BookingComponent,
    OrderComponent,
    StaffComponent,
    MenuComponent,
    SupplierComponent,
    
    BodyComponent,
    CustomersComponent
   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatDatepickerModule,
    FormsModule,
    ReactiveFormsModule,
    MatDialogModule,
    MatButtonModule,
    MatFormFieldModule,
    MatInputModule,
    MatIconModule,
    HttpClientModule,
    NgbModule,
    RatingModule,
    MDBBootstrapModule.forRoot(),
    MatSnackBarModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
