import { Component, OnInit } from '@angular/core';
import {Hero} from '../jsonData';

@Component({
  selector: 'app-display-json-data',
  templateUrl: './display-json-data.component.html',
  styles: []
})
export class DisplayJsonDataComponent implements OnInit {

  constructor() { }

  myHero = Hero;       // Imported Hero Object

  person: any;
  displayHeroData(person: any) {     // hero: from HTML file
    this.person = person;
  }

  removeDataInParent(parentId: number) {
    for (let i = 0; i < this.myHero.length; i++) {
      if (this.myHero[i].id === parentId) {
        this.myHero.splice(i, 1);
      }
    }
  }
  ngOnInit(){
  }

}
