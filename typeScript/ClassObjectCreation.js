var Person = /** @class */ (function () {
    function Person(name, age) {
        this.name = name;
        this.age = age;
    }
    Person.prototype.display = function () {
        console.log("Name:" + this.name);
    };
    return Person;
}());
var obj = new Person("Praveen", 24);
obj.display();
console.log("Age:" + obj.age);
