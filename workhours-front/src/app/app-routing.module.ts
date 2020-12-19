import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CardIasComponent } from './hours/components/card-ias/card-ias.component';
import { FormIasComponent } from './report/components/form-ias/form-ias.component';

const routes: Routes = [
  {
    path: 'hours',
    component: CardIasComponent
  },
  {
    path: 'reports',
    component: FormIasComponent
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
