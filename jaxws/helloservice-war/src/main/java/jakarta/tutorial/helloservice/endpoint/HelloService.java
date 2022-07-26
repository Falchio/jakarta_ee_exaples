package jakarta.tutorial.helloservice.endpoint;

import jakarta.tutorial.helloservice.Hello;

public class HelloService {
    public Hello getHelloPort(){
        return new Hello();
    }
}
