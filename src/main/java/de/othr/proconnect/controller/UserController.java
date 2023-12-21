package de.othr.proconnect.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import de.othr.proconnect.model.User;
import de.othr.proconnect.service.UserServiceI;
import jakarta.validation.Valid;

@RequestMapping("/user")
@Controller
public class UserController {
	
	private UserServiceI userService;
	
	public UserController(UserServiceI userService) {
		super();
		this.userService = userService;
	}
	
	@GetMapping("/login") 
	public String showLoginForm() {
		System.out.println("I am here");
		//model.addAttribute("user", new User());
		return "users/user-login";
	}
	
	@GetMapping("/add") 
	public String showSignUpForm(Model model) {
		User user = new User();
		user.setId((long) -1);
		model.addAttribute(null, user);
		return "/users/user-add";
	}
	
	@PostMapping("/add")
	public String addUser(@Valid User user, BindingResult results, Model model) {
		
		if(results.hasErrors()) {
			System.out.println(results.getAllErrors().toString());
			return "/users/users-add";
		}
		
		userService.saveUser(user);
		
		return "redirect:/users/user-all";
	}
	
	@GetMapping("/update/{id}")
	public String showUpdateUserForm(@PathVariable Long id, Model model) {
		model.addAttribute("user", userService.getUserById(id));
		System.out.println("updating student id = " + id);
		return "/user/user-update";
	}
	
	@PostMapping("/update")
	public String updateUser(@Valid @ModelAttribute("User") User user, 
			BindingResult results, 
			Model model) {
		
		// User von Data base
		User existingUser = userService.getUserById(user.getId());
		
		existingUser.setUsername(user.getUsername());
		existingUser.setFirstname(user.getFirstname());
		existingUser.setLastname(user.getLastname());
		existingUser.setEmail(user.getEmail());
		existingUser.setBirthDate(user.getBirthDate());
		
		if(results.hasErrors()) {
			System.out.println(results.getAllErrors().toString());
			return "/users/users-update";
		}
		
		userService.saveUser(existingUser);
		
		return "redirect:/users/user-all";
	}
	
	@GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") long id, Model model) {
        User user = userService.getUserById(id);               
        userService.deleteUserById(user.getId());
        return "redirect:/user/all";
    }
	
	@GetMapping("/all")
	public String showUserList(Model model) {
		
		model.addAttribute("users", userService.getAllUsers());
		System.out.println(userService.getAllUsers().size() + "*********");
		
		return "/students/student-all";
	}
}
