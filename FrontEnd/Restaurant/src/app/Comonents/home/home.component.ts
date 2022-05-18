import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor(private route:Router ) { }

  ngOnInit(): void {
  }
  addchef(){
    this.route.navigate(['/add-chef'])
  }
  loginadimn(){
    this.route.navigate(['/adminlogin'])
  }

  login(){
    this.route.navigate(['/login'])
  }
  loginchef(){
     this.route.navigate(['/cheflogin'])

  }
}
