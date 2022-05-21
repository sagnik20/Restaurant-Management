import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceService } from 'src/app/service/service.service';

@Component({
  selector: 'app-list-of-chef',
  templateUrl: './list-of-chef.component.html',
  styleUrls: ['./list-of-chef.component.css']
})
export class ListOfChefComponent implements OnInit {

  constructor(private service:ServiceService,private http:HttpClient,private route:Router) { }

  chefs :any;
  ngOnInit() {
    let response=this.http.get("http://localhost:8081/getlistofchefs");
    response.subscribe((data)=>this.chefs=data)
      
    
  }
  addcheff(){
    this.route.navigate(['/add-chef'])

  }

}
