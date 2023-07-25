package crud.dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import crud.model.User;

@Component
public class LoginDoaImpl implements LoginDoa{
    
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	private LoginDoaImpl() {}
		
		public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
			this.hibernateTemplate=hibernateTemplate;
		}

		
		@SuppressWarnings("deprecation")
		public boolean getLogin(String name, String pass) {
			
			System.out.println("Dao@@@@@@@@@@@@@@@@"+name+" "+pass);
			
			boolean isValidUser=false;
			String sqlQuery = "from User u where u.username=?0 and u.password=?1";
			try {
				@SuppressWarnings({ "rawtypes", "unchecked" })
				List<User> userObj = (List) hibernateTemplate.find(sqlQuery, name, pass);
				 if(userObj != null && userObj.size() > 0) {
		          System.out.println("User is valiad ");
		                isValidUser = true;
		            }
		        } catch(ArithmeticException e) {
		            isValidUser = false;
		        }
			
			return isValidUser;
		}
}
			

//			DetachedCriteria detachedCriteria= DetachedCriteria.forClass(UserRegistration.class); 
//			detachedCriteria.add(Restrictions.eq("name",  name));
//			detachedCriteria.add(Restrictions.eq("pass", pass));
//			@SuppressWarnings("unchecked")
//			List<UserRegistration> findByCriteria= (List<UserRegistration>) hibernateTemplate.findByCriteria(detachedCriteria);
//			if (findByCriteria != null && findByCriteria.size()>0) {
//				System.out.println("user is vailid......"); 
//				 status=true;
//				
//			}
//			System.out.println("user is not vailid");
//			return status;
//		}
		
	
	
//		2.logic
// 		@SuppressWarnings({"deprecation"})
//	public boolean getLogin(String name, String pass) {
//		System.out.println("Doa..."+name+" "+pass);
//		boolean status=false;
//		String sqlQuery="from User u where u.username=? and u.password=?";
//		 
//		
//		try {
//			List userList=(List) hibernateTemplate.find(sqlQuery, name, pass);
//			
//			if (userList !=null && ((java.util.List<?>) userList).size()>0) {
//				System.out.println("Query cheched........"+userList);
//				status=true;
//			}
//		}catch(Exception e ) {
//			status=false;
//			System.out.println("user is not vailid.........");
//			
//		}
//		
//			
//		return status;
//	}

//}
