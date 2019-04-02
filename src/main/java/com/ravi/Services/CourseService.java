package com.ravi.Services;

import com.ravi.models.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {


    private static List<Course> courses = new ArrayList<>();

    static {
        courses.add(new Course(1, "Java", "Learn Java 8 to 11"));
        courses.add(new Course(2, "Spring", "Learn Spring framework using java 8"));
        courses.add(new Course(3, "Python", "Learn python 3.6"));
        courses.add(new Course(4, "Selenium", "Learn Java and selenium testing tool"));
        courses.add(new Course(5, "Angular", "Learn AngularJs version 6 only"));
    }

    public List<Course> retrieveTodos() {
        return courses;
    }

}
