package co.develhope.DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    private MyComponent myComponent;

    @Autowired
    public MyService(MyComponent myComponent){
        System.out.println("My service constructor");
        this.myComponent = myComponent;
    }

    public String getName(){

        return myComponent.getMyComponentName();
    }

}




