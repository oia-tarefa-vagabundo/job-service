package com.oia_tarefa_vagabundo.job_service.infrastructure.gateways;

import com.oia_tarefa_vagabundo.job_service.domain.entity.Job;
import com.oia_tarefa_vagabundo.job_service.infrastructure.persistence.JobEntity;

public class JobEntityMapper {
  JobEntity toEntity(Job jobDomainObj) {
    return new JobEntity(jobDomainObj.description(), jobDomainObj.title(), jobDomainObj.time());
  }

  Job toDomainObj(JobEntity jobEntity) {
    return new Job(jobEntity.getUsername(), jobEntity.getPassword(), jobEntity.getEmail());
  }

}
