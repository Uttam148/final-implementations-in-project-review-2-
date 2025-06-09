# final-implementations-in-project-review-2-
markdown
# Student Database Management System

![Java](https://img.shields.io/badge/Java-17-blue)
![JavaFX](https://img.shields.io/badge/JavaFX-17-orange)
![License](https://img.shields.io/badge/License-MIT-green)

A robust GUI-based student record system using file handling with complete CRUD operations, data validation, and automatic backups.


## Features

✅ **Core CRUD Operations**  
- Create, Read, Update, Delete student records  
- Search by Student ID or name  

✅ **Dual Storage Modes**  
- Text (CSV) for readability  
- Binary with AES-256 encryption  

✅ **Advanced Error Handling**  
- Real-time input validation  
- Automatic backup restoration  
- Graceful crash recovery  

✅ **Innovative Extras**  
- Export to JSON/XML  
- Statistics dashboard  
- Responsive JavaFX UI  

## Technology Stack

- **Language**: Java 17
- **UI Framework**: JavaFX
- **Data Persistence**: File Handling (CSV + Binary)
- **Dependencies**: 
  - Jackson (JSON export)
  - JUnit (Testing)

## Installation

### Prerequisites
- JDK 17+
- Maven 3.8+

### Steps
1.Build the project:

bash
cd student-database-gui
mvn clean package
Run the application:

[bash]
java -jar target/studentdb.jar
Usage
Adding a Student
Enter ID in STDxxxx format

Fill name and email fields

Click "Add Student"

Exporting Data
bash
# JSON Export
File → Export → JSON

# XML Export 
File → Export → XML
File Formats
CSV Mode
csv
ID,Name,Email,Grade
STD1001,John Doe,john@uni.edu,A
STD1002,Jane Smith,jane@uni.edu,B
Binary Mode
AES-256 encrypted serialized objects

Automatic backups in backups/ directory

Project Structure
.txt
src/
├── main/
│   ├── java/
│   │   └── com/cybercrafters/
│   │       ├── controller/   # UI Logic
│   │       ├── model/        # Data Classes
│   │       ├── service/      # Business Logic
│   │       └── util/         # Utilities
│   └── resources/            # FXML/CSS
└── test/                     # Unit Tests
Validation Rules
Field	Rules	Example
ID	STD + 4 digits	STD1001
Name	Letters and spaces only	John Doe
Email	Valid email format	name@uni.edu
Troubleshooting
Issue: "File corruption detected"
Solution: System auto-restores from latest backup in backups/

Issue: Invalid ID format
Solution: Follow STDxxxx pattern (e.g., STD1001)

Team
Uttam Kumar (Team Lead)

Vivek Latwal

Krish Singh

Rudra Pratap Singh

License
This project is licensed under the MIT License - see the LICENSE file for details.

text

