package pl.nannyangel;

import java.text.SimpleDateFormat;

public class Niania {
    long id;
    String name; //imie
    String lastname; /
    int tel; //telefon kontaktowy
    String email;
    String donumber; //nr dowodu osobistego
    int pesel; //nr pesel
    SimpleDateFormat adddate = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss"); //data dodania
    String notatka; // notatka do klienta
    String street; //adres ulica
    String city; //adres miasto
    String zipcode; //adres kod pocztowy
    SimpleDateFormat dataurodzenia = new SimpleDateFormat("dd.MM.yyyy"); //data urodzenia
    String wyksztalcenie;
    String Dodatkowe_kursy;
    boolean kurs_pierwszej_pomocy;
    boolean prawo_jazdy;
    String jezyki_obce;
    int stawka_h_jedno_dziecko;
    int stawka_h_dwojka_dzieci;
    int stawka_h_troje_i_wiecej;
    int stawka_pełny_etat_;
    String umowa_uaktywniajaca;
    SimpleDateFormat data_pierwszej_pracy = new SimpleDateFormat("dd.MM.yyyy");
    boolean praca_na_godziny;
    String zakres_obowiazkow;
    String preferowana_forma_kontaktu;


    public Niania(String name,String lastname,int tel,String email,String donumber,int pesel,SimpleDateFormat adddate,String notatka,String street,String city,String zipcode,SimpleDateFormat dataurodzenia,String wyksztalcenie,String Dodatkowe_kursy,
                  boolean kurs_pierwszej_pomocy,boolean prawo_jazdy,String jezyki_obce, int stawka_h_jedno_dziecko,int stawka_h_dwojka_dzieci, int stawka_h_troje_i_wiecej,int stawka_pełny_etat_,String umowa_uaktywniajaca,SimpleDateFormat data_pierwszej_pracy,
                  boolean praca_na_godziny,String zakres_obowiazkow,String preferowana_forma_kontaktu)
    {
        this.name=name;
        this.lastname=lastname;
        this.tel=tel;
        this.email=email;
        this.donumber=donumber;
        this.pesel=pesel;
        this.adddate=adddate;
        this.notatka=notatka;
        this.street=street;
        this.city=city;
        this.zipcode=zipcode;
        this.dataurodzenia=dataurodzenia;
        this.wyksztalcenie=wyksztalcenie;
        this.Dodatkowe_kursy=Dodatkowe_kursy;
        this.kurs_pierwszej_pomocy=kurs_pierwszej_pomocy;
        this.prawo_jazdy=prawo_jazdy;
        this.jezyki_obce=jezyki_obce;
        this.stawka_h_jedno_dziecko=stawka_h_jedno_dziecko;
        this.stawka_h_dwojka_dzieci=stawka_h_dwojka_dzieci;
        this.stawka_pełny_etat_=stawka_pełny_etat_;
        this.umowa_uaktywniajaca=umowa_uaktywniajaca;
        this.data_pierwszej_pracy=data_pierwszej_pracy;
        this.praca_na_godziny=praca_na_godziny;
        this.zakres_obowiazkow=zakres_obowiazkow;
        this.preferowana_forma_kontaktu=preferowana_forma_kontaktu;
    }
}
