package by.tr.web.controller;

import by.tr.web.controller.command.Command;
import by.tr.web.controller.command.CommandDirector;
import by.tr.web.service.exception.ServiceSearchException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FrontController extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        super.service(req, resp);// жутко нужный код...
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {
            String commandName = req.getParameter(UtilityData.FormAttributes.command.name());
            CommandDirector commandDirector = new CommandDirector();
            Command command = commandDirector.getCommand(commandName);
            command.execute(req, resp);
        } catch (ServiceSearchException e) {
            e.printStackTrace();// правда? просто printStackTrace? а пользователю уйдет чистая белая страница???
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        super.doPost(req, resp);// че, правда? doPost базового класса? чтож он такое интересное делает?
    }
}
