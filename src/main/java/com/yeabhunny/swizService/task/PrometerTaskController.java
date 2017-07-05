package com.yeabhunny.swizService.task;

import com.yeabhunny.swizService.reviewer.ReviewerController;
import com.yeabhunny.swizService.task.dto.response.TaskResponse;
import com.yeabhunny.swizService.task.dto.transform.PrometerTransform;
import com.yeabhunny.swizService.task.dto.transform.StudentTransform;
import com.yeabhunny.swizService.task.service.TaskService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/prometer")
public class PrometerTaskController {

    private static final Logger LOG = LoggerFactory.getLogger(PrometerTaskController.class);

    @Autowired
    private TaskService taskService;

    @RequestMapping(value = "/{prometerId}/tasks", method = RequestMethod.GET)
    @ResponseBody
    public List<TaskResponse> getAllPrometerTasks(@PathVariable("prometerId") Long prometerId){

        LOG.info("getAllPrometerTasks() id: " + prometerId);

        return taskService.findPrometerTasks(prometerId)
                .stream()
                .map(item->new TaskResponse(item.getId(),item.getTitle(),item.getStatus(),
                        PrometerTransform.toResponse(item.getPrometer()),
                        StudentTransform.toResponse(item.getStudent())))
                .collect(Collectors.toList());
    }
}
