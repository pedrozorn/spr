package com.spr.infrastructure.mapper;

import com.spr.application.dto.TaskDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TasksMapper {
    List<TaskDto> getTasks(Integer userId);
    Integer getTask(Integer userId);
}