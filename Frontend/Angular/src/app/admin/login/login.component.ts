import {Component, OnInit} from '@angular/core';
import {AdminService} from '../service/AdminService';
import {VisaDTO} from '../../shared/data/dto/visa-dto';
import {UserDTO} from '../../shared/data/dto/user-dto';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  username = 'admin';
  password = 'admin123';
  usernameBinded;
  passwordBinded;
  isValid = true;
  visaDTO: VisaDTO[] = [];

  constructor(private adminService: AdminService) {
  }

  ngOnInit() {
  }

  onSearch() {
    if (this.usernameBinded == this.username && this.passwordBinded == this.password) {
      this.getAllVisas();
    } else {
      this.isValid = false;
      return;
    }
  }

  getAllVisas() {
    this.adminService.getAllVisaRequests().subscribe(
      (success: any) => {
        this.visaDTO = success;
        this.mergeObjects();
      },
      fail => console.log(fail)
  )
    ;
  }

  getVisasUser(visaDTO: VisaDTO) {
    this.adminService.getUserOfVisa(visaDTO.passportPassportId).subscribe(
      (success: any) => {
        visaDTO.user = success;
      }
    );
  }


  mergeObjects() {
    for (let visa of this.visaDTO) {
      this.getVisasUser(visa);
    }
  }
}
