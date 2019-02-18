import { Component, OnInit } from '@angular/core';
import {PersonData} from "../jsonData";

@Component({
  selector: 'app-display',
  templateUrl: './display.component.html',
  styles: []
})
export class DisplayComponent implements OnInit {

  constructor() { }

  myPersonData = PersonData;
  person: any;
  displayPersonData(person: any) {
    this.person = person;
  }
  ngOnInit() {
  }

}
