package hu.webuni.hr.markmuhari.web;

import hu.webuni.hr.markmuhari.dto.EmployeeDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/employees")
public class HrController {

    private Map<Long, EmployeeDto> employees = new HashMap<>();

    {
        LocalDateTime time = LocalDateTime.of(2016, 03, 25, 00, 00);
        LocalDateTime now = LocalDateTime.now();

        employees.put(1l, new EmployeeDto(1l, "Jane", "Engineer", 500000, time));
        employees.put(2l, new EmployeeDto(2l, "John", "Boss", 500000, time));
        employees.put(3l, new EmployeeDto(3l, "Jack", "programmer", 200000, now));
    }

    @GetMapping
    public List<EmployeeDto> getAll() {
        return new ArrayList<>(employees.values());
    }

    @GetMapping("/{id}")
    public EmployeeDto getById(@PathVariable long id) {
        return employees.get(id);
    }

}
