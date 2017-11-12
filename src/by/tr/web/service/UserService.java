package by.tr.web.service;

import by.tr.web.domain.User;
import by.tr.web.service.exception.ServiceSearchException;

import java.util.List;

public interface UserService {
    List<User> nameSurnameSearch(String name, String surname) throws ServiceSearchException;
}
