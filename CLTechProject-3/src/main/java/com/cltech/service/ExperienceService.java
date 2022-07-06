package com.cltech.service;

import com.cltech.model.ExeperienceModel;
import com.springbootmysql.crud.bean.ResponseBean;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface ExperienceService {

	List<ExeperienceModel> getAllExperience();
	ResponseBean saveExperience(ExeperienceModel experience_model);
	
	
}
