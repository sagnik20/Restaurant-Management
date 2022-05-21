import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-view-orders',
  templateUrl: './view-orders.component.html',
  styleUrls: ['./view-orders.component.css']
})
export class ViewOrdersComponent implements OnInit {

  constructor(private http:HttpClient) { }
  orders:any;

  ngOnInit(): void {
    let response=this.http.get("http://localhost:8081/getOrders");
    response.subscribe((data)=>this.orders=data)
  }

}
