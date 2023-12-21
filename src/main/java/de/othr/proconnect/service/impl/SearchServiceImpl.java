package de.othr.proconnect.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import de.othr.proconnect.model.Search;
import de.othr.proconnect.repository.SearchRepositoryI;
import de.othr.proconnect.service.SearchServiceI;

@Service
public class SearchServiceImpl implements SearchServiceI{
	
	private SearchRepositoryI searchRepository;
	
 	public SearchServiceImpl(SearchRepositoryI searchRepository) {
 		
 		super();
 		this.searchRepository = searchRepository;
 	}

	@Override
	public Optional<Search> getSearchById(Long Id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<Search> getSearchesBySearcherId(Long searcherId) {
		return (List<Search>) searchRepository.findBySearcherId(searcherId);
	}

	@Override
	public List<Search> getSearchBySearched(String searched) {
		return (List<Search>) searchRepository.findBySearch(searched);
	}

	@Override
	public Search updateSearch(Search search) {
		return searchRepository.save(search);
	}

	@Override
	public void deleteSearch(Search search) {
		searchRepository.delete(search);
		System.out.println("Search has been deleted");
	}
	
}
