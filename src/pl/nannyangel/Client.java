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
    boolean zleceniodawca;
    SimpleDateFormat dataurodzenia = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss"); //data urodzenia

}
