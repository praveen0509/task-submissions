var College = /** @class */ (function () {
    function College(id, stdName, branch) {
        this.id = id;
        this.stdName = stdName;
        this.branch = branch;
    }
    College.staticDisplay = function () {
        console.log("CollegeName:" + College.colName);
    };
    College.prototype.display = function () {
        console.log("CollegeName:" + College.colName + "\nId:" + this.id + "\nstdName:" + this.stdName + "\nbranch:" + this.branch);
    };
    return College;
}());
College.colName = "JNTU";
var obj = new College(100, "Praveen", "MCA");
obj.display();
College.staticDisplay();
