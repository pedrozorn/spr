package com.spr.infrastructure.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TasksMapper {
    Integer getId(Integer taskId);
}