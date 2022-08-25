package co.develhope.DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    private final String myComponentName;

    public MyComponent() {
        System.out.println("My component constructor");
        this.myComponentName = "Natalia";
    }


    @Autowired
    public String getMyComponentName() {
        return myComponentName;
    }


}
