//Parameterized Function
//Return Valued Function
function myFunction(a, b) {
    return a + b;
}
var sum = myFunction(20, 30);
console.log(sum);
//Optional Function
function myFunction1(fName, lName, age) {
    if (age == undefined)
        return fName + " " + lName;
    else
        return fName + " " + lName + " " + age;
}
console.log(myFunction1("Praveen", "Kumar"));
console.log(myFunction1("Praveen", "Kumar", "25"));
