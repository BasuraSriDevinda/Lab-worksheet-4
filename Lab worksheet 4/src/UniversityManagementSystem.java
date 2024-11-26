public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Create department
        Department dept = new Department("Software Engineering");

        // Create degree
        Degree degree = new Degree("Computer Science", 100);

        // Create course
        Course course = new Course("Object-Oriented Programming", "Mandatory", 50);

        // Create lecturer
        Lecturer lecturer = new Lecturer("John Doe", "Senior Lecturer", dept);

        // Create student
        Student student = new Student("Jane Smith", "S12345", "Sophomore", degree);

        // Assign information
        dept.offerCourse(course);
        dept.appointDepartmentHead(lecturer);
        degree.offerCourse(course);
        lecturer.addCourse(course);
        student.enrollCourse(course);

        // Display information
        lecturer.displayInfo();
        student.displayInfo();
        dept.displayInfo();
        course.displayInfo();
        degree.displayInfo();
    }
}
