package pl.nannyangel;

import java.text.SimpleDateFormat;

public class Client {
    long id;
    String name; //imie
    String lastname; //nazwisko
    int tel; //telefon kontaktowy
    String email;
    String donumber; //nr dowodu osobistego
    int pesel; //nr pesel
    SimpleDateFormat adddate = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss"); //data dodania
    String notatka; // notatka do klienta
    String street; //adres ulica
    String city; //adres miasto
    String zipcode; //adres kod pocztowy
    String adresinfo; // adress informacja dodatkowa klatka pietro itp.
    String preferowana_forma_kontaktu;

    public Client(String name,String lastname,int tel,String email,String donumber, int pesel, SimpleDateFormat adddate,String notatka,String street,String city,String zipcode,String adresinfo,String preferowana_forma_kontaktu)
    {
        this.name=name;
        this.lastname=lastname;
        this.tel=tel;
        this.email=email;
        this.donumber=donumber;
        this.pesel=pesel;
        this.adddate=adddate;
        this.notatka=notakta;
        this.street=street;
        this.city=city;
        this.zipcode=zipcode;
        this.adresinfo=adresinfo;
        this.preferowana_forma_kontaktu=preferowana_forma_kontaktu;
    }
}
