import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';
import {LocalStorage} from '@ngx-pwa/local-storage';

@Component({
  selector: 'app-home-page',
  templateUrl: './home-page.component.html',
  styles: []
})
export class HomePageComponent implements OnInit {

  constructor(private router: Router, private localStorage: LocalStorage) { }

  name;
  fatherName;
  email;
  password;
  dob;
  address;
  phno;
  district;

  ngOnInit() {
    this.localStorage.getItem('user').subscribe((user) => {
      console.log(user);
      this.name = user.name;
      this.fatherName = user.fatherName;
      this. email = user.email;
      this.password = user.password;
      this.address = user.address;
      this.dob = user.dob;
      this. phno = user.phno;
      this.district = user.dropdown;
    });

  }

}
