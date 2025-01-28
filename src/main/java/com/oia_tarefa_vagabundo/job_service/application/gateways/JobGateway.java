package com.oia_tarefa_vagabundo.job_service.application.gateways;


import com.oia_tarefa_vagabundo.job_service.domain.entity.Job;

public interface JobGateway {
  Job createJob(Job job);
}
