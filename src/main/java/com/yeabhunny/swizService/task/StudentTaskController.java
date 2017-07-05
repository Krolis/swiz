package com.yeabhunny.swizService.task;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yeabhunny.swizService.task.dto.response.PrometerResponse;
import com.yeabhunny.swizService.task.dto.response.TaskResponse;

@Controller
@RequestMapping("/student")
public class StudentTaskController {

    @RequestMapping(value = "/{studentId}/task", method = RequestMethod.GET)
    @ResponseBody
    public TaskResponse getStudentTask(@PathVariable("studentId") Long studentId){
        TaskResponse taskResponse = new TaskResponse();
        switch (studentId.toString()) {
		case "11":
			taskResponse.setId(1L);
			taskResponse.setTitle("Pierwsza praca inżynierska");
			taskResponse.setStatus(TaskStatus.WAITING_FOR_REC_CHOOSE);
			break;
		case "12":
			taskResponse.setId(2L);
			taskResponse.setTitle("Druga praca inżynierska");
			taskResponse.setStatus(TaskStatus.WAITING_FOR_PROMOTOR_REC_CONFIRM);
			break;
		case "13":
			taskResponse.setId(3L);
			taskResponse.setTitle("Trzecia praca inżynierska");
			taskResponse.setStatus(TaskStatus.WAITING_FOR_STUDENT_REC_CONFIRM);
			break;
		case "14":
			taskResponse.setId(4L);
			taskResponse.setTitle("Czwarta praca inżynierska");
			taskResponse.setStatus(TaskStatus.REC_CONFIRMED);
			break;
		}
        taskResponse.setPrometer(getDefaultPromotor());
        return taskResponse;
    }
    
    private PrometerResponse getDefaultPromotor() {
    	PrometerResponse promotor = new PrometerResponse();
        promotor.setName("Jan");
        promotor.setSurname("Kowalski");
        promotor.setId(1L);
        return promotor;
    }
}
