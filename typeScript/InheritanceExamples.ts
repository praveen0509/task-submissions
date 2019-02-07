class Fruit{
	name:string;
	color:string;
	constructor(name:string, color:string){
		this.name=name;
		this.color=color;		
	}
	
	display():string{
		return  "Name:"+this.name+"\tColor:"+this.color;
	}
}

class ChildFruit1 extends Fruit{
	name="apple";
	color="red";
}


class ChildFruit2 extends Fruit{
	name= "Grape";
	color="green";
}

var obj1=new Fruit("Mango", "yellow");		//Mango yellow
var obj3=new ChildFruit1("Mango", "yellow");		//apple  red
var obj2=new ChildFruit2("Mango", "yellow");		//grape	green

console.log(obj1.display());		//Last Object Values will be Assigned
console.log(obj2.display());		//Last Object Values will be Assigned
console.log(obj3.display());		//Last Object Values will be Assigned













