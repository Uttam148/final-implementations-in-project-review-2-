package com.cybercrafters.util;

import com.cybercrafters.model.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Validator {
    private static final Pattern ID_PATTERN = Pattern.compile("STD\\d{4}");
    private static final Pattern NAME_PATTERN = Pattern.compile("^[a-zA-Z ]+$");
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[\\w-.]+@([\\w-]+\\.)+[\\w-]{2,4}$");

    public static ValidationResult validateStudent(Student student) {
        ValidationResult result = new ValidationResult();
        
        if (!ID_PATTERN.matcher(student.getId()).matches()) {
            result.addError("ID must be in STD0000 format");
        }
        
        if (!NAME_PATTERN.matcher(student.getName()).matches()) {
            result.addError("Name can only contain letters and spaces");
        }
        
        if (!EMAIL_PATTERN.matcher(student.getEmail()).matches()) {
            result.addError("Invalid email format");
        }
        
        return result;
    }

    public static class ValidationResult {
        private final List<String> errors = new ArrayList<>();
        
        public boolean isValid() { return errors.isEmpty(); }
        public String getErrorMessage() { return String.join("\n", errors); }
        public void addError(String message) { errors.add(message); }
    }
}
