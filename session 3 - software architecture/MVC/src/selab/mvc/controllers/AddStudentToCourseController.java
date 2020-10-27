package selab.mvc.controllers;

import org.json.JSONObject;
import selab.mvc.models.DataContext;
import selab.mvc.models.DataSet;
import selab.mvc.models.entities.Course;
import selab.mvc.models.entities.Enrollment;
import selab.mvc.models.entities.Student;
import selab.mvc.views.JsonView;
import selab.mvc.views.View;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AddStudentToCourseController extends Controller {
    public AddStudentToCourseController(DataContext dataContext) {
        super(dataContext);
    }

    @Override
    public View exec(String method, InputStream body) throws IOException {
        if (!method.equals("POST"))
            throw new IOException("Method not supported");

        JSONObject input = readJson(body);
        String studentNo = input.getString("studentNo");
        String courseNo = input.getString("courseNo");
        String points = input.getString("points");
        
        // TODO: Add required codes to associate the student with course
        float grade = Float.parseFloat(points);
        DataSet<Student> students = dataContext.getStudents();
        Student student = students.get(studentNo);
        DataSet<Course> courses = dataContext.getCourses();
        Course course = courses.get(courseNo);
        Enrollment enrollment = new Enrollment(student, course, grade);
        student.setEnrollment(enrollment);
        course.setEnrollment(enrollment);



        Map<String, String> result = new HashMap<>();
        result.put("success", "true");
        return new JsonView(new JSONObject(result));
    }
}
