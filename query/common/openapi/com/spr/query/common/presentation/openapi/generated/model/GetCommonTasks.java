package com.spr.query.common.presentation.openapi.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.spr.query.common.presentation.openapi.generated.model.Tasks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * GetCommonTasks
 */

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor

@JsonTypeName("get-common-tasks")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
public class GetCommonTasks implements Serializable {

  private static final long serialVersionUID = 1L;

  @Valid
  private List<@Valid Tasks> tasks = new ArrayList<>();

  public GetCommonTasks tasks(List<@Valid Tasks> tasks) {
    this.tasks = tasks;
    return this;
  }

  public GetCommonTasks addTasksItem(Tasks tasksItem) {
    if (this.tasks == null) {
      this.tasks = new ArrayList<>();
    }
    this.tasks.add(tasksItem);
    return this;
  }

  /**
   * Get tasks
   * @return tasks
   */
  @Valid 
  @Schema(name = "tasks", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tasks")
  public List<@Valid Tasks> getTasks() {
    return tasks;
  }

  public void setTasks(List<@Valid Tasks> tasks) {
    this.tasks = tasks;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCommonTasks getCommonTasks = (GetCommonTasks) o;
    return Objects.equals(this.tasks, getCommonTasks.tasks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tasks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCommonTasks {\n");
    sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

