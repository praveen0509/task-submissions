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
var Fruit = /** @class */ (function () {
    function Fruit(name, color) {
        this.name = name;
        this.color = color;
    }
    Fruit.prototype.display = function () {
        return "Name:" + this.name + "\tColor:" + this.color;
    };
    return Fruit;
}());
var ChildFruit1 = /** @class */ (function (_super) {
    __extends(ChildFruit1, _super);
    function ChildFruit1() {
        var _this = _super !== null && _super.apply(this, arguments) || this;
        _this.name = "apple";
        _this.color = "red";
        return _this;
    }
    return ChildFruit1;
}(Fruit));
var ChildFruit2 = /** @class */ (function (_super) {
    __extends(ChildFruit2, _super);
    function ChildFruit2() {
        var _this = _super !== null && _super.apply(this, arguments) || this;
        _this.name = "Grape";
        _this.color = "green";
        return _this;
    }
    return ChildFruit2;
}(Fruit));
var obj1 = new Fruit("Mango", "yellow"); //Mango yellow
var obj3 = new ChildFruit1("Mango", "yellow"); //apple  red
var obj2 = new ChildFruit2("Mango", "yellow"); //grape	green
console.log(obj1.display()); //Last Object Values will be Assigned
console.log(obj2.display()); //Last Object Values will be Assigned
console.log(obj3.display()); //Last Object Values will be Assigned
