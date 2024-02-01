package by.melnikov.webservlets.controller.command.impl.admin;

import by.melnikov.webservlets.controller.command.ICommand;
import by.melnikov.webservlets.exception.CommandException;
import jakarta.servlet.http.HttpServletRequest;

public class DeleteUserCommand implements ICommand {
    @Override
    public String execute(HttpServletRequest request) throws CommandException {
        return null;
    }
}
