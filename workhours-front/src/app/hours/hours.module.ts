import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CardIasComponent } from './components/card-ias/card-ias.component';
// tslint:disable-next-line:no-submodule-imports
import { HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';


@NgModule({
  declarations: [CardIasComponent],
  imports: [
    CommonModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ]
})
export class HoursModule { }
