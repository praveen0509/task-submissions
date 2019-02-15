import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-departments',
  templateUrl: './departments.component.html',
  styles: []
})
export class DepartmentsComponent implements OnInit {

  constructor() { }
  myData: any;
  recieveData(myData: any) {
    this.myData = myData;
  }



  ngOnInit() {
  }

}
