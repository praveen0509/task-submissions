import {Pipe, PipeTransform} from '@angular/core';

@Pipe({
  name: 'phoneNumber' })

export class PhoneNumberPipe  implements PipeTransform {

  transform(val: string): string {
    val = val[0] === '0' ? '' + val : '0' + val;
    return val.substring(0, 3) + '-' + val.substring(3);
  }
}


