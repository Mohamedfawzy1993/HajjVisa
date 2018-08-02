import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {PageNumbers} from '../../infrastructure/data/page-numbers.enum';

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
    this.stepEmitter.emit(number);
  }
}
