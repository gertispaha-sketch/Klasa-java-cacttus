void main() {
    var pike = Integer.parseInt(IO.readln("Sa pike ke mare?  "));// e lejon vleren e mosesh qe ne shenojm te sillet si int dhe te mlbedhet me numra
    if (pike >= 90) {
        IO.println("Urime ti ke mar noten 5");
    } else if (pike >= 80) {
        IO.println("urime ti ke mar noten 4");
    } else if (pike >= 70) {
        IO.println(" ti ke mar noten 3");
    } else if (pike >= 60) {
        IO.println(" ti ke mar noten 2");
    } else if (pike >= 50) {
        IO.println(" ti ke mar noten 1");
    } else {
        IO.println(" ti ke mar noten 0");
    }
}