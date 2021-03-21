package hu.webuni.hr.markmuhari.service;

import hu.webuni.hr.markmuhari.model.Employee;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class SmartEmployeeService implements EmployeeService {

    @Override
    public int getPayRaisePercent(Employee employee) {
        int results = 0;

        if (employee.getStartingDate().isBefore(LocalDateTime.now().plusYears(-10))) {
            results = 10;
        } else if (employee.getStartingDate().isBefore(LocalDateTime.now().plusYears(-5))) {
            results = 5;
        } else if (employee.getStartingDate().isBefore(LocalDateTime.now().plusYears(-2).plusMonths(-6))) {
            results = 2;
        }
        return results;
    }
}
