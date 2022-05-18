import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ChefDashComponent } from './chef-dash.component';

describe('ChefDashComponent', () => {
  let component: ChefDashComponent;
  let fixture: ComponentFixture<ChefDashComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ChefDashComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ChefDashComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
