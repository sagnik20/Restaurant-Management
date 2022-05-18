import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ChefloginComponent } from './cheflogin.component';

describe('ChefloginComponent', () => {
  let component: ChefloginComponent;
  let fixture: ComponentFixture<ChefloginComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ChefloginComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ChefloginComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
