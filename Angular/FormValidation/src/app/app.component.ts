import { Component } from '@angular/core';
import {LocalStorage} from '@ngx-pwa/local-storage';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app';

  constructor(private localStorage: LocalStorage) { }
  ngOninit() {  }

}












