package by.tr.web.dao;

import by.tr.web.dao.exception.DAOSearchException;
import by.tr.web.domain.User;

import java.sql.SQLException;
import java.util.List;

public interface UserDAO {
    List<User> nameSurnameSearch(String name, String surname) throws DAOSearchException, SQLException;// шикарное название метода (это стеб)
}
