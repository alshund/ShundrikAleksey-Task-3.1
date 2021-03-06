package by.tr.web.controller.command;

import by.tr.web.service.exception.ServiceSearchException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface Command {
    void execute(HttpServletRequest req, HttpServletResponse resp) throws ServiceSearchException, ServletException, IOException;
}