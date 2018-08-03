import { Component, OnInit } from '@angular/core';
import {FormComponent} from '../form/form.component';

@Component({
  selector: 'app-success',
  templateUrl: './success.component.html',
  styleUrls: ['./success.component.css']
})
export class SuccessComponent implements OnInit {

  visaIssueNumber: String;
  constructor() { }

  ngOnInit() {
    this.visaIssueNumber = this.getVisaFormDTO().visaData.visaId.toString();
  }
  getVisaFormDTO() {
    return FormComponent.visaFormDTO;
  }

}
