package academy.learnprogramming.controller;

import academy.learnprogramming.model.TodoData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class TodoItemController {
    @ModelAttribute
    public TodoData todoData(){
        return new TodoData();
    }

    // ==handler methods
    // http://localhost:8080/todo-list/items
    @GetMapping("items")
    public String items() {
        return "items";
    }
}
