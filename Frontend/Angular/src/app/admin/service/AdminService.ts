import { Injectable } from '@angular/core';
import {HttpClient, HttpParams} from '@angular/common/http';
import {VisaFormDTO} from '../../shared/data/dto/visa-form-dto';
import {VisaDTO} from '../../shared/data/dto/visa-dto';

@Injectable()
export class AdminService {

  constructor(private http: HttpClient) { }

  BASE_URL = 'http://localhost:8181/';
  SAVE_FORM_URL = this.BASE_URL + 'visas';
  VISA_USER_URL = this.BASE_URL + 'visas/user'

  getAllVisaRequests() {
    return this.http.get(this.SAVE_FORM_URL);
  }

  getUserOfVisa(userID) {
    let params = new HttpParams().set('passport' , userID);
    return this.http.get(this.VISA_USER_URL , {params:params});
  }
}
;
