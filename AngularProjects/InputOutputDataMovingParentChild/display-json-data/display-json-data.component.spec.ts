import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DisplayJsonDataComponent } from './display-json-data.component';

describe('DisplayJsonDataComponent', () => {
  let component: DisplayJsonDataComponent;
  let fixture: ComponentFixture<DisplayJsonDataComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DisplayJsonDataComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DisplayJsonDataComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
