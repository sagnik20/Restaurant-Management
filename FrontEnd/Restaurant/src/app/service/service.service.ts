import { Injectable } from '@angular/core';

import {HttpClient} from '@angular/common/http'
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  constructor(private _http:HttpClient) { }

  listOfChefs():Observable<any>{
    return this._http.get<any>("http://localhost:8080/getlistofchefs")

  }
}
