package com.slokam.hr.service.impl;

import com.slokam.hr.entity.Position;
import com.slokam.hr.repo.PositionRepo;
import com.slokam.hr.service.PositionService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class PositionServiceImpl implements PositionService {

      
   

	@Autowired
	private PositionRepo repo;
	
	@Override
	public List<Position> getAll() {
		return repo.findAll();
	}

	@Override
	public Position getById(Integer id) {
		
		Optional<Position> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public Position save(Position todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(Position todo) {
		repo.delete(todo);
	}
	@Override
	public void remove(Integer id) {
		repo.deleteById(id);
	}
}
