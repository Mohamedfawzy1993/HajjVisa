import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {PageNumbers} from '../../../infrastructure/data/page-numbers.enum';

@Component({
  selector: 'app-national-id',
  templateUrl: './national-id.component.html',
  styleUrls: ['./national-id.component.css']
})
export class NationalIDComponent implements OnInit {
  @Output() stepEmitter = new EventEmitter();
  pageNumber = PageNumbers;

  constructor() {
  }

  ngOnInit() {
  }

  onSubmit(number) {
    console.log('Invoked');
    this.stepEmitter.emit(number);
  }
}
