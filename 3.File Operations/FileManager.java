package com.cybercrafters.service;

import com.cybercrafters.model.Student;
import com.cybercrafters.util.EncryptionUtil;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
    private final boolean binaryMode;
    private static final String DATA_FILE = "students.dat";
    private static final String BACKUP_DIR = "backups";

    public FileManager(String mode) {
        this.binaryMode = "binary".equals(mode);
        new File(BACKUP_DIR).mkdirs();
    }

    public synchronized void saveStudent(Student student) throws IOException {
        List<Student> students = loadAllStudents();
        students.add(student);
        saveToFile(students);
        createBackup(students);
    }

    private void saveToFile(List<Student> students) throws IOException {
        if (binaryMode) {
            try (ObjectOutputStream oos = new ObjectOutputStream(
                 new FileOutputStream(DATA_FILE))) {
                oos.writeObject(EncryptionUtil.encrypt(students));
            }
        } else {
            // CSV implementation
        }
    }
    
    // Other file operations...
}
