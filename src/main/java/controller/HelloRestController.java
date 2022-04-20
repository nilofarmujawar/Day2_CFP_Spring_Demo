package controller;

/**
 * import classes
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 1) @RestController :-
 *           @RestController is used for making restful web services with the help of the @RestController annotation.
 *           This annotation is used at the class level and allows the class to handle the requests made by the client
 *
 * 2) @RequestMapping :-
 *           @RequestMapping is the most common and widely used annotation in Spring MVC.
 *           It is used to map web requests onto specific handler classes and/or handler methods. @RequestMapping can be applied to the controller class as well as methods.
 *           name: Assign a name to this mapping.
 *
 * 3) @GetMapping :-
 *           @GetMapping annotation maps HTTP GET requests onto specific handler methods.
 *           It is a composed annotation that acts as a shortcut for @RequestMapping(method = RequestMethod. GET)
 *
 * 4) @RequestParam :-
 *           @RequestParam is a Spring annotation used to bind a web request parameter to a method parameter.
 *           It has the following optional elements: defaultValue - used as a fallback when the request parameter is not provided or has an empty value.
 *           name - name of the request parameter to bind to
 *
 *
 * 5) @PathVariable :-
 *           @PathVariable is a Spring annotation which indicates that a method parameter should be bound to a URI template variable. It has the following optional elements: name - name of the path variable to bind to.
 *           required - tells whether the path variable is required.
 *
 *
 */


@RestController
@RequestMapping("/hello")
/**
 * create a class name as HelloRestController
 */
public class HelloRestController {

    /**
     * path-/home
     * create a method name as sayHello
     * @return-message
     */
    @RequestMapping(value={"/home"})
    public String sayHello() {
        return "Hello From BridgeLabz!";
    }

    /**
     * create a method name as sayHelloParam1
     * @param name-put the name what u want
     * @return - hello nilofar !(for ex- name=nilofar)
     */
    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHelloParam1 (@RequestParam(value="name")String name) {
        return "Hello " + name + "!";
    }

    /**
     * path-/param/{name}
     * create a method name as sayHelloParam
     * @param name-put the name what u want
     * @return-hello (name)!
     */
    @GetMapping ("/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello "+ name+ "!";
    }
}