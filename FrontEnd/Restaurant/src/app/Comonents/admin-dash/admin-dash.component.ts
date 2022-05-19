import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-admin-dash',
  templateUrl: './admin-dash.component.html',
  styleUrls: ['./admin-dash.component.css']
})
export class AdminDashComponent implements OnInit {

  constructor(private route: Router) { }

  ngOnInit(): void {
  }
returnhome(){
  this.route.navigate(['/home'])
}
listofchef(){
  this.route.navigate(['/list-of-chef'])
}
listofitems(){
  this.route.navigate(['/viewItems'])
}
}
