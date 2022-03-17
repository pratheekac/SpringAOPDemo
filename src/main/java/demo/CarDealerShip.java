package demo;

import org.springframework.stereotype.Component;

@Component
public class CarDealerShip {

    public void buyCar(String name) {
        //logging - aspect1

        //authentication and authorization - aspect2
        //sanitize the data - aspect3
        System.out.println("Car bought successfully");
    }

    public int price(){
        return 1_500_000;
    }
}
