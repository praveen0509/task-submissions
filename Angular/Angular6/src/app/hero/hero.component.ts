import { Component, OnInit } from '@angular/core';
import {HEROES} from '../heroList';
import {Hero} from '../hero/hero';


@Component({
  selector: 'app-hero',
  templateUrl: './hero.component.html',
  styleUrls: ['./hero.component.css']
})
export class HeroComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

  heroes = HEROES;
  myEvent1 : any;

  parentMethod(myEvent) {
    this.myEvent1 = myEvent;
  }

  hero : Hero;
  selectedRow( hero: Hero){
    this.hero = hero;
  }
}
















