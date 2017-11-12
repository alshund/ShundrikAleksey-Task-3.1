package by.tr.web.controller.command;

import by.tr.web.controller.UtilityData;
import by.tr.web.controller.command.impl.NameSurnameUserSearchImpl;

import java.util.HashMap;
import java.util.Map;

public class CommandDirector {
    private Map<String, Command> commandMap = new HashMap<>();

    public CommandDirector() {
        commandMap.put(UtilityData.USERS_NAME_SURNAME_SEARCH, new NameSurnameUserSearchImpl());
    }

    public Command getCommand(String commandName) {
        return commandMap.get(commandName);
    }
}