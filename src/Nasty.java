void main() {
    var age = Integer.parseInt(IO.readln("Shkruaj moshen: "));
    var license = IO.readln("A ka patent? (po/Jo): ");
    if (age>= 18 && license.equals("po")) {
        IO.println("Personi mund te vozisi");
    } else {
        IO.println("Personi nuk mund te vozisi");
    }
}