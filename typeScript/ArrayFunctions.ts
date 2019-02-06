var myArray:number[];
myArray=[10,20,30,40,50,60,70];

//For loop
var sum=0;
for(var i=0;	i<myArray.length;   i++){
	sum=sum+myArray[i];
}
console.log("sum:"+sum);


//For In loop
sum=0;
var j:any;
for(j in myArray){
	sum=sum+myArray[j];
}
console.log("sum:"+sum);


//For of loop
sum=0;
var j:any;
for(j of myArray){
	sum=sum+j;
}
console.log("sum:"+sum);


//While loop
sum=0;
i=0;
while(i<myArray.length){
	sum=sum+myArray[i];
}
console.log("sum:"+sum);







