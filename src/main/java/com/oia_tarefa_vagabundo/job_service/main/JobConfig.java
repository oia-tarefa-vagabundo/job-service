package com.oia_tarefa_vagabundo.job_service.main;

import com.oia_tarefa_vagabundo.job_service.application.gateways.JobGateway;
import com.oia_tarefa_vagabundo.job_service.application.usecases.CreateJobInteractor;
import com.oia_tarefa_vagabundo.job_service.infrastructure.controllers.JobDTOMapper;
import com.oia_tarefa_vagabundo.job_service.infrastructure.gateways.JobEntityMapper;
import com.oia_tarefa_vagabundo.job_service.infrastructure.gateways.JobRepositoryGateway;
import com.oia_tarefa_vagabundo.job_service.infrastructure.persistence.JobRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class JobConfig {
  @Bean
  CreateJobInteractor createJobCase(JobGateway jobGateway) {
    return new CreateJobInteractor(jobGateway);
  }

  @Bean
  JobRepositoryGateway jobGateway(JobRepository jobRepository, JobEntityMapper jobEntityMapper) {
    return new JobRepositoryGateway(jobRepository, jobEntityMapper);
  }

  @Bean
  JobEntityMapper jobEntityMapper() {
    return new JobEntityMapper();
  }

  @Bean
  JobDTOMapper jobDTOMapper() {
    return new JobDTOMapper();
  }
}
