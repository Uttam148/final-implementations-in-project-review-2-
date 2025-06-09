package com.cybercrafters.service;

import com.cybercrafters.model.Student;
import com.cybercrafters.util.Validator;
import java.util.List;

public class StudentService {
    private final FileManager fileManager;

    public StudentService(String mode) {
        this.fileManager = new FileManager(mode);
    }

    public void addStudent(Student student) throws Exception {
        Validator.ValidationResult result = Validator.validateStudent(student);
        if (!result.isValid()) {
            throw new IllegalArgumentException(result.getErrorMessage());
        }
        fileManager.saveStudent(student);
    }

    public List<Student> getAllStudents() throws Exception {
        return fileManager.loadAllStudents();
    }
    
    // Other CRUD methods...
}
