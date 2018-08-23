package pl.nannyangel;

public class User {

    int id;
    String login;
    String password;

    public User (String login, String password)
    {
        this.password=password;
        this.login=login;
    }
}
