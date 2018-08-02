import {RouterModule, Routes} from '@angular/router';
import {NgModule} from '@angular/core';
import {FormComponent} from './VisaForm/form/form.component';

const appRoutes: Routes = [
  {path: '', component: FormComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(appRoutes)],
  exports: [RouterModule]
})

export class AppRoutingModule {

}
