import java.util.Arrays;

public class Kategorie {

    public void Wyswietl() {
        String[] kategoria = {"nazwa kategorii:","min. wiek:","pojazdy dla tej kategorii:","wymagania dodatkowe:"};
        String[] katAM = {"AM","14 lat","motorower i quad do 350 kg","przed 18:zgoda rodziców,starsi-brak wymagań"};
        String[] katA1 = {"A1","16 lat","motocykl o poj. silnika do 125 cm^3+pojazdy z kat. AM","przed 18:zgoda rodziców,starsi-brak wymagań"};
        String[] katA2 = {"A2","18 lat","motocykl o mocy nie większej niż 35 kW+pojazdy z kat. AM","brak wymagań"};
        String[] katA = {"A","20 lat/24 lata","motocykl+pojazdy z kat. AM","do 24 lat:2 lata z kat.A2,24 lata i starsi:brak"};
        System.out.println(Arrays.toString(kategoria));
        System.out.println(Arrays.toString(katAM));
        System.out.println(Arrays.toString(katA1));
        System.out.println(Arrays.toString(katA2));
        System.out.println(Arrays.toString(katA));
    }
}
