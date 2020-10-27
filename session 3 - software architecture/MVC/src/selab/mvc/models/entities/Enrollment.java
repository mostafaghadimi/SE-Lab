package selab.mvc.models.entities;

import selab.mvc.models.Model;

public class Enrollment implements Model {
    private Student student;
    private Course course;
    private float point;

    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    public Enrollment(Student student, Course course, float point) {
        this.student = student;
        this.course = course;
        this.point = point;
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public float getPoint() {
        return point;
    }

    public void setPoint(float point) {
        this.point = point;
    }

    @Override
    public String getPrimaryKey() {
        return this.student.getStudentNo() + " " + this.course.getCourseNo();
    }
}
