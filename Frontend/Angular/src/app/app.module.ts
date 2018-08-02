import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppComponent} from './app.component';
import {AppRoutingModule} from './app-routing.module';
import {LayoutComponent} from './shared/components/HomeLayout/layout.component';
import {HeaderComponent} from './shared/header/header.component';
import {FooterComponent} from './shared/footer/footer.component';
import { PageHeadComponent } from './shared/components/page-head/page-head.component';
import { PersonalDataComponent } from './VisaForm/personal-data/personal-data.component';
import { NationalIDComponent } from './VisaForm/national-id/national-id.component';
import { PassportDataComponent } from './VisaForm/passport-data/passport-data.component';
import { FormComponent } from './VisaForm/form/form.component';
import { VisaDataComponent } from './VisaForm/visa-data/visa-data.component';
import { StepsComponent } from './VisaForm/steps/steps.component';
import { VisaPaymentComponent } from './VisaForm/visa-payment/visa-payment.component';

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
    VisaPaymentComponent
  ],
  imports: [
    BrowserModule, AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
