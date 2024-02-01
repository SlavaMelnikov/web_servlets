package by.melnikov.webservlets.controller.command;

import by.melnikov.webservlets.controller.command.impl.admin.*;
import by.melnikov.webservlets.controller.command.impl.common.*;
import by.melnikov.webservlets.controller.command.impl.user.*;

public enum CommandType {

    /*
    User commands
     */
    ADD_CARD(new AddCardCommand()),
    ADD_MONEY_TO_BALANCE(new AddMoneyToBalanceCommand()),
    CHANGE_LASTNAME(new ChangeLastNameCommand()),
    CHANGE_PHONE(new ChangePhoneCommand()),
    START_ORDER(new StartOrderCommand()),
    FINISH_ORDER(new FinishOrderCommand()),

    /*
    Admin commands
     */
    CHANGE_USER_STATUS(new ChangeUserStatusCommand()),
    CHANGE_PARKING_POINT_STATUS(new ChangeParkingPointStatusCommand()),
    CHANGE_BIKE_STATUS(new ChangeBikeStatusCommand()),
    MAKE_USER_TO_ADMIN(new MakeUserToAdminCommand()),
    DELETE_USER(new DeleteUserCommand()),
    GET_BAD_FEEDBACKS(new GetBadFeedbacksCommand()),

    /*
    Common commands
     */
    REGISTRATION(new RegistrationCommand()),
    LOGIN(new LoginCommand()),
    LOGOUT(new LogoutCommand()),
    CHANGE_LOGIN(new ChangeLoginCommand()),
    CHANGE_PASSWORD(new ChangePasswordCommand()),
    CHANGE_NAME(new ChangeNameCommand()),
    CHANGE_EMAIL(new ChangeEmailCommand()),
    DEFAULT(new DefaultCommand());

    private final ICommand command;

    CommandType(ICommand command) {
        this.command = command;
    }

    public static ICommand defineCommand(String commandStr) {
        CommandType currentCommandType;
        try {
            currentCommandType = CommandType.valueOf(commandStr.toUpperCase());
        } catch (NullPointerException | IllegalArgumentException e) {
            currentCommandType = DEFAULT;
        }

        return currentCommandType.command;
    }
}
