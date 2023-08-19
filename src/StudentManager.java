import java.util.ArrayList;
import java.util.List;

public class StudentManager {

        private List<Student> students;

        public StudentManager() {
            students = new ArrayList<>();
        }

        public void addStudent(Student student) {
            students.add(student);
        }

        public Student findStudentById(int id) {
            for (Student student : students) {
                if (student.getAge() == id) {
                    return student;
                }
            }
            return null;
        }

        public void updateStudentName(int id, String newName) {
            Student studentToUpdate = findStudentById(id);
            if (studentToUpdate != null) {
                studentToUpdate.setName(newName);
            }
        }

        public void removeStudentById(int id) {
            Student studentToRemove = findStudentById(id);
            if (studentToRemove != null) {
                students.remove(studentToRemove);
            }
        }

        @Override
        public String toString() {
            return "StudentManager{" +
                    "students=" + students +
                    '}';
        }
    }

