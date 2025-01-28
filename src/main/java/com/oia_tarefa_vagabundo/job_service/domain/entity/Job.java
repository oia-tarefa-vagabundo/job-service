package com.oia_tarefa_vagabundo.job_service.domain.entity;

import java.util.Date;

public record Job(String title, String description, Date time, String status){
}
