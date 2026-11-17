void main() { /*
Ky program gjen mesataren e notave te mia
    var Nota1 = 9
**/
    IO.println("Bot \ttung! Une e llogaris mesataren tende." +
            "");
    var nota1 = Integer.parseInt(IO.readln("Nota jote e pare?"));
    var nota2 = Integer.parseInt(IO.readln("Nota jote e dyte?"));
    var nota3 = Integer.parseInt(IO.readln("Nota jote e trete?"));

    int sum = nota1 + nota2 + nota3;
    double avrage = (double) sum / 3;
    IO.println("Shuma:  " + sum);
    IO.println("Avrage: " + avrage);
    double dyshifra = Math.round(avrage * 100) / 100.0;
    int grade = (int) Math.round(avrage);
    IO.println("me dy shifra  " + dyshifra);
    IO.println("Nota e rumbullaksuar  " + grade);

    int min = Math.min(nota1, Math.min(nota2 , nota3));
    IO.println("Vlera me e vogel:  " + min);
    int max = Math.max(nota1,  Math.max(nota2 , nota3));
    IO.println("Vlera me e madhe:  " + max);
}
