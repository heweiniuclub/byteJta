package dubbo.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xa.pay.service.PayFacade;

 
public class PayProvider {
 
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");
		context.start();
		PayFacade payFacade =(PayFacade) context.getBean("payFacade");
		System.err.println(payFacade.pay());
	}
    
}