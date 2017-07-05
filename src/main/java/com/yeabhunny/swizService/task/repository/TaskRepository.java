package com.yeabhunny.swizService.task.repository;

import com.yeabhunny.swizService.task.TaskStatus;
import com.yeabhunny.swizService.task.entity.Prometer;
import com.yeabhunny.swizService.task.entity.Student;
import com.yeabhunny.swizService.task.entity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class TaskRepository {

    private List<Task> db;

    public TaskRepository() {
        Task taskResponse1 = new Task();
        taskResponse1.setId(1L);
        taskResponse1.setTitle("Pierwsza praca inżynierska");
        taskResponse1.setStatus(TaskStatus.WAITING_FOR_REC_CHOOSE);
        taskResponse1.setStudent(new Student(11L, "Marek", "Nowak"));
        taskResponse1.setPrometer(getDefaultPrometer());

        Task taskResponse2 = new Task();
        taskResponse2.setId(2L);
        taskResponse2.setTitle("Druga praca inżynierska");
        taskResponse2.setStatus(TaskStatus.WAITING_FOR_PROMOTOR_REC_CONFIRM);
        taskResponse2.setStudent(new Student(12L, "Norbert", "Nowak"));
        taskResponse2.setPrometer(getDefaultPrometer());

        Task taskResponse3 = new Task();
        taskResponse3.setId(3L);
        taskResponse3.setTitle("Trzecia praca inżynierska");
        taskResponse3.setStatus(TaskStatus.WAITING_FOR_STUDENT_REC_CONFIRM);
        taskResponse3.setStudent(new Student(13L, "Olgierd", "Nowak"));
        taskResponse3.setPrometer(getDefaultPrometer());

        Task taskResponse4 = new Task();
        taskResponse4.setId(4L);
        taskResponse4.setTitle("Czwarta praca inżynierska");
        taskResponse4.setStatus(TaskStatus.REC_CONFIRMED);
        taskResponse4.setStudent(new Student(14L, "Paweł", "Nowak"));
        taskResponse4.setPrometer(getDefaultPrometer());

        db = Arrays.asList(taskResponse1, taskResponse2, taskResponse3, taskResponse4);
    }

    public List<Task> findByPrometerId(Long prometerId) {
        return db.stream().filter(item->item.getPrometer().getId() == prometerId).collect(Collectors.toList());
    }

    public Prometer getDefaultPrometer() {
        Prometer promotor = new Prometer(1L, "Jan", "Kowalski");
        return promotor;
    }
}
