import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {employeeData} from '../jsonData';

@Component({
  selector: 'app-employees',
  templateUrl: `./employees.component.html`,
  styles: []
})
export class EmployeesComponent implements OnInit {

  constructor() { }

  myEmployeeData = employeeData;

  @Output() sendData = new EventEmitter();
  sendDataMethod(data: any) {
    this.sendData.emit(data);
  }

  ngOnInit() { }

}
