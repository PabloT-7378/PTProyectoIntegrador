import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BarradeinicioComponent } from './barradeinicio.component';

describe('BarradeinicioComponent', () => {
  let component: BarradeinicioComponent;
  let fixture: ComponentFixture<BarradeinicioComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BarradeinicioComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(BarradeinicioComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
