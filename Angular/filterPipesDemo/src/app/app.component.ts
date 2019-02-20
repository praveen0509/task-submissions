import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  template: `
    <div>
      Search Here:
        <input type="text" [(ngModel)]="userFilter.area" placeholder="area">
        <table  border="1px solid red"  bgcolor="#6495ed" align="center">
          <tr>
            <th>id</th>
            <th>name</th>
            <th>area</th>
          </tr>

          <tr *ngFor="let user of users | filterBy: userFilter">
            <td>{{user.id }}</td>
            <td>{{user.name}}</td>
            <td>{{user.area}}</td>
          </tr>
        </table>

    </div>

    <div *ngFor="let language of languages | filterBy: filterByMore">
      {{ language }}
    </div>


  `
})

export class AppComponent {
  users =  [
    { id: 11, name: 'Mr. Nice', area: 'kp'},
    { id: 12, name: 'Narco', area: 'jntu' },
    { id: 13, name: 'Bombasto' , area: 'jdm'},
    { id: 14, name: 'Celeritas' , area: 'mp'},
    { id: 15, name: 'Magneta' , area: 'kphb'},
    { id: 16, name: 'RubberMan' , area: 'kp'},
    { id: 17, name: 'Dynama', area: 'chintal' },
    { id: 18, name: 'Dr IQ', area: 'IDPL' },
    { id: 19, name: 'Magma', area: 'kphb' },
    { id: 20, name: 'Tornado', area: 'myp' } ];
  userFilter: any = { };
  languages = ['English', 'German', 'Russian', 'Italian', 'Ukrainian'];
  filterByMore = {$or: ['g', 's']};
}
