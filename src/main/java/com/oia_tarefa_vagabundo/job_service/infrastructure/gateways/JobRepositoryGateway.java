package com.oia_tarefa_vagabundo.job_service.infrastructure.gateways;


import com.oia_tarefa_vagabundo.job_service.application.gateways.JobGateway;
import com.oia_tarefa_vagabundo.job_service.domain.entity.Job;
import com.oia_tarefa_vagabundo.job_service.infrastructure.persistence.JobEntity;
import com.oia_tarefa_vagabundo.job_service.infrastructure.persistence.JobRepository;

public class JobRepositoryGateway implements JobGateway {
  private final JobRepository jobRepository;
  private final JobEntityMapper jobEntityMapper;

  public JobRepositoryGateway(JobRepository jobRepository, JobEntityMapper jobEntityMapper) {
    this.jobRepository = jobRepository;
    this.jobEntityMapper = jobEntityMapper;
  }

  @Override
  public Job createJob(Job jobDomainObj) {
    JobEntity jobEntity = jobEntityMapper.toEntity(jobDomainObj);
    JobEntity savedEntity = jobRepository.save(jobEntity);

    return jobEntityMapper.toDomainObj(savedEntity);
  }

}
