package com.cybercrafters.controller;

import com.cybercrafters.model.Student;
import com.cybercrafters.service.StudentService;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class StudentController {
    @FXML private TableView<Student> studentTable;
    @FXML private TextField txtId, txtName, txtEmail;
    
    private StudentService studentService;

    public void setStudentService(StudentService service) {
        this.studentService = service;
        loadStudents();
    }

    @FXML
    private void handleAddStudent() {
        try {
            Student student = new Student(
                txtId.getText(),
                txtName.getText(),
                txtEmail.getText(),
                "A" // Default grade
            );
            
            studentService.addStudent(student);
            showAlert("Success", "Student added!");
            loadStudents();
        } catch (Exception e) {
            showAlert("Error", e.getMessage());
        }
    }
    
    private void loadStudents() {
        // Async implementation
    }
}
