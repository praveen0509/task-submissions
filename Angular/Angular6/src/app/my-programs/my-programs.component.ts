import { Component, OnInit } from '@angular/core';
import { HEROES} from '../heroList';
import {Hero} from '../hero/hero';

@Component({
  selector: 'app-my-programs',
  templateUrl: './my-programs.component.html',
  styleUrls: ['./my-programs.component.css']
})
export class MyProgramsComponent implements OnInit {

  constructor() { }

  ngOnInit() { }

  heroes = HEROES;
  myHero : Hero;
  selectedValue(myHero: Hero){
    this.myHero = myHero;
  }

}
