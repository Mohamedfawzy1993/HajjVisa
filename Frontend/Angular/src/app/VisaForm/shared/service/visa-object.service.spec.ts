import { TestBed, inject } from '@angular/core/testing';

import { VisaObjectService } from './visa-object.service';

describe('VisaObjectService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [VisaObjectService]
    });
  });

  it('should be created', inject([VisaObjectService], (service: VisaObjectService) => {
    expect(service).toBeTruthy();
  }));
});
