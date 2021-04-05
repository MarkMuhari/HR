package hu.webuni.hr.markmuhari.web;

import hu.webuni.hr.markmuhari.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class HrTLController {

    private List<Employee> allEmployee = new ArrayList<>();

    {
        LocalDateTime time = LocalDateTime.of(2011, 3, 25, 0, 0);
        LocalDateTime time2 = LocalDateTime.of(2018, 9, 25, 0, 0);
        LocalDateTime time3 = LocalDateTime.of(2016, 3, 25, 0, 0);

        Employee employee = new Employee(1, "Jack", "programers", 55_000, time);
        Employee employee2 = new Employee(2, "Joe", "builder", 20_000, time2);
        Employee employee3 = new Employee(3, "Jane", "coder", 23_000, time3);
        allEmployee.add(employee);
        allEmployee.add(employee2);
        allEmployee.add(employee3);
    }

    @GetMapping("/")
    public String home() {
        return "index";
    }


    @GetMapping("/employees")
    public String listEmployee(Map<String, Object> model) {
        model.put("employees", allEmployee);
        model.put("addEmployee", new Employee());
        return "employees";
    }

    @PostMapping("/employees")
    public String addEmployee(Employee employee) {
        allEmployee.add(employee);
        return "redirect:employees";
    }

}
