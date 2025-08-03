import java.util.Scanner;

public class EgzaminZJazdy {
    Scanner sc = new Scanner(System.in);
    public void InformacjaOEgzaminie() {
        System.out.println("Po zdanym egzaminie teoretycznym dla danej kategorii,można podejść do części praktycznej;jeśli nie przewidziano części teoretycznej,można zdawać egzamin z jazdy od razu.");
    }
    public void PrzejedzPlac() {
        System.out.println("Jazda po placu manewrowym.");
        System.out.println("1.Przygotowanie do jazdy.");
        System.out.println("Sprawdzić wybrany wskaźnik lub dźwięk klaksonu,potem jedno ze świateł.");
        System.out.println("2.Ruszanie z miejsca oraz jazda po łuku do przodu i do tyłu.");
        System.out.println("Nie najeżdżać na pachołki na linii,linię też zostawić w spokoju.");
        System.out.println("3.Ruszanie z miejsca do przodu na wzniesieniu.");
        System.out.println("Potrzebny działający hamulec ręczny.");
        System.out.println("Dodatkowe zadania na placu:quady i motocykle.");
        System.out.println("Czy egzamin jest na quad lub motocykl? T/t-tak,N/n-nie");
        char motoquad =  sc.next().charAt(0);
        if(motoquad == 'T' || motoquad == 't'){
            System.out.println("1A/AM.Slalom wolny.");
            System.out.println("2A/AM.Slalom szybki.");
            System.out.println("3A/AM.Jazda po łukach w kształcie cyfry 8.");
            System.out.println("4A/AM.Zdjęcie pojazdu z podpórki i przemieszczenie go przy unieruchomionym silniku.");
            System.out.println("Czy egzamin jest na motocykl? T/t-tak,N/n-nie");
            char motocykl =  sc.next().charAt(0);
            if (motocykl == 'T' || motocykl == 't'){
                System.out.println("5A.Ominięcie przeszkody.");
            }else{
                System.out.println("To był quad.");
            }
        }else{
            System.out.println("Inny pojazd.");
        }
        System.out.println("Plac z głowy,teraz miasto.");
    }
    public void PrzejedzMiasto() {
        System.out.println("Jazda po mieście.");
        System.out.println("1.Włączanie się do ruchu.");
        System.out.println("2.Jazda drogami dwukierunkowymi jednojezdniowymi.");
        System.out.println("3.Jazda drogami dwukierunkowymi dwujezdniowymi.");
        System.out.println("4.Jazda drogami jednokierunkowymi.");
        System.out.println("5.Przejazd przez skrzyżowania równorzędne.");
        System.out.println("6.Przejazd przez skrzyżowania oznakowane znakami ustalającymi pierwszeństwo przejazdu.");
        System.out.println("7.Przejazd przez skrzyżowania z sygnalizacją świetlną.");
        System.out.println("8.Przejazd przez skrzyżowania,na których ruch odbywa się wokół wyspy.");
        System.out.println("9.Przejazd przez węzeł.");
        System.out.println("10.Przejazd przez przejścia dla pieszych.");
        System.out.println("11.Parkowanie-skośne,równoległe lub prostopadłe.");
        System.out.println("12.Zawracanie");
        System.out.println("13.Przejazd obok przystanku tramwajowego i autobusowego.");
        System.out.println("Koło przystanku tramwajowego przejeżdżamy,gdy tramwaje w ogóle jeżdżą w mieście,gdzie zdajemy egzamin.");
        System.out.println("14.Wyprzedzanie.");
        System.out.println("15.Omijanie.");
        System.out.println("16.Wymijanie.");
        System.out.println("17.Zmiana pasa ruchu.");
        System.out.println("18.Zmiana kierunku jazdy w prawo.");
        System.out.println("19.Zmiana kierunku jazdy w lewo.");
        System.out.println("20.Zawracanie na skrzyżowaniu.");
        System.out.println("21.Hamowanie do zatrzymania we wskazanym miejscu.");
        System.out.println("22.Hamowanie awaryjne - niekonieczne.");
        System.out.println("23.Właściwa zmiana biegów-jazda energooszczędna.");
        System.out.println("24.Hamowanie silnikiem przy zatrzymaniu i zwalnianiu-jazda energooszczędna.");
        System.out.println("25.Respektowanie dopuszczalnej prędkości.");
        System.out.println("26.Zachowanie w odniesieniu do znaków poziomych.");
        System.out.println("27.Zachowanie w odniesieniu do znaków pionowych.");
        System.out.println("28.Zachowanie w odniesieniu do sygnałów świetlnych.");
        System.out.println("29.Zachowanie w odniesieniu do poleceń osoby kierującej ruchem.");
        System.out.println("30.Zachowanie w odniesieniu do innych uczestników ruchu.");
        System.out.println("31.Respektowanie zasad techniki kierowania pojazdami.");
        System.out.println("Przyczepy,tunele i przejazdy-zadania dodatkowe.");
        System.out.println("Czy egzamin dotyczy pojazdu z przyczepą?T/t-tak,N/n-nie");
        char przyczepa = sc.next().charAt(0);
        if(przyczepa == 'T'||przyczepa == 't'){
            System.out.println("1P.Rozprzęganie.");
        }else{
            System.out.println("Jedziemy dalej.");
        }
        System.out.println("Czy w pobliżu ośrodka jest tunel?T/t-tak,N/n-nie");
        char tunel = sc.next().charAt(0);
        if(tunel == 'T'||tunel == 't'){
            System.out.println("1T.Przejazd przez tunel.");
        }else{
            System.out.println("Jedziemy dalej.");
        }
        System.out.println("Czy w pobliżu ośrodka jest przejazd kolejowy i/lub tramwajowy?T/t-tak,N/n-nie");
        char przejazd = sc.next().charAt(0);
        if(przejazd == 'T'||przejazd == 't'){
            System.out.println("1K.Przejazd przez torowisko tramwajowe i kolejowe.");
        }else{
            System.out.println("Jedziemy dalej.");
        }
        System.out.println("Koniec egzaminu,jedziemy do WORD-u.");
        System.out.println("Egzaminy zdane-możemy wyrabiać prawo jazdy.");
    }
}