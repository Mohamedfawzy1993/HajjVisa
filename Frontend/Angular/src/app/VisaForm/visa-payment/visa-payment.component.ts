import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {PageNumbers} from '../../infrastructure/data/page-numbers.enum';

@Component({
  selector: 'app-visa-payment',
  templateUrl: './visa-payment.component.html',
  styleUrls: ['./visa-payment.component.css']
})
export class VisaPaymentComponent implements OnInit {

  constructor() { }
  @Output() stepEmitter = new EventEmitter();
  pageNumber = PageNumbers;

  ngOnInit() {
  }
  onSubmit(number) {
    console.log('Invoked');
    this.stepEmitter.emit(number);
  }
}
