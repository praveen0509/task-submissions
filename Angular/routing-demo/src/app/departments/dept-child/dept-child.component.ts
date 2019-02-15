import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-dept-child',
  templateUrl: './dept-child.component.html',
  styles: []
})
export class DeptChildComponent implements OnInit {

  constructor() { }
  @Input() x: number;


  ngOnInit() {
  }

}
