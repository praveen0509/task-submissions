import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomePageComponent } from './home-page/home-page.component';
import { FormPageComponent } from './form-page/form-page.component';


const routes: Routes = [
  {path: 'formPage', component: FormPageComponent},
  {path: 'homePage', component: HomePageComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

export const RoutingComponent = [HomePageComponent, FormPageComponent] ;
