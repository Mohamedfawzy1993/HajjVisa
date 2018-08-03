import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {PageNumbers} from '../../../infrastructure/data/page-numbers.enum';
import {FormComponent} from '../form/form.component';
import {VisaFormService} from '../../service/visa-form.service';

@Component({
  selector: 'app-visa-payment',
  templateUrl: './visa-payment.component.html',
  styleUrls: ['./visa-payment.component.css']
})
export class VisaPaymentComponent implements OnInit {

  constructor(private visaService: VisaFormService) {
  }

  @Output() stepEmitter = new EventEmitter();
  pageNumber = PageNumbers;

  ngOnInit() {
  }

  getVisaFormDTO() {
    return FormComponent.visaFormDTO;
  }

  onSubmit(number) {
    this.visaService.saveForm(this.getVisaFormDTO()).subscribe(
      success => {
        console.log(success);
        console.log('Invoked');
        this.stepEmitter.emit(number);
        this.getVisaFormDTO().visaData = success;
      },
      fail => {
        console.log(fail);
      }
    );


  }
}
