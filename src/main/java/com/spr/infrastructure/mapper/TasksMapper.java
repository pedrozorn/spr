package com.spr.infrastructure.mapper;

import com.spr.application.dto.TaskDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.Optional;

@Mapper
public interface TasksMapper {
    Optional<TaskDto> getTask(Integer taskId);
}
