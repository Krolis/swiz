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
	public StudentTaskResponse getTask(@PathVariable("taskId") Long taskId) {
		StudentTaskResponse studentTaskResponse = new StudentTaskResponse();
		studentTaskResponse.setPrometer(getDefaultPrometer());
		StudentResponse student = null;
		switch (taskId.toString()) {
		case "1":
			student = new StudentResponse(11L, "Marek", "Nowak");
			studentTaskResponse.setId(1L);
			studentTaskResponse.setTitle("Pierwsza praca inżynierska");
			studentTaskResponse.setStatus(TaskStatus.WAITING_FOR_REC_CHOOSE);
			break;
		case "2":
			student = new StudentResponse(12L, "Norbert", "Nowak");
			studentTaskResponse.setId(2L);
			studentTaskResponse.setTitle("Druga praca inżynierska");
			studentTaskResponse.setStatus(TaskStatus.WAITING_FOR_PROMOTOR_REC_CONFIRM);
			break;
		case "3":
			student = new StudentResponse(13L, "Olgierd", "Nowak");
			studentTaskResponse.setId(3L);
			studentTaskResponse.setTitle("Trzecia praca inżynierska");
			studentTaskResponse.setStatus(TaskStatus.WAITING_FOR_STUDENT_REC_CONFIRM);
			break;
		case "4":
			student = new StudentResponse(14L, "Paweł", "Nowak");
			studentTaskResponse.setId(4L);
			studentTaskResponse.setTitle("Czwarta praca inżynierska");
			studentTaskResponse.setStatus(TaskStatus.REC_CONFIRMED);
			break;
		}
		studentTaskResponse.setStudent(student);
		return studentTaskResponse;
	}

	private PrometerResponse getDefaultPrometer() {
		PrometerResponse prometer = new PrometerResponse();
		prometer.setName("Jan");
		prometer.setSurname("Kowalski");
		prometer.setId(1L);
		return prometer;
	}
}
