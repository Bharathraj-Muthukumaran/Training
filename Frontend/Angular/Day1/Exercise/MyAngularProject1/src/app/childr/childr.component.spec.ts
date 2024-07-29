import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ChildrComponent } from './childr.component';

describe('ChildrComponent', () => {
  let component: ChildrComponent;
  let fixture: ComponentFixture<ChildrComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ChildrComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ChildrComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
