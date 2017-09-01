package brink.spring_practice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SpringPracticeController {

    @RequestMapping(path = "/person", method = RequestMethod.GET)
    public String person() {
        return "person";
    }

    @RequestMapping(path = "/add-person", method = RequestMethod.POST)
    public String addPerson(Model model, String name, String city, Integer age) {
        Person person = new Person(name, city, age);
        model.addAttribute("person", person);
        return "person";
    }

}
