class Person{
	name:string;
	age:number;
	constructor(name:string,	age:number){
		this.name=name;
		this.age=age;
	}
	
	display():void{
		console.log("Name:"+this.name);
	}	
	
		
}

var obj = new Person("Praveen", 24);
obj.display();
 console.log("Age:"+obj.age);
 
















