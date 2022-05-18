import { ComponentFixture, TestBed } from '@angular/core/testing';

import { IteamlistComponent } from './iteamlist.component';

describe('IteamlistComponent', () => {
  let component: IteamlistComponent;
  let fixture: ComponentFixture<IteamlistComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ IteamlistComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(IteamlistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
