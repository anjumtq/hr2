package com.slokam.hr.service.impl;

import com.slokam.hr.entity.Candidate;
import com.slokam.hr.repo.CandidateRepo;
import com.slokam.hr.service.CandidateService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class CandidateServiceImpl implements CandidateService {

      
   

	@Autowired
	private CandidateRepo repo;
	
	@Override
	public List<Candidate> getAll() {
		return repo.findAll();
	}

	@Override
	public Candidate getById(Integer id) {
		
		Optional<Candidate> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public Candidate save(Candidate todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(Candidate todo) {
		repo.delete(todo);
	}
	@Override
	public void remove(Integer id) {
		repo.deleteById(id);
	}
}
