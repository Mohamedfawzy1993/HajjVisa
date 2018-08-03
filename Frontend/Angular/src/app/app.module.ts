import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppComponent} from './app.component';
import {AppRoutingModule} from './app-routing.module';
import {LayoutComponent} from './shared/components/HomeLayout/layout.component';
import {HeaderComponent} from './shared/header/header.component';
import {FooterComponent} from './shared/footer/footer.component';
import {PageHeadComponent} from './shared/components/page-head/page-head.component';
import {PersonalDataComponent} from './VisaForm/components/personal-data/personal-data.component';
import {NationalIDComponent} from './VisaForm/components/national-id/national-id.component';
import {PassportDataComponent} from './VisaForm/components/passport-data/passport-data.component';
import {FormComponent} from './VisaForm/components/form/form.component';
import {VisaDataComponent} from './VisaForm/components/visa-data/visa-data.component';
import {StepsComponent} from './VisaForm/components/steps/steps.component';
import {VisaPaymentComponent} from './VisaForm/components/visa-payment/visa-payment.component';
import {FormsModule} from '@angular/forms';
import {VisaObjectService} from './VisaForm/shared/service/visa-object.service';
import { SuccessComponent } from './VisaForm/components/success/success.component';
import {VisaFormService} from './VisaForm/service/visa-form.service';
import {HttpClientModule} from '@angular/common/http';
import { VisaSearchComponent } from './VisaCheck/visa-search/visa-search.component';
import {VisaSearch} from './VisaCheck/service/visaSearch';
import { LoginComponent } from './admin/login/login.component';
import { AdminComponent } from './admin/admin/admin.component';
import {AdminService} from './admin/service/AdminService';

@NgModule({
  declarations: [
    AppComponent,
    LayoutComponent,
    FooterComponent,
    HeaderComponent,
    PageHeadComponent,
    PersonalDataComponent,
    NationalIDComponent,
    PassportDataComponent,
    FormComponent,
    VisaDataComponent,
    StepsComponent,
    VisaPaymentComponent,
    SuccessComponent,
    VisaSearchComponent,
    LoginComponent,
    AdminComponent,
  ],
  imports: [
    FormsModule, BrowserModule, AppRoutingModule, HttpClientModule
  ],
  providers: [VisaObjectService , VisaFormService , VisaSearch , AdminService],

  bootstrap: [AppComponent]
})
export class AppModule {
}
