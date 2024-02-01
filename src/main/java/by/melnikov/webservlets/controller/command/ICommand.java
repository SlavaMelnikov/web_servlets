package by.melnikov.webservlets.controller.command;

import by.melnikov.webservlets.exception.CommandException;
import jakarta.servlet.http.HttpServletRequest;

@FunctionalInterface
public interface ICommand {
    String execute(HttpServletRequest request) throws CommandException;
}
