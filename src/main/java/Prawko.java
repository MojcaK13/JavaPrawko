import java.util.Scanner;

public class Prawko {
    public static void main(String[] args) {
        InformacjaOKategoriach informacjaOKategoriach = new InformacjaOKategoriach();
        EgzaminZJazdy egzaminZJazdy = new EgzaminZJazdy();
        Scanner autko = new Scanner(System.in);
        System.out.println("Wszystko o prawie jazdy w Polsce");
        System.out.println("Proszę wybrać:i/I - informacje o obowiązujących w Polsce kategoriach prawa jazdy i warunkach ich uzyskania;");
        System.out.println("E/e - informacje o przebiegu egzaminu praktycznego");
        char pojazd = autko.next().charAt(0);
        if (pojazd == 'i' || pojazd == 'I') {
            informacjaOKategoriach.Wyswietl();
        }else if (pojazd == 'e' || pojazd == 'E') {
            egzaminZJazdy.InformacjaOEgzaminie();
            egzaminZJazdy.PrzejedzPlac();
            egzaminZJazdy.PrzejedzMiasto();
            System.out.println("Jazda zakończona...jak zdane,to mamy wszystko z głowy...tylko wyrobić dokument-chyba,że nam jeszcze zostało coś do zdania.");
        }else{
            System.out.println("Niewłaściwa wartość!");
        }
    }
}
