import { Component, OnInit } from '@angular/core';
import {FormGroup, FormBuilder, Validators} from '@angular/forms';
import {Router} from '@angular/router';
import {LocalStorage} from '@ngx-pwa/local-storage';
@Component({
  selector: 'app-form-page',
  templateUrl: './form-page.component.html',
  styles: []
})
export class FormPageComponent implements OnInit {

  data: any;
  localStorageItem: any;
  title = 'Angular Form Validation Tutorial';
  angForm: FormGroup;
  constructor(private fb: FormBuilder, private router: Router, private localStorage: LocalStorage) {
    this.createForm();
  }

  defaultValue = 'hyderabad';
  list = [{id: 1, display: 'hyderabad'},
          {id: 2, display: 'khammam'},
          {id: 3, display: 'karimnagar'},
          {id: 4, display: 'vizag'},
          {id: 5, display: 'guntur'},
          {id: 6, display: 'ongole'},
          {id: 7, display: 'kadapa'},
          {id: 8, display: 'rangareddy'},
          {id: 9, display: 'medchal'},
          {id: 10, display: 'sangareddy'},
          {id: 11, display: 'medak'},
          {id: 12, display: 'patancheru'}];
  createForm() {
    this.angForm = this.fb.group({
      name: ['', Validators.required, Validators.minLength(4)],
      fatherName: ['', Validators.required, Validators.minLength(4)],
      email: ['', Validators.required, Validators.email],
      password: ['', Validators.required, Validators.minLength(4)],
      phno: ['', Validators.required],
      dob: ['', Validators.required],
      address: ['', Validators.required ],
      dropdown: ['', Validators.required]
    });
  }



    onselect(): void {

       // this.localStorageItem = JSON.parse(localStorage.getItem('this.data'));

       // if Registration Form is Invalio
        if (this.angForm.invalid) {
          return;
        }

      alert( JSON.stringify(this.angForm.value));
      this.localStorage.setItem('user', this.angForm.value).subscribe(() => {});
      this.router.navigate(['homePage']);

   }
   ngOnInit(): void { }

}
