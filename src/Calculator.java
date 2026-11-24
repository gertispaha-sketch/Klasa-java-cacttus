void main() {
double first = Double.parseDouble(IO.readln("Shkruaj numrin e pare: "));
String operator = IO.readln("Shkruaj veprimin (+ - * /) ");
double second = Double.parseDouble(IO.readln("Shkruaj numrin e dyte: "));

        switch (operator) {
            case "+" -> IO.println("Rezultati eshte: " + (first + second));
            case "-" -> IO.println("Rezultati eshte: " + (first - second));
            case "*" -> IO.println("Rezultati eshte: " + (first * second));
       case "/" -> {
                if (second == 0) {
                    IO.println("Nuk mund te behet pjestimi me zero!");
                } else {
                    IO.println("Rezultati eshte: " + (first / second));
                }
            }
            default -> IO.println("Operator i pavlefshem!");
        }
       }
