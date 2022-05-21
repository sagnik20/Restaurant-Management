import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './Comonents/home/home.component';
import { AddChefComponent } from './Comonents/add-chef/add-chef.component';
import { AdminDashComponent } from './Comonents/admin-dash/admin-dash.component';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { ListOfChefComponent } from './Comonents/list-of-chef/list-of-chef.component';
import {  HttpClientModule } from '@angular/common/http';
import { IteamlistComponent } from './Comonents/iteamlist/iteamlist.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { LoginComponent } from './Comonents/login/login.component';

import { AdminloginComponent } from './Comonents/adminlogin/adminlogin.component';
import { ChefloginComponent } from './Comonents/cheflogin/cheflogin.component';
import { ChefDashComponent } from './Comonents/chef-dash/chef-dash.component';
import { ViewOrdersComponent } from './Comonents/view-orders/view-orders.component';
import { ViewItemsComponent } from './Comonents/view-items/view-items.component';
import { AdditemComponent } from './Comonents/additem/additem.component';



@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    AddChefComponent,
    AdminDashComponent,
    ListOfChefComponent,
    IteamlistComponent,
    LoginComponent,
  
    AdminloginComponent,
    ChefloginComponent,
    ChefDashComponent,
    ViewOrdersComponent,
    ViewItemsComponent,
    AdditemComponent,
   

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FontAwesomeModule,
    HttpClientModule,
    BrowserAnimationsModule,
    
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
