class College{
	//static Variable
	static  colName:string;
	stdName:string;
	id:number;
	branch:string;
	
	constructor(id:number, stdName:string, branch:string){
		this.id=id;
		this.stdName=stdName;
		this.branch=branch;
	}
	
	static staticDisplay(){
		console.log( "CollegeName:"+ College.colName );
	}
	
	display(){
		console.log( "CollegeName:"+ College.colName + "\nId:"+this.id+ "\nstdName:"+this.stdName+ "\nbranch:"+this.branch );
	}
}

College.colName="JNTU";
var obj=new College(100, "Praveen", "MCA");
obj.display();
College.staticDisplay();








