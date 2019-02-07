var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var College = /** @class */ (function () {
    function College(id, stdName, branch) {
        this.id = id;
        this.stdName = stdName;
        this.branch = branch;
    }
    //Static Method
    College.staticDisplay = function () {
        console.log("Static CollegeName:" + College.colName);
    };
    //Displaying Content
    College.prototype.display = function () {
        console.log("CollegeName:" + College.colName + "\nId:" + this.id + "\nstdName:" + this.stdName + "\nbranch:" + this.branch);
    };
    return College;
}());
var School = /** @class */ (function (_super) {
    __extends(School, _super);
    function School() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    School.prototype.protectedData = function () {
        console.log("Protected Branch:" + this.branch);
    };
    School.prototype.publicData = function () {
        console.log("Public student Name:" + this.stdName);
    };
    School.prototype.privateData = function () {
        //console.log("Private Id:"+id);		Private Data  Can Only accessible within Class  
    };
    return School;
}(College));
College.colName = "JNTU";
var obj = new College(100, "Praveen", "MCA");
College.staticDisplay();
//Accessing All Specifiers Outside Class
console.log(obj.stdName);
//console.log(obj.id);			Private Data Can Accessible within Class only
//console.log(obj.branch);		Outside Class Cannot Accessible  
