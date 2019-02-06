function checkLeapYear(x) {
    if ((x % 400 == 0) || (x % 100 != 0 && x % 4 == 0))
        return "Leap Year";
    else
        return "Not Leap Year";
}
console.log(checkLeapYear(2016));
