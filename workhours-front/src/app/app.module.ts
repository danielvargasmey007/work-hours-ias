import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
// tslint:disable-next-line:no-submodule-imports
import { HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HoursModule } from './hours/hours.module';
import { ReportModule } from './report/report.module';
import { NgxMaterialTimepickerModule } from 'ngx-material-timepicker';
// tslint:disable-next-line:no-submodule-imports
import { MatDatepickerModule } from '@angular/material/datepicker';

@NgModule({
  declarations: [AppComponent],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HoursModule,
    ReportModule,
    MatDatepickerModule,
    NgxMaterialTimepickerModule
  ],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
