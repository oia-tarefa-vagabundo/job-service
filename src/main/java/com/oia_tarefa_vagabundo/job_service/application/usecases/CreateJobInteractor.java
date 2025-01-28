package com.oia_tarefa_vagabundo.job_service.application.usecases;


import com.oia_tarefa_vagabundo.job_service.application.gateways.JobGateway;
import com.oia_tarefa_vagabundo.job_service.domain.entity.Job;

public class CreateJobInteractor {
  private final JobGateway jobGateway;

  public CreateJobInteractor(JobGateway createJob) {
    this.jobGateway = createJob;
  }

  public Job createJob(Job job) {
    return jobGateway.createJob(job);
  }
}
