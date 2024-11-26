import java.util.ArrayList;

class Department {
    private String name;
    private Lecturer departmentHead;
    private ArrayList<Course> coursesOffering = new ArrayList<>();
    private ArrayList<Lecturer> lecturersBelongsTo = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Department Name: " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void appointDepartmentHead(Lecturer lecturer) {
        this.departmentHead = lecturer;
    }

    public void displayDepartmentHeadInfo() {
        if (departmentHead != null) {
            departmentHead.displayInfo();
        }
    }

    public void offerCourse(Course course) {
        coursesOffering.add(course);
    }

    public void withdrawCourse(Course course) {
        coursesOffering.remove(course);
    }

    public void addLecturer(Lecturer lecturer) {
        lecturersBelongsTo.add(lecturer);
    }

    public void removeLecturer(Lecturer lecturer) {
        lecturersBelongsTo.remove(lecturer);
    }
}
