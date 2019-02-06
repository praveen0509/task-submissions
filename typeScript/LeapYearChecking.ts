function checkLeapYear(x):string{
	if(typeof x ==number){
		if(  (x%400==0) ||(x%100!=0 && x%4==0) )
			return "Leap Year";
		else
			return "Not Leap Year";		
	}	
	else
		return "Enter Value is Not a Number";
}

console.log(checkLeapYear(1994));










