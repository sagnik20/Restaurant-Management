import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-chef-dash',
  templateUrl: './chef-dash.component.html',
  styleUrls: ['./chef-dash.component.css']
})
export class ChefDashComponent implements OnInit {

  constructor(private route: Router) { }

  ngOnInit(): void {
  }
returnhome(){
  this.route.navigate(['/home'])
}
listofchef(){
  this.route.navigate(['/list-of-chef'])
}

}
