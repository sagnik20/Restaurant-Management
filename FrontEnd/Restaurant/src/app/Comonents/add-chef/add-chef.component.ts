import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add-chef',
  templateUrl: './add-chef.component.html',
  styleUrls: ['./add-chef.component.css']
})
export class AddChefComponent implements OnInit {

  constructor( private route:Router) { }

  ngOnInit(): void {
  }
  returnhome(){
    this.route.navigate(['/home']);

  }
}
