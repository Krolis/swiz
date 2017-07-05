package com.yeabhunny.swizService.task;

import com.yeabhunny.swizService.task.dto.response.StudentResponse;
import com.yeabhunny.swizService.task.dto.response.StudentTaskResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/prometer")
public class PrometerTaskController {

    @RequestMapping(value = "/{prometerId}/tasks", method = RequestMethod.GET)
    @ResponseBody
    public List<StudentTaskResponse> getAllPrometerTasks(@PathVariable("prometerId") Long prometerId){
        StudentTaskResponse studentTaskResponse1 = new StudentTaskResponse();
        studentTaskResponse1.setId(1L);
        studentTaskResponse1.setTitle("Pierwsza praca inżynierska");
        studentTaskResponse1.setStatus(TaskStatus.WAITING_FOR_REC_CHOOSE);
        studentTaskResponse1.setStudent(new StudentResponse(11L, "Marek", "Nowak"));

        StudentTaskResponse studentTaskResponse2 = new StudentTaskResponse();
        studentTaskResponse2.setId(2L);
        studentTaskResponse2.setTitle("Druga praca inżynierska");
        studentTaskResponse2.setStatus(TaskStatus.WAITING_FOR_PROMOTOR_REC_CONFIRM);
        studentTaskResponse2.setStudent(new StudentResponse(12L, "Norbert", "Nowak"));

        StudentTaskResponse studentTaskResponse3 = new StudentTaskResponse();
        studentTaskResponse3.setId(3L);
        studentTaskResponse3.setTitle("Trzecia praca inżynierska");
        studentTaskResponse3.setStatus(TaskStatus.WAITING_FOR_STUDENT_REC_CONFIRM);
        studentTaskResponse3.setStudent(new StudentResponse(13L, "Olgierd", "Nowak"));

        StudentTaskResponse studentTaskResponse4 = new StudentTaskResponse();
        studentTaskResponse4.setId(4L);
        studentTaskResponse4.setTitle("Czwarta praca inżynierska");
        studentTaskResponse4.setStatus(TaskStatus.REC_CONFIRMED);
        studentTaskResponse4.setStudent(new StudentResponse(14L, "Paweł", "Nowak"));

        return Arrays.asList(studentTaskResponse1, studentTaskResponse2, studentTaskResponse3, studentTaskResponse4);

    }
}
