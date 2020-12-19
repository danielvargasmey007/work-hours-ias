import { ReportService } from './../../services/report.service';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Component, OnInit } from '@angular/core';
import { Report } from '../../report.model';

@Component({
  selector: 'app-form-ias',
  templateUrl: './form-ias.component.html',
  styleUrls: ['./form-ias.component.scss'],
})
export class FormIasComponent implements OnInit {
  form: FormGroup;

  constructor(
    private reportService: ReportService,
    private formBuilder: FormBuilder
  ) {
    this.form = this.formBuilder.group({
      idTechnician: ['', [Validators.required]],
      idService: ['', [Validators.required]],
      date: ['', [Validators.required]],
      startHour: ['', [Validators.required]],
      endHour: ['', [Validators.required]],
    });
  }

  ngOnInit(): void {}

  // tslint:disable-next-line:typedef
  onSubmit() {
    const date = this.form.value.date.format('YYYY-MM-DD');
    const report: Report = {
      idService: this.form.value.idService,
      idTechnician: this.form.value.idTechnician,
      startDate: date + ' ' + this.form.value.startHour,
      endDate: date + ' ' + this.form.value.endHour,
    };
    this.reportService.report(report).subscribe(x => {
      this.form.reset();
      alert('Great! successfully saved');
    },
    (error) => alert(error));
  }
}
