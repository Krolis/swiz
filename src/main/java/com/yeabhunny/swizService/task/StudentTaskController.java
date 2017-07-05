package com.yeabhunny.swizService.task;

import com.yeabhunny.swizService.task.dto.response.PrometerResponse;
import com.yeabhunny.swizService.task.dto.response.StudentTaskResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/student")
public class StudentTaskController {

    @RequestMapping(value = "/{studentId}/task", method = RequestMethod.GET)
    @ResponseBody
    public StudentTaskResponse getStudentTask(@PathVariable("studentId") Long studentId){
        StudentTaskResponse studentTaskResponse = new StudentTaskResponse();
        PrometerResponse promotor = new PrometerResponse();
        promotor.setName("Jan");
        promotor.setSurname("Kowalski");
        promotor.setId(1L);
        studentTaskResponse.setId(1L);
        studentTaskResponse.setTitle("Pierwsza praca inżynierska");
        studentTaskResponse.setStatus(TaskStatus.WAITING_FOR_REC_CHOOSE);
        studentTaskResponse.setStatus(TaskStatus.WAITING_FOR_STUDENT_REC_CONFIRM);
        studentTaskResponse.setStatus(TaskStatus.WAITING_FOR_PROMOTOR_REC_CONFIRM);
        studentTaskResponse.setStatus(TaskStatus.REC_CONFIRMED);
        studentTaskResponse.setPrometer(promotor);
        return studentTaskResponse;
    }
}
