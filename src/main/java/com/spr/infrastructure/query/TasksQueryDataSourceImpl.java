package com.spr.infrastructure.query;

import com.spr.application.dto.TaskDto;
import com.spr.infrastructure.mapper.TasksMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class TasksQueryDataSourceImpl implements TasksQueryDataSource {
    private final TasksMapper tasksMapper;

//    @Autowired  // コンストラクタインジェクションを明示的に記載
//    public TasksQueryDataSourceImpl(TasksMapper tasksMapper) {
//        this.tasksMapper = tasksMapper;
//    }

    @Override
    public Optional<TaskDto> getTask(final Integer taskId) {
        return tasksMapper.getTask(taskId);
    }
}

