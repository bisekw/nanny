package pl.nannyangel;

import java.text.SimpleDateFormat;

public class zlecenie {
    long id;
    String zleceniobiorca;
    String nazwazlecenia;
    SimpleDateFormat datazgloszenia = new SimpleDateFormat("dd.MM.yyyy"); //da
    SimpleDateFormat datazakonczeniazlecenia = new SimpleDateFormat("dd.MM.yyyy");
    SimpleDateFormat datapodpisania = new SimpleDateFormat("dd.MM.yyyy"); //data podpisania umowy
    String Status_Zlecenia;
    boolean zaliczka_wplacona;
    int kwota_zlecenia;
    int zaliczka_kwota;
    int pozostaje_do_zaplaty;
    boolean praca_z_zamieszkaniem;
    boolean obecnosc_zwierzat;
    String zwierzeta;
    boolean monitoring;
    String zakres_obowiazkow;
    String godziny_pracy
    String dni_tygodnia_pracujace;
    String dlugosc_wspolpracy;
    SimpleDateFormat datarozpoczecia_wspulpracy = new SimpleDateFormat("dd.MM.yyyy");
    int wynagrodzenie_miesiecznie;
    int wynagrodzenie_godzinowe;
    boolean umowa_uaktywniajaca;
    String porzadane_cechy_charakteru;
    String dyskwalifikujace_cechy_charakteru;
    String preferowany_wiek
    boolean posiadanie_wlasnych_dzieci;
    int lat_doswiadczenia;
    char plec;
    String notatka; // notatka do klienta
    String street; //adres ulica
    String city; //adres miasto
    String zipcode; //adres kod pocztowy
    String adresinfo; // adress informacja dodatkowa klatka pietro itp.
    boolean zlecenie_godzinowe;
    String model_wychowawczy;

    public zlecenie(String zleceniobiorca, String nazwazlecenia,SimpleDateFormat datazgloszenia,SimpleDateFormat datazakonczeniazlecenia,SimpleDateFormat datapodpisania, String Status_Zlecenia,boolean zaliczka_wplacona,
            int kwota_zlecenia,int zaliczka_kwota,int pozostaje_do_zaplaty,boolean praca_z_zamieszkaniem,boolean obecnosc_zwierzat,String zwierzeta,boolean monitoring,String zakres_obowiazkow,String godziny_pracy,String dni_tygodnia_pracujace,
            String dlugosc_wspolpracy,SimpleDateFormat datarozpoczecia_wspulpracy,int wynagrodzenie_miesiecznie,int wynagrodzenie_godzinowe,boolean umowa_uaktywniajaca,String porzadane_cechy_charakteru,String dyskwalifikujace_cechy_charakteru,
                            String preferowany_wiek,boolean posiadanie_wlasnych_dzieci,int lat_doswiadczenia,char plec,String notatka,String street,String city,String zipcode, String adresinfo, boolean zlecenie_godzinowe,String model_wychowawczy)
    {
        this.zleceniobiorca=zleceniobiorca;
        this.nazwazlecenia=nazwazlecenia;
        this.datazgloszenia=datazgloszenia;
        this.datazakonczeniazlecenia=datazakonczeniazlecenia;
        this.datapodpisania=datapodpisania;
        this.Status_Zlecenia=Status_Zlecenia;
        this.zaliczka_wplacona=zaliczka_wplacona;
        this.kwota_zlecenia=kwota_zlecenia;
        this.zaliczka_kwota=zaliczka_kwota;
        this.pozostaje_do_zaplaty=pozostaje_do_zaplaty;
        this.praca_z_zamieszkaniem=praca_z_zamieszkaniem;
        this.obecnosc_zwierzat=obecnosc_zwierzat;
        this.zwierzeta=zwierzeta;
        this.monitoring=monitoring;
        this.zakres_obowiazkow=zakres_obowiazkow;
        this.godziny_pracy=godziny_pracy;
        this.dni_tygodnia_pracujace=dni_tygodnia_pracujace;
        this.dlugosc_wspolpracy=dlugosc_wspolpracy;
        this.datarozpoczecia_wspulpracy=datarozpoczecia_wspulpracy;
        this.wynagrodzenie_miesiecznie=wynagrodzenie_miesiecznie;
        this.wynagrodzenie_godzinowe=wynagrodzenie_godzinowe;
        this.umowa_uaktywniajaca=umowa_uaktywniajaca;
        this.porzadane_cechy_charakteru=porzadane_cechy_charakteru;
        this.dyskwalifikujace_cechy_charakteru=dyskwalifikujace_cechy_charakteru;
        this.preferowany_wiek=preferowany_wiek;
        this.posiadanie_wlasnych_dzieci=posiadanie_wlasnych_dzieci;
        this.lat_doswiadczenia=lat_doswiadczenia;
        this.plec=plec;
        this.notatka=notatka;
        this.street=street;
        this.city=city;
        this.zipcode=zipcode;
        this.adresinfo=adresinfo;
        this.zlecenie_godzinowe=zlecenie_godzinowe;
        this.model_wychowawczy=model_wychowawczy;
    }
}
