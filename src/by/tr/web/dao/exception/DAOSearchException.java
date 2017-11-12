package by.tr.web.dao.exception;

public class DAOSearchException extends Exception {
    public static final long serialVersionUID = 3L;

    public DAOSearchException() {
        super();
    }

    public DAOSearchException(String message) {
        super(message);
    }

    public DAOSearchException(Exception e) {
        super(e);
    }

    public DAOSearchException(String message, Exception e) {
        super(message, e);
    }
}
