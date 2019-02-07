/*
//Parameterized Function
//Return Valued Function
function myFunction(a:number, b:number):number{
	return a+b;	
}
let sum=myFunction(20, 30);
console.log(sum);


//Optional Function
function myFunction1(fName:string, lName:string, age?:string):string{
	if(age==undefined)
	    return fName+" "+lName;
	else
	    return fName+" "+lName+ " "+age;	
}

console.log(myFunction1("Praveen", "Kumar"));
console.log(myFunction1("Praveen", "Kumar", "25"));


/*output:
50
Praveen Kumar
Praveen Kumar 25
*/






