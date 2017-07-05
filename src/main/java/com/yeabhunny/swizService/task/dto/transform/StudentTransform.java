package com.yeabhunny.swizService.task.dto.transform;

import com.yeabhunny.swizService.task.dto.response.StudentResponse;
import com.yeabhunny.swizService.task.entity.Student;

public class StudentTransform {
    public static StudentResponse toResponse(Student student) {
        if(student == null) return null;
        return new StudentResponse(student.getId(),student.getName(),student.getSurname());
    }
}
