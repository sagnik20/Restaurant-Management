import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-cheflogin',
  templateUrl: './cheflogin.component.html',
  styleUrls: ['./cheflogin.component.css']
})
export class ChefloginComponent implements OnInit {

  constructor( private route:Router) { }

  ngOnInit(): void {
  }
  chefDash(){
    this.route.navigate(['/chef-dash'])

  }

}
