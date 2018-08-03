import {Injectable} from '@angular/core';
import {VisaVTO} from '../data/visa-vto';
import {VisaFormDTO} from '../../../shared/data/dto/visa-form-dto';

@Injectable()
export class VisaObjectService {

  visaObj: VisaFormDTO;

  constructor() {
  }

  getVisaObj(): VisaFormDTO {
    return this.visaObj;
  }

}
