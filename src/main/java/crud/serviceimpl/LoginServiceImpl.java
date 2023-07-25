package crud.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import crud.dao.LoginDoa;
import crud.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginDoa loginDoa;
	
	public boolean getLogin(String name, String pass) {
		System.out.println("Service......."+name+" "+pass);
		
		return this.loginDoa.getLogin(name, pass);
	}

}
