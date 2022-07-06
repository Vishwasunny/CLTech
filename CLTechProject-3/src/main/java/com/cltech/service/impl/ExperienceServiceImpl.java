package com.cltech.service.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.cltech.model.ExeperienceModel;
import com.cltech.repository.ExperienceModelRepository;
import com.cltech.service.ExperienceService;
import com.cltech.service.PropertyService;
import com.springbootmysql.crud.bean.ResponseBean;
import com.springbootmysql.crud.constant.MessageConstant;
import com.springbootmysql.crud.constant.Status;

@Component
public class ExperienceServiceImpl implements ExperienceService{
	@Autowired
	@Qualifier("propertyServiceImpl")
	protected PropertyService propertyService;

	private static Logger LOGGER = LogManager.getLogger(ExperienceServiceImpl.class);
	@Autowired
	ExperienceModelRepository experienceModelRepository;
	@Override
	public List<ExeperienceModel> getAllExperience() {
		// TODO Auto-generated method stub
		return experienceModelRepository.findAll();
	}

	@Override
	public ResponseBean saveExperience(ExeperienceModel experience_model) {
		// TODO Auto-generated method stub
		try {
			//propertyService.getAppProperty(GlobalConstant.ALLOWED_DECIMAL_POINTS);
			if (experience_model == null) {
				return ResponseBean.builder().status(Status.FAIL).message("Data Is Null").build();
			}
			
			ExeperienceModel employeeBean = experienceModelRepository.save(experience_model);
			return ResponseBean.builder().status(Status.SUCCESS).message("Record Added Succesfully")
					.response(employeeBean).build();

		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);			
			return ResponseBean.builder().status(Status.FAIL)
					.message("Something Went Wrong").build();
		}
		
		
	}
	

}
