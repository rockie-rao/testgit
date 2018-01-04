package util;


public class TransactionManager {
	
	public void beginTransaction()
	{
		HibernateUtil.getSession().beginTransaction();
	}
	
	public void commit()
	{
		HibernateUtil.getSession().getTransaction().commit();
		HibernateUtil.close();
		
	}
	
	public void rollback()
	{
		HibernateUtil.getSession().getTransaction().rollback();
		HibernateUtil.close();
	}

	
}
