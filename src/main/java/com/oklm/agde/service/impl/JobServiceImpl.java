package com.oklm.agde.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oklm.agde.domain.Job;
import com.oklm.agde.repository.JobRepository;
import com.oklm.agde.service.JobService;
import com.oklm.agde.service.dto.JobDTO;
import com.oklm.agde.service.mapper.JobMapper;

/**
 * Service Implementation for managing Job.
 */
@Service
@Transactional
public class JobServiceImpl implements JobService {
	
	private final Logger log = LoggerFactory.getLogger(JobServiceImpl.class);
	
	@Autowired
	private JobRepository jobRepository;
	
	@Autowired
	private JobMapper jobMapper;
	
	@Override
	public JobDTO save(JobDTO jobDTO) {
		log.debug("Request to save Job {}", jobDTO);
		Job entity = jobMapper.toEntity(jobDTO);
		entity = jobRepository.save(entity);
		return jobMapper.toDto(entity);
	}

	@Override
	@Transactional(readOnly = true)
	public Page<JobDTO> findAll(Pageable pageable) {
		
		log.debug("Request to get all JobHistories");
		
		Page<Job> jobs = jobRepository.findAll(pageable);
		jobs.getContent().get(0).getTasks();
		return jobs.map(jobMapper::toDto);
	}

	@Override
	@Transactional(readOnly = true)
	public JobDTO findOne(Long id) {
		log.debug("Request to get Job : {}", id);
		Job job = jobRepository.findOne(id);
		return jobMapper.toDto(job);
	}

	@Override
	public void delete(Long id) {
		log.debug("Request to delete Job : {}", id);
		jobRepository.delete(id);
	}

}
