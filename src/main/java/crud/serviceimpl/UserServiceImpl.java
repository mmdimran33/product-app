package crud.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import crud.dao.LoginDoa;
import crud.dao.UserDao;
import crud.model.User;
import crud.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
		
	public int newRegistration(User registration) {
		
		System.out.println("service......."+registration.getUserid()+" "+registration.getFirstname()+" "+registration.getLastname()
		+" "+ registration.getUsername()+" "+registration.getMobileno()+" "+registration.getPassword());
		
		
		return this.userDao.createUser(registration);
	}
	

}
