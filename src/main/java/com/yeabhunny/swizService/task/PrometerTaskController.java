package com.yeabhunny.swizService.task;

import com.yeabhunny.swizService.task.dto.response.StudentResponse;
import com.yeabhunny.swizService.task.dto.response.TaskResponse;
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
    public List<TaskResponse> getAllPrometerTasks(@PathVariable("prometerId") Long prometerId){
        TaskResponse taskResponse1 = new TaskResponse();
        taskResponse1.setId(1L);
        taskResponse1.setTitle("Pierwsza praca inżynierska");
        taskResponse1.setStatus(TaskStatus.WAITING_FOR_REC_CHOOSE);
        taskResponse1.setStudent(new StudentResponse(11L, "Marek", "Nowak"));

        TaskResponse taskResponse2 = new TaskResponse();
        taskResponse2.setId(2L);
        taskResponse2.setTitle("Druga praca inżynierska");
        taskResponse2.setStatus(TaskStatus.WAITING_FOR_PROMOTOR_REC_CONFIRM);
        taskResponse2.setStudent(new StudentResponse(12L, "Norbert", "Nowak"));

        TaskResponse taskResponse3 = new TaskResponse();
        taskResponse3.setId(3L);
        taskResponse3.setTitle("Trzecia praca inżynierska");
        taskResponse3.setStatus(TaskStatus.WAITING_FOR_STUDENT_REC_CONFIRM);
        taskResponse3.setStudent(new StudentResponse(13L, "Olgierd", "Nowak"));

        TaskResponse taskResponse4 = new TaskResponse();
        taskResponse4.setId(4L);
        taskResponse4.setTitle("Czwarta praca inżynierska");
        taskResponse4.setStatus(TaskStatus.REC_CONFIRMED);
        taskResponse4.setStudent(new StudentResponse(14L, "Paweł", "Nowak"));

        return Arrays.asList(taskResponse1, taskResponse2, taskResponse3, taskResponse4);

    }
}
