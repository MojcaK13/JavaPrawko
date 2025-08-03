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
    }
    public void PrzejedzMiasto() {
        System.out.println("Jazda po mieście.");
    }
}
