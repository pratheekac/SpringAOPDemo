package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAOPDemo {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        CarDealerShip dealership = context.getBean(CarDealerShip.class);
        dealership.buyCar("Pratheeka");
        int price = dealership.price();
    }
}
