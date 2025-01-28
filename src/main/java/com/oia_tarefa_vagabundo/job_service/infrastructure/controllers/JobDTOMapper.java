package com.oia_tarefa_vagabundo.job_service.infrastructure.controllers;


import com.oia_tarefa_vagabundo.job_service.domain.entity.Job;

public class JobDTOMapper {
  CreateJobResponse toResponse(Job job, String status) {
    return new CreateJobResponse(job.title(), job.description(), status);
  }

  public Job toJob(CreateJobRequest request) {
    return new Job(request.title(), request.description(), request.time());
  }
}
