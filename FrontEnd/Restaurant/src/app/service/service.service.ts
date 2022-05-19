import { Injectable } from '@angular/core';

import {HttpClient} from '@angular/common/http'
import { Observable } from 'rxjs';
import { Headchef } from '../common/headchef';
import { observableToBeFn } from 'rxjs/internal/testing/TestScheduler';
@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  constructor(private _http:HttpClient) { }

  listOfChefs():Observable<any>{
    return this._http.get<any>("http://localhost:8080/getlistofchefs")

  }
  addchef(chef :Headchef):Observable<any>{
    return this._http.post<any>("http://localhost:8080/addchef",chef)

  }
  getAllChefs(){
    return this._http.get<any>("http://localhost:8081/getlistofchefs")

  }
}
