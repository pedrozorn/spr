package com.spr.infrastructure;

import com.spr.application.dto.TaskDto;
import com.spr.infrastructure.mapper.TasksMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class TasksQueryDataSourceImpl implements TasksQueryDataSource {
    private final TasksMapper tasksMapper;

    @Override
    public List<TaskDto> getTasks(final Integer userId) {
        System.out.println("TasksQueryDataSourceImpl");
        System.out.println("tasksMapper is null? " + (tasksMapper == null)); // デバッグ出力

        return tasksMapper.getTasks(userId);
    }
}

