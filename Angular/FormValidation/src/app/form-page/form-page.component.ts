import { Component, OnInit } from '@angular/core';
import {FormControl, ReactiveFormsModule, FormGroup, FormBuilder, Validator, Validators} from '@angular/forms';

@Component({
  selector: 'app-form-page',
  templateUrl: './form-page.component.html',
  styles: []
})
export class FormPageComponent implements OnInit {

  constructor() { }
  loginForm: FormGroup;

  ngOnInit() {
    this.loginForm = new FormGroup({
      name: new FormControl('', Validators.required),
      FatherName: new FormControl('', Validators.required),
      email: new FormControl('', Validators.required),
      Address: new FormControl('', Validators.required)
    });
  }



}
