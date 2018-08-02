import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {Router} from '@angular/router';
import {PageNumbers} from '../../infrastructure/data/page-numbers.enum';


@Component({
  selector: 'app-personal-data',
  templateUrl: './personal-data.component.html',
  styleUrls: ['./personal-data.component.css']
})
export class PersonalDataComponent implements OnInit {
  @Output() stepEmitter = new EventEmitter();
  pageNumber = PageNumbers;

  constructor(private router: Router) {
  }

  ngOnInit() {
  }

  onSubmit(number) {
    console.log('Invoked');
    this.stepEmitter.emit(number);
  }

}
