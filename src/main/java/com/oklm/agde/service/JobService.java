package com.oklm.agde.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.oklm.agde.domain.Job;
import com.oklm.agde.service.dto.JobDTO;

/**
 * 
 * @author Chaieb Mohamed
 * 
 * Service Interface for managing Job.
 *
 */
public interface JobService {
	
	/**
     * Save a job.
     *
     * @param jobDTO the entity to save
     * @return the persisted entity
     */
    JobDTO save(JobDTO jobDTO);

    /**
     * Get all the job.
     *
     * @param pageable the pagination information
     * @return the list of entities
     */
    Page<JobDTO> findAll(Pageable pageable);

    /**
     * Get the "id" job.
     *
     * @param id the id of the entity
     * @return the entity
     */
    JobDTO findOne(Long id);

    /**
     * Delete the "id" job.
     *
     * @param id the id of the entity
     */
    void delete(Long id);

}
