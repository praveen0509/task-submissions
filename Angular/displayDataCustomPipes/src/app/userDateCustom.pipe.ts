import {Pipe, PipeTransform} from '@angular/core';


@Pipe({
  name: 'userDateCustom'
})

export class UserDateCustomPipe implements PipeTransform{
  private mydateFormat: string;
  private valArray: string[];
  private value: string;

  transform(date: Date): string {
    this.value = date.toDateString();
    
    this.valArray = this.value.split(' ', 6);
    this.mydateFormat = '';
    switch (this.valArray[1]) {
      case 'Jan':
        this.mydateFormat = this.mydateFormat + 'January';
        break;
      case 'Feb':
        this.mydateFormat = this.mydateFormat + 'Febraury';
        break;
        /*
      case 'Mar':
        this.dateFormat = this.dateFormat + 'March';
        break;
      case 'Apr':
        this.dateFormat = this.dateFormat + 'April';
        break;
      case 'May':
        this.dateFormat = this.dateFormat + 'May';
        break;
      case 'June':
        this.dateFormat = this.dateFormat + 'June';
        break;
      case 'July':
        this.dateFormat = this.dateFormat + 'July';
        break;
      case 'Aug':
        this.dateFormat = this.dateFormat + 'August';
        break;
      case 'Sept':
        this.dateFormat = this.dateFormat + 'September';
        break;
      case 'Oct':
        this.dateFormat = this.dateFormat + 'Oct';
        break;
      case 'Nov':
        this.dateFormat = this.dateFormat + 'Nov';
        break;
      case 'Dec':
        this.dateFormat = this.dateFormat + 'December';
        break;*/
      default:
        console.log('month not found');
        break;
    }


    return this.mydateFormat + ' ' + this.valArray[2] + ', ' + this.valArray[3] + ' at ' + this.valArray[4];

  }

}




