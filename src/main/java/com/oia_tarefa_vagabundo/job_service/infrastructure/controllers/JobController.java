package com.oia_tarefa_vagabundo.job_service.infrastructure.controllers;

import com.oia_tarefa_vagabundo.job_service.application.usecases.CreateJobInteractor;
import com.oia_tarefa_vagabundo.job_service.domain.entity.Job;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("jobs")
public class JobController {
  private final CreateJobInteractor createJobUseCase;
  private final JobDTOMapper jobDTOMapper;

  public JobController(CreateJobInteractor createJobUseCase,
                       JobDTOMapper jobDTOMapper) {
    this.createJobUseCase = createJobUseCase;
    this.jobDTOMapper = jobDTOMapper;
  }

  @PostMapping
  public CreateJobResponse createJob(@RequestBody CreateJobRequest request) {
    Job jobBusinessObj = jobDTOMapper.toJob(request);
    Job job = createJobUseCase.createJob(jobBusinessObj);
    return jobDTOMapper.toResponse(job);
  }
}
