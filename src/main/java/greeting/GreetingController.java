package greeting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import quote.Quote;
import quote.Value;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static String template = "Hello , %s";
    private static final AtomicLong counter = new AtomicLong();

    private static String TYPE = "success";
    private Value value = new Value(1l,"Just do it");

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name",
            defaultValue = "World")String name){
        return new Greeting(counter.incrementAndGet(),
                String.format(template,name));
    }

    @GetMapping("/api/random")
    public Quote quote (){
        return new Quote(TYPE,value);
    }

}
