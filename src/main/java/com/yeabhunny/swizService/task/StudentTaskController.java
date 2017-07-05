package com.yeabhunny.swizService.task;

import com.yeabhunny.swizService.reviewer.ReviewerController;
import com.yeabhunny.swizService.task.repository.PrometerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yeabhunny.swizService.reviewer.dto.response.ReviewerListResponse;
import com.yeabhunny.swizService.task.dto.response.PrometerResponse;
import com.yeabhunny.swizService.task.dto.response.TaskResponse;

@Controller
@RequestMapping("/student")
public class StudentTaskController {

	private static final Logger LOG = LoggerFactory.getLogger(StudentTaskController.class);

	@Autowired
	private PrometerRepository prometerRepository;

    @RequestMapping(value = "/{studentId}/task", method = RequestMethod.GET)
    @ResponseBody
    public TaskResponse getStudentTask(@PathVariable("studentId") Long studentId){

    	LOG.info("getStudentTask() id " + studentId);

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
			taskResponse.getProposedReviewerList().add(new ReviewerListResponse(1L, "Adam", "Kowalski", 3));
			taskResponse.getProposedReviewerList().add(new ReviewerListResponse(5L, "Emil", "Kowalski", 2));
			taskResponse.getProposedReviewerList().add(new ReviewerListResponse(6L, "Franciszek", "Kowalski", 1));
			break;
		case "13":
			taskResponse.setId(3L);
			taskResponse.setTitle("Trzecia praca inżynierska");
			taskResponse.setStatus(TaskStatus.WAITING_FOR_STUDENT_REC_CONFIRM);
			taskResponse.getProposedReviewerList().add(new ReviewerListResponse(1L, "Adam", "Kowalski", 3));
			taskResponse.getProposedReviewerList().add(new ReviewerListResponse(3L, "Cezary", "Kowalski", 5));
			taskResponse.getProposedReviewerList().add(new ReviewerListResponse(6L, "Franciszek", "Kowalski", 1));

			break;
		case "14":
			taskResponse.setId(4L);
			taskResponse.setTitle("Czwarta praca inżynierska");
			taskResponse.setStatus(TaskStatus.REC_CONFIRMED);
			taskResponse.getReviewerList().add(new ReviewerListResponse(4L, "Damian", "Kowalski", 7));
			taskResponse.getReviewerList().add(new ReviewerListResponse(5L, "Emil", "Kowalski", 2));
			taskResponse.getReviewerList().add(new ReviewerListResponse(2L, "Bartosz", "Kowalski", 6));
			break;
		}
        taskResponse.setPrometer(prometerRepository.getDefaultPrometer());
        return taskResponse;
    }

}
