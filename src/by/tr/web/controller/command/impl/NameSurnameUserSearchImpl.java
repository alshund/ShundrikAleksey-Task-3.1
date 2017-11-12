package by.tr.web.controller.command.impl;

import by.tr.web.controller.UtilityData;
import by.tr.web.controller.command.Command;
import by.tr.web.domain.User;
import by.tr.web.service.ServiceFactory;
import by.tr.web.service.UserService;
import by.tr.web.service.exception.ServiceSearchException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class NameSurnameUserSearchImpl implements Command {
    private UserService userService;

    public NameSurnameUserSearchImpl() {

        userService = ServiceFactory.getInstance().getUserService();
    }

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServiceSearchException, ServletException, IOException {
        String name = req.getParameter(UtilityData.FormAttributes.name.name());
        String surname = req.getParameter(UtilityData.FormAttributes.surname.name());

        List<User> searchResult = userService.nameSurnameSearch(name, surname);
        if (searchResult != null) {
            req.setAttribute(UtilityData.REQUEST_ATTRIBUTE, searchResult);
            RequestDispatcher dispatcher = req.getRequestDispatcher(UtilityData.SEARCH_RESULT_JSP);
            dispatcher.forward(req, resp);
        } else {
            resp.sendRedirect(UtilityData.INDEX_SP);
        }
    }
}