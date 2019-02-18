import { Component, OnInit } from '@angular/core';
import { Hero1 } from '../jsonData' ;

@Component({
  selector: 'app-task2',
  templateUrl: './task2.component.html',
  styleUrls: ['./task2.component.css']
})
export class Task2Component implements OnInit {


  constructor() {
  }

  ngOnInit() {
  }

  myHero = Hero1;
  hero : any;

  onSelect(hero: any) {
      this.hero = hero;
  }


  removeData(parentId): void {
    for (let i = 0 ; i < this.myHero.length; i++) {
      if ( this.myHero[i].id === parentId ) {
        this.myHero.splice(i, 1);
      }
    }

    // table.deleteRow(this.rowIndex);
  }


}
