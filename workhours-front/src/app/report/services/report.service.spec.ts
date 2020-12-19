import {
  HttpClientTestingModule,
  HttpTestingController,
  // tslint:disable-next-line:no-submodule-imports
} from '@angular/common/http/testing';
// tslint:disable-next-line:no-submodule-imports
import { TestBed } from '@angular/core/testing';
import { ReportService } from './report.service';
import { Report } from '../report.model';

describe('ReportService', () => {
  let service: ReportService;
  let httpMock: HttpTestingController;

  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [HttpClientTestingModule],
      providers: [ReportService],
    });

    service = TestBed.inject(ReportService);
    httpMock = TestBed.inject(HttpTestingController);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });

  it('Report', () => {
    const rq: Report =  {
      idTechnician: '1',
      idService: '1',
      startDate: '2020-12-12',
      endDate: '2020-12-12'
    };
    service.report(rq).subscribe();
    const mockReq = httpMock.expectOne(
      `http://ec2-3-137-182-178.us-east-2.compute.amazonaws.com:81/reports`
    );
    expect(mockReq.request.method).toStrictEqual('POST');
    expect(mockReq.request.url).toStrictEqual(
      `http://ec2-3-137-182-178.us-east-2.compute.amazonaws.com:81/reports`
    );
  });
});
