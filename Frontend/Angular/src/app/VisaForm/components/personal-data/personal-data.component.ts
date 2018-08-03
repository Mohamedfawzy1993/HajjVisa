import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {Router} from '@angular/router';
import {PageNumbers} from '../../../infrastructure/data/page-numbers.enum';
import {VisaObjectService} from '../../shared/service/visa-object.service';
import {FormComponent} from '../form/form.component';


@Component({
  selector: 'app-personal-data',
  templateUrl: './personal-data.component.html',
  styleUrls: ['./personal-data.component.css']
})
export class PersonalDataComponent implements OnInit {
  @Output() stepEmitter = new EventEmitter();
  pageNumber = PageNumbers;

  constructor() {
  }

  getVisaFormDTO() {
    return FormComponent.visaFormDTO;

  }

  ngOnInit() {

  }

  onSubmit(number) {
    console.log(this.getVisaFormDTO().userData.userId);
    console.log('Invoked');
    this.stepEmitter.emit(number);
  }

}
