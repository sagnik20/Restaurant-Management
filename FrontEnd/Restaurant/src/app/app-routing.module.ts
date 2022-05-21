import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddChefComponent } from './Comonents/add-chef/add-chef.component';
import { AdditemComponent } from './Comonents/additem/additem.component';
import { AdminDashComponent } from './Comonents/admin-dash/admin-dash.component';
import { AdminloginComponent } from './Comonents/adminlogin/adminlogin.component';
import { ChefDashComponent } from './Comonents/chef-dash/chef-dash.component';
import { ChefloginComponent } from './Comonents/cheflogin/cheflogin.component';
import { HomeComponent } from './Comonents/home/home.component';
import { ListOfChefComponent } from './Comonents/list-of-chef/list-of-chef.component';
import { LoginComponent } from './Comonents/login/login.component';
import { ViewItemsComponent } from './Comonents/view-items/view-items.component';
import { ViewOrdersComponent } from './Comonents/view-orders/view-orders.component';


const routes: Routes = [
  {path:"",component:HomeComponent},
  {path:"add-chef",component:AddChefComponent},
  {path:"admin-dash",component:AdminDashComponent},
  {path:"list-of-chef",component:ListOfChefComponent},
  {path:"home",component:HomeComponent},
  {path:"login",component:LoginComponent},
  {path:"chef-dash",component:ChefDashComponent},
  {path:"adminlogin",component:AdminloginComponent},
  {path:"cheflogin",component:ChefloginComponent},
  {path:"viewItems",component:ViewItemsComponent},
  {path:"viewOrders",component:ViewOrdersComponent},
  {path:"additem",component:AdditemComponent}
  

 
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
