import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-additem',
  templateUrl: './additem.component.html',
  styleUrls: ['./additem.component.css']
})
export class AdditemComponent implements OnInit {

  constructor(private route:Router) { }
  public msg="chef Added successfully"

  ngOnInit(): void {
  }
  addnewitem(){
    alert(this.msg)
    this.route.navigate(['/viewItems'])

  }
  returnhome(){
    this.route.navigate(['./home'])
  }
}
