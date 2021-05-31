package com.taskmanagement.backend.resources;

import java.util.List;

import com.taskmanagement.backend.entities.TaskRecord;

public class TaskRecordListResource {
  private List<TaskRecord> taskRecordList;

  public List<TaskRecord> getTaskRecordList() {
    return taskRecordList;
  }

  public void setTaskRecordList(List<TaskRecord> taskRecordList) {
    this.taskRecordList = taskRecordList;
  }
}
