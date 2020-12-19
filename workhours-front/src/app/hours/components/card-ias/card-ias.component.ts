import { Component, OnInit } from '@angular/core';
import { HoursService } from '../../services/hours.service';
import { Hour } from '../../models/hors.model';
import { FormBuilder, Validators } from '@angular/forms';

@Component({
  selector: 'app-card-ias',
  templateUrl: './card-ias.component.html',
  styleUrls: ['./card-ias.component.scss'],
})
export class CardIasComponent implements OnInit {
  hour: Hour;
  form: any;

  constructor(private hoursService: HoursService,  private formBuilder: FormBuilder) {
    this.form = this.formBuilder.group({
      idTechnician: ['', [Validators.required]],
      week: ['', [Validators.required]],
    });
  }


  ngOnInit(): void {

  }

  // tslint:disable-next-line:typedef
  onSubmit() {
    // Process checkout data here
    const value = this.form.value;
    const rq = {
      idTechnician: value.idTechnician,
      week: value.week
    };
    console.log(rq);

    this.hoursService.getHours(rq).subscribe((x) => {
      this.hour = x;
    },
    (error) => alert(error)
    );
  }
}
