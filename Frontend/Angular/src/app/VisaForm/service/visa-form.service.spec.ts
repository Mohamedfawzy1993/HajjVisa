import { TestBed, inject } from '@angular/core/testing';

import { VisaFormService } from './visa-form.service';

describe('AdminService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [VisaFormService]
    });
  });

  it('should be created', inject([VisaFormService], (service: VisaFormService) => {
    expect(service).toBeTruthy();
  }));
});
