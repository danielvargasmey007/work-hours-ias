import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CardIasComponent } from './card-ias.component';

describe('CardIasComponent', () => {
  let component: CardIasComponent;
  let fixture: ComponentFixture<CardIasComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CardIasComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CardIasComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
