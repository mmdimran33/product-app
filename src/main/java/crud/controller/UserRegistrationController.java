package crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import crud.model.User;
import crud.service.LoginService;
import crud.service.UserService;

@Controller
public class UserRegistrationController {
	
	@Autowired
	private UserService service;
	
	@Autowired
	private LoginService loginService;
	

		@RequestMapping("/")
		public String display(Model m) {

			
			return "login";
		}
		
		
		@RequestMapping("/register")
		public String show(Model m)
		{
			return "register";
		}
		
		@RequestMapping(value = "/registeraction", method = RequestMethod.POST)
		public String addData(Model m , User registration) {

		System.out.println(registration);	
			this.service.newRegistration(registration);
		return "login";
	
		}
		@RequestMapping("/logout")   
		public String back(Model m) {
			return "login";
		}
		@RequestMapping(value = "/login", method = RequestMethod.POST)
		public String getlogin(@RequestParam(value = "username") String name, @RequestParam(value = "password") String pass,
		                              Model model) {
			System.out.println("!!!!!!!!!!!" + name + "''" + pass);
			
			boolean isValid=loginService.getLogin(name, pass);
			
			if(isValid) {
			   System.out.println("user is valiad controller");
				return "addProduct";

			}else {
			System.out.println("User is not valiad....");

			}
			
			return "login";
			
			
				
	//		   this.loginService.getLogin(name, pass);
			
//			loginBean.setName(name);
//			loginBean.setPassword(pass);
//
//			System.out.println("second........." + loginBean.getName() + " " + loginBean.getPassword());
//
//			boolean LoginStatus = loginService.getLogin(loginBean);

//			if (LoginStatus) {
//				return "index";
//			} else {
//				model.addAttribute("msg3","Not valid user........");
//			}
	//	}
}
}
