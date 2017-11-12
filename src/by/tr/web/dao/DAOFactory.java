package by.tr.web.dao;

import by.tr.web.dao.impl.SQLUserDAOImpl;

public class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();
    private final UserDAO userDAO = new SQLUserDAOImpl();

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public static DAOFactory getInstance() {
        return instance;
    }

    private DAOFactory() {}
}
