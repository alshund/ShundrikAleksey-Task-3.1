package by.tr.web.service.exception;

public class ServiceSearchException extends Exception {
    public static final long serialVersionUID = 4L;

    public ServiceSearchException() {
        super();
    }

    public ServiceSearchException(String message) {
        super(message);
    }

    public ServiceSearchException(Exception e) {
        super(e);
    }

    public ServiceSearchException(String message, Exception e) {
        super(message, e);
    }

}
