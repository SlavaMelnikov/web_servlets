package by.melnikov.webservlets.controller.command.impl.common;

import by.melnikov.webservlets.controller.command.ICommand;
import by.melnikov.webservlets.exception.CommandException;
import by.melnikov.webservlets.exception.ServiceException;
import by.melnikov.webservlets.model.service.CommonService;
import by.melnikov.webservlets.model.service.impl.CommonServiceImpl;
import jakarta.servlet.http.HttpServletRequest;

import static by.melnikov.webservlets.controller.PagePath.HOME_PAGE;
import static by.melnikov.webservlets.controller.PagePath.LOGIN_PAGE;
import static by.melnikov.webservlets.controller.RequestParameter.*;

public class LoginCommand implements ICommand {
    @Override
    public String execute(HttpServletRequest request) throws CommandException {
        String login = request.getParameter(LOGIN);
        String password = request.getParameter(PASSWORD);
        CommonService commonService = CommonServiceImpl.getInstance();
        boolean isLoginAndPasswordCorrect = false;
        try {
            isLoginAndPasswordCorrect = commonService.authenticate(login, password);
        } catch (ServiceException e) {
            throw new CommandException(e.getMessage(), e);
        }
        String page;
        if (isLoginAndPasswordCorrect) {
            request.setAttribute(USER, login);
            page = HOME_PAGE;
        } else {
            request.setAttribute(INCORRECT_LOGIN_OR_PASSWORD, INCORRECT_LOGIN_OR_PASSWORD_MESSAGE);
            page = LOGIN_PAGE;
        }
        return page;
    }
}
