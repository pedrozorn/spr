package main.java.com.spr.application.usecase;

import lombok.RequiredArgsConstructor;
import main.java.com.spr.application.dto.TaskDto;
import main.java.com.spr.infrastructure.query.TasksQueryDataSource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class GetTasksUseCase {
    private final TasksQueryDataSource tasksQueryDataSource;

    public List<TaskDto> execute(Integer userId) {
        System.out.println("GetTasksUseCase");
        return tasksQueryDataSource.getTasks(userId);
    }
}
