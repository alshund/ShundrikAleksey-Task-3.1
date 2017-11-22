package by.tr.web.dao.impl;

import by.tr.web.dao.UserDAO;
import by.tr.web.dao.UtilityData;
import by.tr.web.dao.exception.DAOSearchException;
import by.tr.web.domain.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SQLUserDAOImpl implements UserDAO {
    private Connection connection;// некорректно выносить данные поля в поля экземпляра класса
    // в многопоточном приложении они станут у тебя разделяемыми ресурсами со всеми вытекающими
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;

    @Override
    public List<User> nameSurnameSearch(String name, String surname) throws DAOSearchException, SQLException {

        try {
            openConnection();
            preparedStatement = connection.prepareStatement(UtilityData.NAME_SURNAME_SELECT);
            preparedStatement.setString(UtilityData.NAME_PARAMETER_INDEX, name);
            preparedStatement.setString(UtilityData.SURNAME_PARAMETER_INDEX, surname);
            resultSet = preparedStatement.executeQuery();
            return getUsers();
        } catch (SQLException e) {
            throw new DAOSearchException(UtilityData.DAO_EXCEPTION_MESSAGE, e);
        } finally {
            closeAll();
        }
    }

    private void openConnection() throws SQLException {

        DriverManager.registerDriver(new com.mysql.jdbc.Driver ());// первое - ну где вы находите этот код, Class.forName() чем тебе не нравится
        //второе - ты посчитал, сколько раз будет выполнять данный оператор, а зачем он создает новый драйвер при каждом вызове метода?
        connection = DriverManager.getConnection(UtilityData.URL, UtilityData.USER, UtilityData.PASS);
    }

    private void closeAll() throws SQLException {

        resultSet.close();// если тут случится Exception - больше ничего и не закроется
        preparedStatement.close();
        connection.close();
    }

    private List<User> getUsers() throws SQLException {

        List<User> users = new ArrayList<>();
        while (resultSet.next()) {
            users.add(createUser(resultSet));
        }
        return users;
    }

    private User createUser(ResultSet resultSet) throws SQLException {

        User user = new User();
        user.setName(resultSet.getString(UtilityData.TableAttributes.name.name()));
        user.setSurname(resultSet.getString(UtilityData.TableAttributes.surname.name()));
        user.setPhoneNumber(resultSet.getString(UtilityData.TableAttributes.phone_number.name()));
        user.setEmail(resultSet.getString(UtilityData.TableAttributes.email.name()));
        return user;
    }
}
