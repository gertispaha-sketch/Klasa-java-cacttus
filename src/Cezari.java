void main() {
    IO.println("1.Enkripto");
    IO.println("2.Dekripto");
    var zgjedhja = Integer.parseInt(IO.readln("Zgjidhni opsionin: 1 ose 2: ").trim());
    var drejtimi = switch (zgjedhja) {
        case 1 -> 1;
            case 2 -> -1;
            default -> 0;
    };
    if (drejtimi == 0) {
        IO.println("Zgjedhje e pavlefshme.");

    }
    else {
        var karakteri = IO.readln("Shkruaj shkronjen a-z: ").trim();
        int zhvendosja = Integer.parseInt(IO.readln("Shkruaj shifren e zhvendosjes 1-25: ").trim());
        if (karakteri.length() != 1) {
            IO.println("Ju lutem shkruani vetem nje shkronje.");
        }

        else if (zhvendosja <1 || zhvendosja > 25) {
            IO.println("Ju lutem shkruani nje numer nga 1 deri ne 25.");
        }else {
            var shkronja = karakteri.charAt(0);
            boolean Evogel = shkronja >= 'a' && shkronja <= 'z';
            boolean Emadhe = shkronja >= 'A' && shkronja <= 'Z';
            if (!Evogel && !Emadhe) {
                IO.println("Shkruani nje shkronje nga a-z pa ë dhe ç ");
            }else {
                char fillimi = Emadhe ? 'a' : 'A';;
                int pozita = (shkronja - fillimi+drejtimi * zhvendosja + 26) % 26;
                char rezultati = (char) (fillimi + pozita);
                IO.println(shkronja + " u zhvendos ne " + rezultati);
                System.out.printf("Zhvendosja: %d nga 26 shkronjat (%.2f%% e alfabetit)%n", zhvendosja, (zhvendosja / 26.0) * 100);


            }

        }

    }


}