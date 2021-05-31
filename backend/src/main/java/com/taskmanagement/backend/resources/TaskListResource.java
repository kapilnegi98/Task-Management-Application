package com.taskmanagement.backend.resources;

import java.util.List;

import com.taskmanagement.backend.entities.Task;

public class TaskListResource {

  private List<Task> taskList;

  public List<Task> getTaskList() {
    return taskList;
  }

  public void setTaskList(List<Task> taskList) {
    this.taskList = taskList;
  }
}
