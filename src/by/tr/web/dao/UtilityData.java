package by.tr.web.dao;

public class UtilityData {
    public static final String URL = "jdbc:mysql://localhost:3306/simple_servlet[EPAM]?autoReconnect=true&useSSL=false";
    public static final String USER = "alshund";
    public static final String PASS = "!Islonimski_sokI!";

    public static final String NAME_SURNAME_SELECT = "SELECT * FROM users WHERE name = ? AND surname = ?;";
    public static final int NAME_PARAMETER_INDEX = 1;
    public static final int SURNAME_PARAMETER_INDEX = 2;

    public enum TableAttributes {
        name, surname, phone_number, email
    }
}
