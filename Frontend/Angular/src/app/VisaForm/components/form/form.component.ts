import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css']
})
export class FormComponent implements OnInit {

  static stepNumber: number = 6;

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
