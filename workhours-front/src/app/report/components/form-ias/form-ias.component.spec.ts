import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormIasComponent } from './form-ias.component';

describe('FormIasComponent', () => {
  let component: FormIasComponent;
  let fixture: ComponentFixture<FormIasComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FormIasComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FormIasComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
