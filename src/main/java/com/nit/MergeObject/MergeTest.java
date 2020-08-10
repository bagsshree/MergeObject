package com.nit.MergeObject;



import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nit.MergeObject.Domain.Bank;
import com.nit.MergeObject.utils.HibernateUtils;

public class MergeTest {
	public static void main(String args[])
	{
		Session sess=null;
		Transaction tx=null;
		boolean flag=false;
		sess=HibernateUtils.getSession();
		
		//Bank b=new Bank();
//		b.setName("bags11");
//		b.setBalance(70000.0f);
		Bank b1=sess.get(Bank.class, 1L);
		System.out.println(b1);
		
			
	try {
			
			tx=sess.beginTransaction();
				Bank b2=new Bank();
				b2.setId(30L);
						b2.setName("ben111");
						b2.setBalance(30000.12f);
							sess.merge(b2);
				
		//	sess.merge(b);
			flag=true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		if(flag)
		{
			tx.commit();
			System.out.println("Record inserted/updated");
		}
		else
		{
			System.out.println("Sorry!! not done");
		}
	}
}
