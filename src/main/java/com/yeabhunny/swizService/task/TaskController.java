package com.yeabhunny.swizService.task;

import com.yeabhunny.swizService.task.dto.response.PrometerResponse;
import com.yeabhunny.swizService.task.dto.response.StudentResponse;
import com.yeabhunny.swizService.task.dto.response.StudentTaskResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/task")
public class TaskController {

    @RequestMapping(value = "/{taskId}", method = RequestMethod.GET)
    @ResponseBody
    public StudentTaskResponse getTask(@PathVariable("taskId") Long taskId){
        StudentTaskResponse studentTaskResponse = new StudentTaskResponse();
        PrometerResponse prometer = new PrometerResponse();
        prometer.setName("Jan");
        prometer.setSurname("Kowalski");
        prometer.setId(1L);

        StudentResponse student = new StudentResponse(11L, "Marek", "Nowak");

        studentTaskResponse.setId(1L);
        studentTaskResponse.setTitle("Pierwsza studenta praca inżynierska");
        //studentTaskResponse.setStatus(TaskStatus.WAITING_FOR_REC_CHOOSE);
        studentTaskResponse.setStatus(TaskStatus.WAITING_FOR_STUDENT_REC_CONFIRM);
        //studentTaskResponse.setStatus(TaskStatus.WAITING_FOR_PROMOTOR_REC_CONFIRM);
        //studentTaskResponse.setStatus(TaskStatus.REC_CONFIRMED);
        studentTaskResponse.setPrometer(prometer);
        studentTaskResponse.setStudent(student);
        return studentTaskResponse;
    }
}
