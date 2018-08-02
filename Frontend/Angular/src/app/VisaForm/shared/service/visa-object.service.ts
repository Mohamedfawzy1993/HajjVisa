import {Injectable} from '@angular/core';
import {VisaVTO} from '../data/visa-vto';

@Injectable({
  providedIn: 'root'
})
export class VisaObjectService {

  visaObj: VisaVTO;

  constructor() {
  }

  setVisaObj(visaObj: VisaVTO) {
    this.visaObj = visaObj;
  }

  getVisaObj(): VisaVTO {
    return this.visaObj;
  }

}
