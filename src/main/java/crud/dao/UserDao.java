package crud.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import crud.model.User;

@Component
public class UserDao {

	private static final String user = null;
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	@Transactional
	public int createUser(User registration) {
		
		System.out.println(registration.getUserid()+" "+registration.getFirstname()+" "+registration.getLastname()
		+" "+ registration.getUsername()+" "+registration.getMobileno()+" "+registration.getPassword());
		

		return (Integer) this.hibernateTemplate.save(registration);
		
//		hibernateTemplate.findByNamedQueryAndNamedParam(user, user, registration)

	}
	
}
