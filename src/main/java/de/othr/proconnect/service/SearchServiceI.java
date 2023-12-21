package de.othr.proconnect.service;

import java.util.List;
import java.util.Optional;

import de.othr.proconnect.model.Search;

public interface SearchServiceI {
	
	Optional <Search> getSearchById(Long Id);
	
	List<Search> getSearchesBySearcherId(Long searcherId);
	
	List<Search> getSearchBySearched(String searched);
	
	Search updateSearch(Search search);
	
	void deleteSearch(Search search);

}
