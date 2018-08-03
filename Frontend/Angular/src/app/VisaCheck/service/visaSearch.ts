import { Injectable } from '@angular/core';
import {HttpClient, HttpParams} from '@angular/common/http';
import {VisaFormDTO} from '../../shared/data/dto/visa-form-dto';
import {VisaDTO} from '../../shared/data/dto/visa-dto';

@Injectable()
export class VisaSearch {

  constructor(private http: HttpClient) { }

  BASE_URL = 'http://localhost:8181/';
  SAVE_FORM_URL = this.BASE_URL + 'check';

  checkVisa(passportNumber , visaNumber) {
    let params: HttpParams = new HttpParams().set('visa', visaNumber.toString());

    return this.http.get<VisaDTO>(this.SAVE_FORM_URL , {params: params});
  }


}
