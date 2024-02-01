package by.melnikov.webservlets.controller.command.impl.common;

import by.melnikov.webservlets.controller.command.ICommand;
import by.melnikov.webservlets.exception.CommandException;
import jakarta.servlet.http.HttpServletRequest;

public class DefaultCommand implements ICommand {
    @Override
    public String execute(HttpServletRequest request) throws CommandException {
        return "index.jsp"; // так писать нельзя. В КОНСТАНТЫ!
    }
}
