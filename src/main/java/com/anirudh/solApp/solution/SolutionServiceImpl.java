package com.anirudh.solApp.solution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SolutionServiceImpl implements SolutionService{
	private final SolutionRepository repository;
	
	@Autowired
	public SolutionServiceImpl(SolutionRepository repository) {
		this.repository = repository;
	} 
	
	public Solution saveSolution(Solution solution) {
		Solution sol = new Solution("ss", "s");
		repository.save(sol);
		return sol;
		
	}
}
