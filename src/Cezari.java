void main() {
    //Se pari shfaqim opsionet per userin
    IO.println("1.Enkripto");
    IO.println("2.Dekripto");
    IO.println("3.ROT13");
    var zgjedhja = Integer.parseInt(IO.readln("Zgjidhni opsionin: 1 ,2 ,3: ").trim());
    // Përcakto drejtimin e zhvendosjes bazuar në zgjedhjen e përdoruesit
    var drejtimi = switch (zgjedhja) {
        case 1 -> 1;
            case 2 -> -1;
            case 3 -> 1;
            default ->0;
            //Nese perdoruesi zgjedh drejtimin 1 atehere switchi do te ktheje 1, nese zgjedh 2 atehere switchi do te ktheje -1, nese zgjedh ndonje tjeter opsion atehere switchi do te ktheje 0
    };
    if (drejtimi == 0) {
        IO.println("Zgjedhje e pavlefshme.");
        //ne rast se perdoruesi zgjedh nje opsion te pavlefshme, programi do te shfaq nje mesazh gabimi dhe do te ndaloje ekzekutimin e kodit.

    }
    else {
        //useri shkruan shkronjen edhe zhvendosjen e saj me numra prandaj e perdorim integer.parseInt per ta kthyer ne int dhe vleren trim per ti hek hapesirat
        var karakteri = IO.readln("Shkruaj shkronjen a-z: ").trim();

        int zhvendosja = (zgjedhja == 3) ? 13 : Integer.parseInt(IO.readln("Shkruaj zhvendosjen 1-25: ").trim());
        if (karakteri.length() != 1) {
            IO.println("Ju lutem shkruani vetem nje shkronje.");
        }
//nese perdoruesi shkruan me shume se nje shkronje, programi do te shfaq nje mesazh gabimi dhe do te ndaloje ekzekutimin e kodit.
        else if (zhvendosja <1 || zhvendosja > 25) {
            //nese perdoruesi shkruan nje numer me te vogel se 1 ose me te madh se 25, programi do te shfaq nje mesazh gabimi dhe do te ndaloje ekzekutimin e kodit.
            IO.println("Ju lutem shkruani nje numer nga 1 deri ne 25.");
        }else {
            var shkronja = karakteri.charAt(0);
            boolean Evogel = shkronja >= 'a' && shkronja <= 'z';
            boolean Emadhe = shkronja >= 'A' && shkronja <= 'Z';
            //nese shkronja nuk eshte as e vogel as e madhe, programi do te shfaq nje mesazh gabimi dhe do te ndaloje ekzekutimin e kodit.
            if (!Evogel && !Emadhe) {
                IO.println("Shkruani nje shkronje nga a-z pa ë dhe ç ");
            }else {
                char fillimi = Emadhe ? 'a' : 'A';;
                //nese shkronja eshte e madhe, fillimi do te jete 'A', nese eshte e vogel, fillimi do te jete 'a'
                int pozita = (shkronja - fillimi+drejtimi * zhvendosja + 26) % 26;

                //shkronja - fillimi e kthen shkronjën në pozitën e saj origjinale. Nëse fillimi është 'a', atëherë a=0, b=1, ..., z=25. Nëse është 'A', e njëjta gjë vlen për shkronjat e mëdha.
                //drejtimi * zhvendosja është sa vende lëvizim dhe në cilin drejtim. Për enkriptim drejtimi është 1, pra lëvizim përpara (+3). Për dekriptim është -1, pra prapa (-3).
                //+ 26 e mban numrin pozitiv. Pa të, a (0) me zhvendosje -3 jep -3, dhe në Java % kthen numër negativ për numra negativë.
                //% 26 e rikthen rezultatin brenda 0-25, kështu që pas z alfabeti vazhdon nga a (si një rreth
                //
                //
                char rezultati = (char) (fillimi + pozita);
                IO.println(shkronja + " u zhvendos ne " + rezultati);
                System.out.printf("Zhvendosja: %d nga 26 shkronjat (%.2f%% e alfabetit)%n", zhvendosja, (zhvendosja / 26.0) * 100);
//%d vendoset te numri i plotë i parë, pra zhvendosja.
//%.2f vendoset te numri i dytë me presje dhjetore, i shfaqur me dy shifra pas pikës.
//%% printon shenjën %. Një % i vetëm do të ishte fillim formati dhe do të jepte gabim, ndaj duhet shkruar dy herë.
//%n bën rresht të ri (si \n, por i përshtatshëm për çdo sistem).
//
//Vlerat renditen sipas radhës së %: zhvendosja shkon te %d, kurse (zhvendosja / 26.0) * 100 te %.2f.

            }

        }

    }


}