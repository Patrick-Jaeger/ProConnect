package de.othr.proconnect.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import de.othr.proconnect.model.Search;

public interface SearchRepositoryI extends MyBaseRepository<Search, Long> {
	
	List<Search> findBySearch(String search);
	
	List<Search> findBySearcherId(Long Id);
	Page<Search> findBySearcherId(Long Id, Pageable pageable);
	
	Page<Search> findAll(Pageable pageable);
	
	Search save(Search search);
	
	Page<Search> findBySearch(String search, Pageable pageable);
}
