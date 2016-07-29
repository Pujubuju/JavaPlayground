package models;

public class User {
    private String _login;
    private String _password;

    public User(String login, String password){

        _login = login;
        _password = password;
    }

    public String get_login() {
        return _login;
    }

    public String get_password() {
        return _password;
    }
}
