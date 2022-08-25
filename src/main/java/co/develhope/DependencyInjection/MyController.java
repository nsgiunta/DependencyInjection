package co.develhope.DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private MyComponent myComponent;

    private MyService myService;

    public MyController(MyService myService) {
        System.out.println("My controller constructor");
        this.myService = myService;
    }

    @GetMapping("/getName")
    public String name(){
        System.out.println("myService.getName() has been called from web");
        return myService.getName() + " - "+ myComponent.getMyComponentName();
    }

    @GetMapping("")
    public String welcome(){
        return "welcome messagge";
    }

}
