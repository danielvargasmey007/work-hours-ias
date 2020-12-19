import { HoursService } from './hours.service';
import {
  HttpClientTestingModule,
  HttpTestingController,
  // tslint:disable-next-line:no-submodule-imports
} from '@angular/common/http/testing';
// tslint:disable-next-line:no-submodule-imports
import { TestBed } from '@angular/core/testing';

describe('HoursService', () => {
  let service: HoursService;
  let httpMock: HttpTestingController;

  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [HttpClientTestingModule],
      providers: [HoursService],
    });

    service = TestBed.inject(HoursService);
    httpMock = TestBed.inject(HttpTestingController);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });

  it('Get Hours', () => {
    const rq =  {
      idTechnician: '1',
      week: 2
    };
    service.getHours(rq).subscribe();
    const mockReq = httpMock.expectOne(
      `http://ec2-3-137-182-178.us-east-2.compute.amazonaws.com:81/hours?idTechnician=1&week=2`
    );
    expect(mockReq.request.method).toStrictEqual('GET');
    expect(mockReq.request.url).toStrictEqual(
      `http://ec2-3-137-182-178.us-east-2.compute.amazonaws.com:81/hours`
    );
  });
});
