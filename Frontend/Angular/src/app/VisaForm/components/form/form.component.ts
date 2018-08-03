import {Component, OnInit} from '@angular/core';
import {VisaFormDTO} from '../../../shared/data/dto/visa-form-dto';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css']
})
export class FormComponent implements OnInit {

  static stepNumber: number = 6;
  static visaFormDTO: VisaFormDTO = new VisaFormDTO();
  ngOnInit(): void {
  }

  changePage(number) {
    console.log(number);
    FormComponent.stepNumber = parseInt(number, 10);
  }


  getStepNumber() {
    return FormComponent.stepNumber;
  }
}
