import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddChefComponent } from './Comonents/add-chef/add-chef.component';
import { AdminDashComponent } from './Comonents/admin-dash/admin-dash.component';
import { HomeComponent } from './Comonents/home/home.component';
import { ListOfChefComponent } from './Comonents/list-of-chef/list-of-chef.component';

const routes: Routes = [
  {path:"home",component:HomeComponent},
  {path:"add-chef",component:AddChefComponent},
  {path:"admin-dash",component:AdminDashComponent},
  {path:"list-of-chef",component:ListOfChefComponent}
 
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
