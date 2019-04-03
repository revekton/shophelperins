package hello;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    @GetMapping("/")
    public String sendData(){
    return "jsonData";
    }
    @GetMapping("/hello-world")
    @ResponseBody
    public Greeting sayHello(@RequestParam(name="name", required=false, defaultValue="Stranger") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
    @GetMapping("/getdata")
    @ResponseBody
    public String getdata()  throws IOException {
        Greeting ng =new Greeting(counter.incrementAndGet(),"default");
        String div="<div id='jss'></div>";
        String scr="<Script>document.getElementById("jss").innerHTML=";
        return div + scr + "JSON.stringfy"+"("+ng.getData();+")</Script>";
    }


}
