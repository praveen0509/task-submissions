var myArray:number[];
myArray=[10,20,30,40,50,60];
var myArray1=[1,2,3,4];


/*
//copy array
let copyArray=myArray;
let copyArray1=[...myArray1];
console.log(copyArray);
console.log(copyArray1);


//Creating Object
let myArrayObj=new Array("Praveen", "Abhi", "Sampath", "Bharath");
console.log(myArrayObj);

//Concat
let concatArray=myArray.concat(myArray1);
console.log(concatArray);

//every()
let every=myArray.every(isBig);
 console.log(every);

 function isBig(array){		//function isBig(element, index, array)
	 return array>5;
 }

//indexOf()
console.log(myArray.indexOf(30));

//filter()
let filter=myArray.filter(isBig)
function isBig(array){		//function isBig(element, index, array)
	 return array>25;             //[ 30, 40, 50, 60 ]
 }
console.log(filter);


//join()
console.log(myArray.join());	//10,20,30,40,50,60
console.log(myArray.join("*"));		//10*20*30*40*50*60
console.log(myArray.join("-")); 	//10-20-30-40-50-60


//Map()
var numbers = [1, 4, 9]; 
var roots = numbers.map(Math.sqrt); 
console.log("roots is : " + roots );


//push()
myArray.push(70);
console.log(myArray);

//pop
myArray.pop();
console.log(myArray);























