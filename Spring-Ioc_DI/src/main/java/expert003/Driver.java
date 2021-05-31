package expert003;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("expert003/expert003.xml");
		
		
		//종합 쇼핑몰에서 Car와 Tire를 구매한다.
		Car car = context.getBean("car", Car.class);
		
		//Tire tire = context.getBean("tire", Tire.class);
		//car.setTire(tire);
		
		System.out.println(car.getTireBrand());
		
	}

}
