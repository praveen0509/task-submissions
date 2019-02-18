import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { HeroComponent } from './hero/hero.component';
import { FormsModule } from '@angular/forms';
// @ts-ignore
import { MyProgramsComponent } from './my-programs/my-programs.component';
import { Task2Component } from './task2/task2.component';
import { HeroDetailsComponent } from './hero-details/hero-details.component';
import { UserDetailsComponent } from './user-details/user-details.component';



@NgModule({
  declarations: [
    AppComponent,
    HeroComponent,
    MyProgramsComponent,
    Task2Component,
    HeroDetailsComponent,
    UserDetailsComponent
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
