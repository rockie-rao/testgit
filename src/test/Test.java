package test;

import entity.User;
import util.HibernateUtil;
import util.TransactionManager;

public class Test {
	public static void main(String[] args) {
		
		TransactionManager tr = new TransactionManager();
		
		try {
			tr.beginTransaction();
			
			User u = (User) HibernateUtil.getSession().get(User.class, 2);
			
			System.out.println(u);
			
			tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
		
		
	}
}
