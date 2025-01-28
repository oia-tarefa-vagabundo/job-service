package com.oia_tarefa_vagabundo.job_service.infrastructure.controllers;

import java.util.Date;

public record CreateJobRequest(String title, String description, Date time) {

}
