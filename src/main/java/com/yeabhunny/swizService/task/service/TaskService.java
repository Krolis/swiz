package com.yeabhunny.swizService.task.service;

import com.yeabhunny.swizService.task.entity.Task;
import com.yeabhunny.swizService.task.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<Task> findPrometerTasks(Long prometerId) {
        return taskRepository.findByPrometerId(prometerId);
    }
}
