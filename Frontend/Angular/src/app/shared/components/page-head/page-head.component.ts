import { Component, OnInit } from '@angular/core';
import {FormComponent} from '../../../VisaForm/components/form/form.component';

@Component({
  selector: 'app-page-head',
  templateUrl: './page-head.component.html',
  styleUrls: ['./page-head.component.css']
})
export class PageHeadComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

  toggleForm() {
    FormComponent.stepNumber = 1;
  }
}
