import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {PageNumbers} from '../../../infrastructure/data/page-numbers.enum';

@Component({
  selector: 'app-visa-data',
  templateUrl: './visa-data.component.html',
  styleUrls: ['./visa-data.component.css']
})
export class VisaDataComponent implements OnInit {
  @Output() stepEmitter = new EventEmitter();
  pageNumber = PageNumbers;

  constructor() { }

  ngOnInit() {
  }
  onSubmit(number) {
    console.log('Invoked');
    this.stepEmitter.emit(number);
  }
}
