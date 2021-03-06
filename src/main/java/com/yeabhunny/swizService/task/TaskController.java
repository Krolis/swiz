package com.yeabhunny.swizService.task;

import com.yeabhunny.swizService.reviewer.ReviewerController;
import com.yeabhunny.swizService.reviewer.dto.response.ReviewerListResponse;
import com.yeabhunny.swizService.task.dto.response.PrometerResponse;
import com.yeabhunny.swizService.task.dto.response.StudentResponse;
import com.yeabhunny.swizService.task.dto.response.TaskResponse;
import com.yeabhunny.swizService.task.dto.transform.PrometerTransform;
import com.yeabhunny.swizService.task.entity.Prometer;
import com.yeabhunny.swizService.task.repository.PrometerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/task")
public class TaskController {

	private static final Logger LOG = LoggerFactory.getLogger(TaskController.class);

	@RequestMapping(value = "/{taskId}", method = RequestMethod.GET)
	@ResponseBody
	public TaskResponse getTask(@PathVariable("taskId") Long taskId) {
		LOG.info("getTask() id: " + taskId);

		TaskResponse taskResponse = new TaskResponse();
		taskResponse.setPrometer(PrometerTransform.toResponse(getDefaultPrometer()));
		StudentResponse student = null;
		switch (taskId.toString()) {
		case "1":
			student = new StudentResponse(11L, "Marek", "Nowak");
			taskResponse.setId(1L);
			taskResponse.setTitle("Pierwsza praca inżynierska");
			taskResponse.setStatus(TaskStatus.WAITING_FOR_REC_CHOOSE);
			break;
		case "2":
			student = new StudentResponse(12L, "Norbert", "Nowak");
			taskResponse.setId(2L);
			taskResponse.setTitle("Druga praca inżynierska");
			taskResponse.setStatus(TaskStatus.WAITING_FOR_PROMOTOR_REC_CONFIRM);
			taskResponse.getProposedReviewerList().add(new ReviewerListResponse(1L, "Adam", "Kowalski", 3));
			taskResponse.getProposedReviewerList().add(new ReviewerListResponse(5L, "Emil", "Kowalski", 2));
			taskResponse.getProposedReviewerList().add(new ReviewerListResponse(6L, "Franciszek", "Kowalski", 1));
			break;
		case "3":
			student = new StudentResponse(13L, "Olgierd", "Nowak");
			taskResponse.setId(3L);
			taskResponse.setTitle("Trzecia praca inżynierska");
			taskResponse.setStatus(TaskStatus.WAITING_FOR_STUDENT_REC_CONFIRM);
			taskResponse.getProposedReviewerList().add(new ReviewerListResponse(1L, "Adam", "Kowalski", 3));
			taskResponse.getProposedReviewerList().add(new ReviewerListResponse(3L, "Cezary", "Kowalski", 5));
			taskResponse.getProposedReviewerList().add(new ReviewerListResponse(6L, "Franciszek", "Kowalski", 1));
			break;
		case "4":
			student = new StudentResponse(14L, "Paweł", "Nowak");
			taskResponse.setId(4L);
			taskResponse.setTitle("Czwarta praca inżynierska");
			taskResponse.setStatus(TaskStatus.REC_CONFIRMED);
			taskResponse.getReviewerList().add(new ReviewerListResponse(4L, "Damian", "Kowalski", 7));
			taskResponse.getReviewerList().add(new ReviewerListResponse(5L, "Emil", "Kowalski", 2));
			taskResponse.getReviewerList().add(new ReviewerListResponse(2L, "Bartosz", "Kowalski", 6));
			break;
		}
		taskResponse.setStudent(student);
		return taskResponse;
	}

	public Prometer getDefaultPrometer() {
		Prometer promotor = new Prometer(1L, "Jan", "Kowalski");
		return promotor;
	}

}
