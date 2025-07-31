import java.util.Arrays;

public class InformacjaOKategoriach {

    public void Wyswietl() {
        String[] kategoria = {"nazwa kategorii:","min. wiek:","pojazdy dla tej kategorii:","wymagania dodatkowe:","egz. teoretyczny/praktyczny"};
        String[] katAM = {"AM","14 lat","motorower i quad do 350 kg","przed 18:zgoda rodziców,starsi-brak wymagań","tak/tak"};
        String[] katA1 = {"A1","16 lat","motocykl o poj. silnika do 125 cm^3+pojazdy z kat. AM","przed 18:zgoda rodziców,starsi-brak wymagań","tak/tak"};
        String[] katA2 = {"A2","18 lat","motocykl o mocy nie większej niż 35 kW+pojazdy z kat. AM","brak wymagań","tak/tak"};
        String[] katA = {"A","20 lat/24 lata","motocykl+pojazdy z kat. AM","do 24 lat:2 lata z kat.A2,24 lata i starsi:brak","tak/tak"};
        String[] katB1 = {"B1","16 lat","minisamochód,wszystkie quady i pojazdy z kat.AM","przed 18:zgoda rodziców,starsi-brak wymagań,choć lepiej celować w kat. B","tak/tak"};
        String[] katB = {"B","18 lat","samochód osobowy+pojazdy z kat.B1","brak","tak/tak"};
        String[] katBE = {"B+E","18 lat","samochód osobowy z przyczepą+pojazdy z kat.B","posiadanie prawa jazdy kategorii B","nie/tak"};
        String[] katC1 = {"C1","18 lat","ciężarówka do 7,5 tony,zespół złożony z tego pojazdu i przyczepy lekkiej+pojazdy z kat.AM","posiadanie prawa jazdy kategorii B","tak/tak"};
        String[] katC1E = {"C1+E","18 lat","ciężarówka z przyczepą-łączna masa zestawu max 12 ton i pojazdy z kat. C1","posiadanie prawa jazdy kategorii C1","nie/tak"};
        String[] katC = {"C","18 lat/21 lat","ciężarówka,zespół złożony z tego pojazdu i przyczepy lekkiej+pojazdy z kat. AM","posiadanie prawa jazdy kategorii B,do 21 lat kwalifikacja wstępna","tak/tak"};
        String[] katCE = {"C+E","18 lat/21 lat","ciężarówka z przyczepą+pojazdy z kat. C","posiadanie prawa jazdy kategorii C,do 21 lat kwalifikacja wstępna","nie/tak"};
        String[] katD1 = {"D1","21 lat","autobus do 16 pasażerów,zespół złożony z tego pojazdu i przyczepy lekkiej+pojazdy z kat. AM","posiadanie prawa jazdy kategorii B","tak/tak"};
        String[] katD1E = {"D1+E","21 lat","autobus do 16 pasażerów z przyczepą+pojazdy z kat.D1","posiadanie prawa jazdy kategorii D1","nie/tak"};
        String[] katD = {"D","21 lat/23 lata/24 lata","autobus,zestaw złożony z tego pojazdu i przyczepy lekkiej+pojazdy z kat. AM","posiadanie prawa jazdy kategorii B,do 23 lat kwalifikacja wstępna,23 do 24 lat:kwalifikacja wstępna przyspieszona","tak/tak"};
        String[] katDE = {"D+E","21 lat/23 lata/24 lata","autobus z przyczepą+pojazdy z kat.D","posiadanie prawa jazdy kategorii D,do 23 lat kwalifikacja wstępna,23 do 24 lat:kwalifikacja wstępna przyspieszona","nie/tak"};
        String[] katT = {"T","16 lat","ciągnik lub pojazd wolnobieżny-z przyczepą lub bez+pojazdy z kat. AM","przed 18:zgoda rodziców,starsi-brak wymagań","tak/tak"};
        System.out.println(Arrays.toString(kategoria));
        System.out.println(Arrays.toString(katAM));
        System.out.println(Arrays.toString(katA1));
        System.out.println(Arrays.toString(katA2));
        System.out.println(Arrays.toString(katA));
        System.out.println(Arrays.toString(katB1));
        System.out.println(Arrays.toString(katB));
        System.out.println(Arrays.toString(katBE));
        System.out.println(Arrays.toString(katC1));
        System.out.println(Arrays.toString(katC1E));
        System.out.println(Arrays.toString(katC));
        System.out.println(Arrays.toString(katCE));
        System.out.println(Arrays.toString(katD1));
        System.out.println(Arrays.toString(katD1E));
        System.out.println(Arrays.toString(katD));
        System.out.println(Arrays.toString(katDE));
        System.out.println(Arrays.toString(katT));
    }
}
