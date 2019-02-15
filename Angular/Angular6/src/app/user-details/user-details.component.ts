import {Component, OnInit, Input, Output, EventEmitter} from '@angular/core';

@Component({
  selector: 'app-user-details',
  templateUrl: './user-details.component.html',
  styleUrls: ['./user-details.component.css']
})
export class UserDetailsComponent implements OnInit {

   @Input() hero: any;
   @Input() parentId: number;
   @Input() parentName: string;
   @Input() parentArea: string;
  constructor() { }

  ngOnInit() {  }

  @Output() childData = new EventEmitter<number>();

  id: number;
  removeRow(id: any) {
    this.id = id;
    this.childData.emit(this.id);
  }
}
