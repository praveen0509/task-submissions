import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {DepartmentsComponent} from './departments/departments.component';
import { EmployeesComponent } from './employees/employees.component';
import { StudentsComponent} from './students/students.component';

const routes: Routes = [
  { path: 'departments', component: DepartmentsComponent },
  { path: 'employees', component: EmployeesComponent },
  { path: 'students', component: StudentsComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

export const routingModule = [DepartmentsComponent, EmployeesComponent, StudentsComponent];
