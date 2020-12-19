import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
// tslint:disable-next-line:no-submodule-imports
import { HttpClient, HttpParams } from '@angular/common/http';
import { Report } from '../report.model';

@Injectable({
  providedIn: 'root',
})
export class ReportService {
  constructor(private http: HttpClient) {}

  public report(
    request: Report
  ): Observable<Report> {
    return this.http.post<Report>(
      `http://ec2-3-137-182-178.us-east-2.compute.amazonaws.com:81/reports`, request
    );
  }

}
