class College{
	//static Variable
	static  colName:string;
	public stdName:string;
	private id:number;
	protected branch:string;
	
	constructor(id:number, stdName:string, branch:string){
		this.id=id;
		this.stdName=stdName;
		this.branch=branch;
	}	
	
	//Static Method
	static staticDisplay(){
		console.log( "Static CollegeName:"+ College.colName );
	}
	
	//Displaying Content
	display(){
		console.log( "CollegeName:"+ College.colName + "\nId:"+this.id+ "\nstdName:"+this.stdName+ "\nbranch:"+this.branch );
	}
}


class School extends College{
	
	protectedData(){
		console.log("Protected Branch:"+this.branch);
	}
	publicData(){
		console.log("Public student Name:"+this.stdName);
	}
	privateData(){
		//console.log("Private Id:"+id);		Private Data  Can Only accessible within Class  
	} 
		
}





College.colName="JNTU";
var obj=new College(100, "Praveen", "MCA");
College.staticDisplay();

//Accessing All Specifiers Outside Class
console.log(obj.stdName);
//console.log(obj.id);			Private Data Can Accessible within Class only
//console.log(obj.branch);		Outside Class Cannot Accessible  
































