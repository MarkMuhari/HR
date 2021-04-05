package hu.webuni.hr.markmuhari.web;

import hu.webuni.hr.markmuhari.dto.EmployeeDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(params = "pays")
    @ResponseBody
    public List<EmployeeDto> getAllIfPaysMoreThenQueryPay(@RequestParam int pays) {
        List<EmployeeDto> results = new ArrayList<>();
        for (EmployeeDto employeeDto : employees.values()) {
            if (employeeDto.getMonthlyPay() > pays)
                results.add(employeeDto);
        }
        return results;
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDto> getById(@PathVariable long id) {
        EmployeeDto employeeDto = employees.get(id);
        if (employeeDto != null)
            return ResponseEntity.ok(employeeDto);
        else
            return ResponseEntity.notFound().build();
    }

    @PostMapping
    public EmployeeDto createEmployee(@RequestBody EmployeeDto employeeDto) {
        employees.put(employeeDto.getId(), employeeDto);
        return employeeDto;
    }

    @PutMapping("/{id}")
    public ResponseEntity<EmployeeDto> modifyEmployee(@RequestBody EmployeeDto employeeDto, @PathVariable long id) {
        if (!employees.containsKey(id)) {
            return ResponseEntity.notFound().build();
        }
        employeeDto.setId(id);
        employees.put(id, employeeDto);
        return ResponseEntity.ok(employeeDto);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable long id) {
        employees.remove(id);
    }

}
