package user.domain;

import java.sql.SQLException;

public class SelfTestMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		UserDao dao = new UserDao();
		
		User user = new User();
		user.setId("0");
		user.setName("chanwoo");
		user.setPassword("1235");
		
		dao.add(user);
		
		System.out.println(user.getId() + "registration sucess");
		
		User user2 = dao.get(user.getId());
		System.out.println(user2.getName());
		System.out.println(user2.getPassword());
		
		System.out.println(user2.getId() + "registration sucess");
		
	}

}
