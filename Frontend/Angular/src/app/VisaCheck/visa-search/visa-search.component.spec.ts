import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { VisaSearchComponent } from './visa-search.component';

describe('VisaSearchComponent', () => {
  let component: VisaSearchComponent;
  let fixture: ComponentFixture<VisaSearchComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ VisaSearchComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(VisaSearchComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
