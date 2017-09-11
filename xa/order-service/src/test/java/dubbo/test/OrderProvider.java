package dubbo.test;

import javax.transaction.Transaction;
import javax.transaction.TransactionManager;
import javax.transaction.UserTransaction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

 
public class OrderProvider {
 
	public static void main(String[] args) {
		TransactionManager t=null;
		UserTransaction u=null;
		Transaction ts=null;
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");
		context.start();
		System.err.println("OrderProvider is runing ");
		 
	}
    
}