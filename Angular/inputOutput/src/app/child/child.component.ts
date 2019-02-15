import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styles: []
})
export class ChildComponent implements OnInit {

  constructor() { }
  @Input() parentData: any;
  @Output()
    sendData = new EventEmitter();
  removeData(id){
   this.sendData.emit(id);
  }

  ngOnInit() {
  }

}
