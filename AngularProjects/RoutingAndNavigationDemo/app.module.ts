import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule, routingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DeptChildComponent } from './departments/dept-child/dept-child.component';



@NgModule({
  declarations: [
    AppComponent,
    routingModule,
    DeptChildComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }


