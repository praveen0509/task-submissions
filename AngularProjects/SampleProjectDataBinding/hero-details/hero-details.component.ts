import {Component, OnInit, Input, Output, EventEmitter} from '@angular/core';


@Component({
  selector: 'app-hero-details',
  templateUrl: './hero-details.component.html',
  styleUrls: ['./hero-details.component.css']
})
export class HeroDetailsComponent implements OnInit {

  constructor() { }

  ngOnInit() { }

  @Input() parentValue;
  @Output() childValue = new EventEmitter<string>();


  childValueMethod() {
    this.childValue.emit('hi! Semanticbits');
  }
}
