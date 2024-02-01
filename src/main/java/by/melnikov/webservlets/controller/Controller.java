package by.melnikov.webservlets.controller;

import java.io.*;

import by.melnikov.webservlets.controller.command.CommandType;
import by.melnikov.webservlets.controller.command.ICommand;
import by.melnikov.webservlets.exception.CommandException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import static by.melnikov.webservlets.controller.RequestParameter.COMMAND;

@WebServlet(name = "Controller", value = "/controller")
public class Controller extends HttpServlet {
    public void init() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        String strCommand = request.getParameter(COMMAND);
        ICommand command = CommandType.defineCommand(strCommand);
        String page;
        try {
            page = command.execute(request);
            request.getRequestDispatcher(page).forward(request, response);
        } catch (CommandException e) {
            throw new RuntimeException(e);
        }
    }

    public void destroy() {
    }
}