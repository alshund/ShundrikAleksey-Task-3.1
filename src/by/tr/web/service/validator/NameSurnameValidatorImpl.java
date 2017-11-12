package by.tr.web.service.validator;

import by.tr.web.service.UtilityData;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameSurnameValidatorImpl implements Validator {
    @Override
    public boolean execute(String name, String surname) {
        return isValid(name) && isValid(surname);
    }

    private boolean isValid (String string) {
        Pattern pattern = Pattern.compile(UtilityData.INITIALS_RE);
        Matcher matcher = pattern.matcher(string);
        return matcher.matches();
    }
}
