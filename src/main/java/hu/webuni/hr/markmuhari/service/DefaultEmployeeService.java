package hu.webuni.hr.markmuhari.service;

import hu.webuni.hr.markmuhari.model.Employee;
import org.springframework.stereotype.Service;

@Service
public class DefaultEmployeeService implements EmployeeService{


    @Override
    public int getPayRaisePercent(Employee employee) {
        return 5;
    }
}
