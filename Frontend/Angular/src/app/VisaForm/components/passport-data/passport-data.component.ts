import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {PageNumbers} from '../../../infrastructure/data/page-numbers.enum';
import {FormComponent} from '../form/form.component';

@Component({
  selector: 'app-passport-data',
  templateUrl: './passport-data.component.html',
  styleUrls: ['./passport-data.component.css']
})
export class PassportDataComponent implements OnInit {
  @Output() stepEmitter = new EventEmitter();
  constructor() { }
  pageNumber = PageNumbers;

  ngOnInit() {
  }

  onSubmit(number) {
    console.log('Invoked');
    console.log(this.getVisaFormDTO());

    this.stepEmitter.emit(number);
  }

  getVisaFormDTO() {
    return FormComponent.visaFormDTO;

  }
}
