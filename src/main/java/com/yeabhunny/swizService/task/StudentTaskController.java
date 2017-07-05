package com.yeabhunny.swizService.task;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yeabhunny.swizService.task.dto.response.PrometerResponse;
import com.yeabhunny.swizService.task.dto.response.StudentTaskResponse;

@Controller
@RequestMapping("/student")
public class StudentTaskController {

    @RequestMapping(value = "/{studentId}/task", method = RequestMethod.GET)
    @ResponseBody
    public StudentTaskResponse getStudentTask(@PathVariable("studentId") Long studentId){
        StudentTaskResponse studentTaskResponse = new StudentTaskResponse();
        switch (studentId.toString()) {
		case "11":
			studentTaskResponse.setId(1L);
			studentTaskResponse.setTitle("Pierwsza praca inżynierska");
			studentTaskResponse.setStatus(TaskStatus.WAITING_FOR_REC_CHOOSE);
			break;
		case "12":
			studentTaskResponse.setId(2L);
			studentTaskResponse.setTitle("Druga praca inżynierska");
			studentTaskResponse.setStatus(TaskStatus.WAITING_FOR_PROMOTOR_REC_CONFIRM);
			break;
		case "13":
			studentTaskResponse.setId(3L);
			studentTaskResponse.setTitle("Trzecia praca inżynierska");
			studentTaskResponse.setStatus(TaskStatus.WAITING_FOR_STUDENT_REC_CONFIRM);
			break;
		case "14":
			studentTaskResponse.setId(4L);
			studentTaskResponse.setTitle("Czwarta praca inżynierska");
			studentTaskResponse.setStatus(TaskStatus.REC_CONFIRMED);
			break;
		}
        studentTaskResponse.setPrometer(getDefaultPromotor());
        return studentTaskResponse;
    }
    
    private PrometerResponse getDefaultPromotor() {
    	PrometerResponse promotor = new PrometerResponse();
        promotor.setName("Jan");
        promotor.setSurname("Kowalski");
        promotor.setId(1L);
        return promotor;
    }
}
