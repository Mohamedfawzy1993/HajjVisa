import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NationalIDComponent } from './national-id.component';

describe('NationalIDComponent', () => {
  let component: NationalIDComponent;
  let fixture: ComponentFixture<NationalIDComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NationalIDComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NationalIDComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
