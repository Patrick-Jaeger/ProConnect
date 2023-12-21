package de.othr.proconnect.repository.impl;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import de.othr.proconnect.model.Search;
import de.othr.proconnect.repository.SearchRepositoryI;

public interface SearchRepositoryImpl extends SearchRepositoryI, PagingAndSortingRepository<Search, Long> {
	
	List<Search> findBySearch(String search);
	
	List<Search> findBySearcherId(Long Id);
	Page <Search> findBySearcherId(Long Id, Pageable pageable);
	
	Page <Search> findAll(Pageable pageable);
	
	Page <Search> findBySearch(String search, Pageable pageable);
}
