package by.tr.web.controller;

public class UtilityData {

    public enum FormAttributes{
        name, surname, command
    }

    public static final String REQUEST_ATTRIBUTE = "userList";
    public static final String USERS_NAME_SURNAME_SEARCH = "users_name_surname_search";
    public static final String SEARCH_RESULT_JSP = "/WEB-INF/jsp/SearchResult.jsp";
    public static final String INDEX_SP = "/index.jsp";
    public static final String ENCODING_FILTER = "encoding";

    private UtilityData() {}
}