package com.taskmanagement.backend.dto;

import java.util.List;

import com.taskmanagement.backend.entities.Program;

public class ProgramListDTO {
  private List<Program> programList;

  public List<Program> getProgramList() {
    return programList;
  }

  public void setProgramList(List<Program> programList) {
    this.programList = programList;
  }
}
