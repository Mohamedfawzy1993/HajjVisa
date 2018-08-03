import {RouterModule, Routes} from '@angular/router';
import {NgModule} from '@angular/core';
import {FormComponent} from './VisaForm/components/form/form.component';
import {VisaSearchComponent} from './VisaCheck/visa-search/visa-search.component';
import {LoginComponent} from './admin/login/login.component';
import {AdminComponent} from './admin/admin/admin.component';

const appRoutes: Routes = [
  {path: '', component: FormComponent },
  {path: 'check' , component: VisaSearchComponent},
  {path: 'admin' , children: [
      {path:'login' ,component: LoginComponent},
      {path: '' , component: AdminComponent}
    ]},
  {path: 'check' , component: VisaSearchComponent}



];

@NgModule({
  imports: [RouterModule.forRoot(appRoutes)],
  exports: [RouterModule]
})

export class AppRoutingModule {

}
