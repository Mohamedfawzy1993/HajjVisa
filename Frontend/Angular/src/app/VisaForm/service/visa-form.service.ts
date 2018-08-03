import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {VisaFormDTO} from '../../shared/data/dto/visa-form-dto';
import {VisaDTO} from '../../shared/data/dto/visa-dto';

@Injectable()
export class VisaFormService {

  constructor(private http: HttpClient) { }

  BASE_URL = 'http://localhost:8181/';
  SAVE_FORM_URL = this.BASE_URL + 'visa';

  saveForm(visaForm: VisaFormDTO) {
    return this.http.post<VisaDTO >(this.SAVE_FORM_URL , visaForm);
  }


}
