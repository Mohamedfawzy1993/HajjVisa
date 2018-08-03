import {Component, OnInit} from '@angular/core';
import {VisaDTO} from '../../shared/data/dto/visa-dto';
import {VisaSearch} from '../service/visaSearch';
import {DomSanitizer} from '@angular/platform-browser';

@Component({
  selector: 'app-visa-search',
  templateUrl: './visa-search.component.html',
  styleUrls: ['./visa-search.component.css']
})
export class VisaSearchComponent implements OnInit {

  visaObj: VisaDTO;
  visaNumber: String;
  passportNumber: String;
  isFound = false;
  isSearched = false;
  constructor(private visaSearch: VisaSearch , private sanitizer:DomSanitizer) {
  }

  ngOnInit() {
  }

  onSearch() {
    this.visaSearch.checkVisa(this.passportNumber, this.visaNumber).subscribe(
      success => {
        this.visaObj = success;
        if (this.visaObj.passportPassportId != this.passportNumber)
          this.isFound = false;
        else
          this.isFound = true;
          this.isSearched = true;
          console.log(this.visaObj);
      }
      ,
      fail =>  {
        console.log(fail);
        this.isSearched = true;
      }
    );
  }
  sanitize(url:string){
    return this.sanitizer.bypassSecurityTrustUrl(url);
  }
}
