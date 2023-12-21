package de.othr.proconnect.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import de.othr.proconnect.model.UserWithProfession;
import de.othr.proconnect.service.SearchServiceI;

@RequestMapping("/search")
@Controller
public class SearchController {
	
	private SearchServiceI searchService;
	
	public SearchController(SearchServiceI searchService) {
		super();
		this.searchService = searchService;
		
	}
	@GetMapping("")
	public String search() {
		//System.out.println("Ich bin hier");
		return "searches/search";
	}
	
	@GetMapping(value= "/userWithProfession/select")
	public String showSelectUserWithProfessionByID(Model model) {
		
		UserWithProfession userWithProfession = new UserWithProfession();
		userWithProfession.setId((long) -1);
		List <UserWithProfession> usersWithProfession = new ArrayList<UserWithProfession>();
		model.addAttribute("userWithProfession", userWithProfession);
		model.addAttribute("usersWithProfession", usersWithProfession);
				
		return "searches/search-select-usersWithProfession";
	}
}
