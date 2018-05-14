import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { InventionsHubComponent } from './inventions-hub.component';

describe('InventionsHubComponent', () => {
  let component: InventionsHubComponent;
  let fixture: ComponentFixture<InventionsHubComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ InventionsHubComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(InventionsHubComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
