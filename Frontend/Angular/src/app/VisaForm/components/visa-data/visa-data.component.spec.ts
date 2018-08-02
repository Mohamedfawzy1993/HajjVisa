import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { VisaDataComponent } from './visa-data.component';

describe('VisaDataComponent', () => {
  let component: VisaDataComponent;
  let fixture: ComponentFixture<VisaDataComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ VisaDataComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(VisaDataComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
