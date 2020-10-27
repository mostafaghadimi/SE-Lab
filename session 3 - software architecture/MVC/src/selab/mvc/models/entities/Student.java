package selab.mvc.models.entities;

import selab.mvc.models.DataSet;
import selab.mvc.models.Model;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class Student implements Model {
    private String name;
    private String studentNo;



    private DataSet<Enrollment> enrollments = new DataSet<>();

    public void setEnrollment(Enrollment enrollment) {
        this.enrollments.add(enrollment);
    }


    @Override
    public String getPrimaryKey() {
        return this.studentNo;
    }

    public void setName(String value) { this.name = value; }
    public String getName() { return this.name; }

    public void setStudentNo(String value) {
        if (!validateStudentNo(value))
            throw new IllegalArgumentException("The format is not correct");

        this.studentNo = value;
    }
    public String getStudentNo() { return this.studentNo; }

    public float getAverage() {
        int counter = 0;
        int summation = 0;

        for(Enrollment enrollment: this.enrollments.getAll()) {
            counter += 1;
            summation += enrollment.getPoint();
        }

        if (counter > 0) {
            return summation / counter;
        }

        return 0;

    }

    public String getCourses() {
        ArrayList<String> courses = new ArrayList<>();
        for (Enrollment enrollment: this.enrollments.getAll()) {
            courses.add(enrollment.getCourse().getTitle());
        }

        return String.join(", ", courses);
    }

    public void removeFromCourse() {
        for (Enrollment enrollment: this.enrollments.getAll()) {
            enrollment.getCourse().removeEnrollment(enrollment);
        }
    }

    /**
     *
     * @param studentNo Student number to be checeked
     * @return true, if the format of the student number is correct
     */
    private boolean validateStudentNo(String studentNo) {
        Pattern pattern = Pattern.compile("^[8-9]\\d{7}$");
        return pattern.matcher(studentNo).find();
    }


    public void removeEnrollment(Enrollment enrollment) {
        this.enrollments.remove(enrollment);
    }
}
