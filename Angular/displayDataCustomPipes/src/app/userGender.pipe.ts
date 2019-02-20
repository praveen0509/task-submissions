import {Pipe, PipeTransform} from '@angular/core';

@Pipe({
  name: 'userGender' })

export class UserGenderPipe  implements PipeTransform {

  transform(value: string, gender: string): string {
    if (gender.toLowerCase() === 'male') {
      return 'Mr. ' + value;
    } else {
      return 'Miss. ' + value;
    }
  }
}




