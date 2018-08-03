import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {PageNumbers} from '../../../infrastructure/data/page-numbers.enum';
import {VisaFormDTO} from '../../../shared/data/dto/visa-form-dto';
import {FormComponent} from '../form/form.component';
import {VisaObjectService} from '../../shared/service/visa-object.service';

@Component({
  selector: 'app-national-id',
  templateUrl: './national-id.component.html',
  styleUrls: ['./national-id.component.css']
})
export class NationalIDComponent implements OnInit {
  @Output() stepEmitter = new EventEmitter();
  pageNumber = PageNumbers;
  isValid = true;

  constructor() {
  }

  registerType: string = 'Individual';

  ngOnInit() {
  }

  getVisaFormDTO() {
    return FormComponent.visaFormDTO;
  }

  onSubmit(number) {
    console.log('Invoked');
    if (this.getVisaFormDTO().userData.userId == undefined || this.getVisaFormDTO().userData.userId == '') {
      this.isValid = false;
      return;
    } else if (this.registerType == 'Group' &&
      (this.getVisaFormDTO().visaData.agencyNumber == undefined || this.getVisaFormDTO().visaData.agencyNumber == '')) {
      return;
    } else {
      this.stepEmitter.emit(number);
    }
  }
}
