public class Main {
        public static void main(String[] args) {
            StudentCRUD obj = new StudentCRUD();

            obj.insertStudent("Kunal", 85);
            obj.getAllStudents();
            obj.updateStudent(1, 90);
            obj.deleteStudent(1);
        }
    }