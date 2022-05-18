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

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    AddChefComponent,
    AdminDashComponent,
    ListOfChefComponent,
    IteamlistComponent,
    LoginComponent
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
