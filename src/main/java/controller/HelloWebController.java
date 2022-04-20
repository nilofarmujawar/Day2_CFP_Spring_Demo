package controller;

/**
 * import classes
 */

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 1) @RestController :-
 *           @RestController is used for making restful web services with the help of the @RestController annotation.
 *           This annotation is used at the class level and allows the class to handle the requests made by the client
 *
 * 3) @GetMapping :-
 *           @GetMapping annotation maps HTTP GET requests onto specific handler methods.
 *           It is a composed annotation that acts as a shortcut for @RequestMapping(method = RequestMethod. GET)
 *
 */

@RestController
/**
 * create a class name as HelloWebController
 */
public class HelloWebController {

    /**
     * path-/web
     * create a method name as hello
     * @return-hello word
     */
    @GetMapping ("/web")
    public String hello() {
        return "hello";
    }

    /**
     * path-/web/message
     * create a method name as message
     * @param model-attribute name,attribute value
     * @return-message
     */
    @GetMapping("/web/message")
    public  String message(Model model) {
        model.addAttribute("message","This is custom message. Hello from bridgeLabz");
        return "message";
    }
}