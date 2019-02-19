import { Component, OnInit } from '@angular/core';
import {FormControl, ReactiveFormsModule, FormGroup, FormBuilder, Validator, Validators} from '@angular/forms';
import {Router} from '@angular/router';


@Component({
  selector: 'app-form-page',
  templateUrl: './form-page.component.html',
  styles: []
})
export class FormPageComponent implements OnInit {

  data: any;
  title = 'Angular Form Validation Tutorial';
  angForm: FormGroup;
  constructor(private fb: FormBuilder, private router: Router) {
    this.createForm();
  }
  createForm() {
    this.angForm = this.fb.group({
      name: ['', Validators.required, Validators.minLength(4)],
      fatherName: ['', Validators.required, Validators.minLength(4)],
      email: ['', Validators.required, Validators.email],
      password: ['', Validators.required, Validators.minLength(4)],
      address: ['', Validators.required ]
    });
  }

  onselect(): void {
       this.data = JSON.stringify(this.angForm.value);
       this.router.navigate(['homePage', this.data]);
  }
  ngOnInit(): void { }



}
