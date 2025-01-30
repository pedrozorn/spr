package com.spr.query.common.presentation.openapi.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Tasks
 */

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor

@JsonTypeName("tasks")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
public class Tasks implements Serializable {

  private static final long serialVersionUID = 1L;

  private Integer id;

  private String taskName;

  public Tasks id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * タスクID
   * @return id
   */
  
  @Schema(name = "id", example = "1", description = "タスクID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Tasks taskName(String taskName) {
    this.taskName = taskName;
    return this;
  }

  /**
   * タスク名
   * @return taskName
   */
  
  @Schema(name = "taskName", example = "オードリーはお笑い芸人です！", description = "タスク名", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taskName")
  public String getTaskName() {
    return taskName;
  }

  public void setTaskName(String taskName) {
    this.taskName = taskName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tasks tasks = (Tasks) o;
    return Objects.equals(this.id, tasks.id) &&
        Objects.equals(this.taskName, tasks.taskName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, taskName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tasks {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
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

