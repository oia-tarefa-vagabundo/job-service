package com.oia_tarefa_vagabundo.job_service.infrastructure.persistence;


import org.springframework.data.repository.CrudRepository;

public interface JobRepository extends CrudRepository<JobEntity, Long> {

}
