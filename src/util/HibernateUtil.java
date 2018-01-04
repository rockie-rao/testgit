package util;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory;
	private static StandardServiceRegistry ssr;
	private static ThreadLocal<Session> local = new ThreadLocal<Session>();
	
	static{
		
		try {
			Configuration configuration = new Configuration().configure();
			ssr = new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties())
					.build();
			sessionFactory = configuration.buildSessionFactory(ssr);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static Session getSession()
	{
		Session session = local.get();
		if(session == null || !session.isOpen())
		{
			session = sessionFactory.openSession();
			local.set(session);
		}
		return session;
	}
	
	public static void close()
	{
		Session session = local.get();
		if(session != null)
		{
			session.close();
			local.remove();
			// 下面两行代码不应该存在，但是为了程序能够及时结束，在此将其关闭
			//  实际开发中  关闭操作由其他容器（框架）（spring）负责
			sessionFactory.close();
			StandardServiceRegistryBuilder.destroy(ssr);
		}
	}
	
}
