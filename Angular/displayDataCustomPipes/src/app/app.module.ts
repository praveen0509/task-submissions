import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {UserGenderPipe} from './userGender.pipe';
import { AppComponent } from './app.component';
import {PhoneNumberPipe} from './phoneNumber.pipe';
import {UserDateCustomPipe} from './userDateCustom.pipe';

@NgModule({
  declarations: [
    AppComponent,
    UserGenderPipe,
    PhoneNumberPipe,
    UserDateCustomPipe
  ],
  imports: [
    BrowserModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
