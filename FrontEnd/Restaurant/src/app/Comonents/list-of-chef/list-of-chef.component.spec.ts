import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListOfChefComponent } from './list-of-chef.component';

describe('ListOfChefComponent', () => {
  let component: ListOfChefComponent;
  let fixture: ComponentFixture<ListOfChefComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListOfChefComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListOfChefComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
