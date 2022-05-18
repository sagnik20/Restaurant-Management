import { Component, OnInit } from '@angular/core';
import { ServiceService } from 'src/app/service/service.service';

@Component({
  selector: 'app-list-of-chef',
  templateUrl: './list-of-chef.component.html',
  styleUrls: ['./list-of-chef.component.css']
})
export class ListOfChefComponent implements OnInit {

  constructor(private service:ServiceService) { }

  ngOnInit() {

    this.service.listOfChefs().subscribe(
      data=>console.log("response done")
    )
  }

}
