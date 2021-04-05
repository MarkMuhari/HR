package hu.webuni.hr.markmuhari.service;

import hu.webuni.hr.markmuhari.config.HrConfigProperties;
import hu.webuni.hr.markmuhari.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefaultEmployeeService implements EmployeeService {

    @Autowired
    HrConfigProperties configProperties;

    @Override
    public int getPayRaisePercent(Employee employee) {
        return configProperties.getSalary().getDef().getPercent();
    }
}
