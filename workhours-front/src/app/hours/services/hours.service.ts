import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
// tslint:disable-next-line:no-submodule-imports
import { HttpClient, HttpParams } from '@angular/common/http';
import { Hour } from '../models/hors.model';

@Injectable({
  providedIn: 'root',
})
export class HoursService {
  constructor(private http: HttpClient) {}

  public getHours(rq: any): Observable<Hour> {
    let params = new HttpParams();
    params = params.append('idTechnician', rq.idTechnician);
    params = params.append('week', rq.week);

    return this.http.get<Hour>(
      `http://ec2-3-137-182-178.us-east-2.compute.amazonaws.com:81/hours`,
      // tslint:disable-next-line:object-literal-shorthand
      { params: params }
    );
  }
}
