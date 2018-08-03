import {VisaDTO} from './visa-dto';
import {PassportDTO} from './passport-d-t-o';
import {UserDTO} from './user-dto';

export class VisaFormDTO {

  visaData: VisaDTO = new VisaDTO();
  passportData: PassportDTO = new PassportDTO();
  userData: UserDTO = new UserDTO();
}
