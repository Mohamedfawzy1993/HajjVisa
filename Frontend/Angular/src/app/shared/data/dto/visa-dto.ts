import {UserDTO} from './user-dto';

export class VisaDTO {

  visaId: number;
  visaType: string;
  validity: number;
  issueDate: Date;
  durationOfStay: number;
  issueOffice: string;
  fees: string;
  numberOfEntries: number;
  companion: number;
  workPermit: number;
  visaOfficer: string;
  visaStatus: string = 'Pending';
  passportPassportId: string;
  agencyNumber: string;
  paymentNumber: string;
  visaURL: String;
  user: UserDTO;
}
