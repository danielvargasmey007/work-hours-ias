import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormIasComponent } from './components/form-ias/form-ias.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import {NgxMaterialTimepickerModule} from 'ngx-material-timepicker';
// tslint:disable-next-line:no-submodule-imports
import { HttpClientModule } from '@angular/common/http';
// tslint:disable-next-line:no-submodule-imports
import { MatInputModule } from '@angular/material/input';
// tslint:disable-next-line:no-submodule-imports
import { MatSlideToggleModule } from '@angular/material/slide-toggle';
// tslint:disable-next-line:no-submodule-imports
import { MatDatepickerModule } from '@angular/material/datepicker';

import { MatMomentDateModule } from '@angular/material-moment-adapter';
// tslint:disable-next-line:no-submodule-imports
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

@NgModule({
  declarations: [FormIasComponent],
  imports: [
    CommonModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    NgxMaterialTimepickerModule,
    MatInputModule,
    MatSlideToggleModule,
    MatDatepickerModule,
    MatMomentDateModule,
    BrowserAnimationsModule
  ]
})
export class ReportModule { }
