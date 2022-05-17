import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './Comonents/home/home.component';
import { AddChefComponent } from './Comonents/add-chef/add-chef.component';
import { AdminDashComponent } from './Comonents/admin-dash/admin-dash.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    AddChefComponent,
    AdminDashComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
