package hu.webuni.hr.markmuhari.service;

import hu.webuni.hr.markmuhari.config.HrConfigProperties;
import hu.webuni.hr.markmuhari.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class SmartEmployeeService implements EmployeeService {

    @Autowired
    private HrConfigProperties config;

    @Override
    public int getPayRaisePercent(Employee employee) {
        int results = 0;

        if (employee.getStartingDate().isBefore(LocalDateTime.now().plusYears(
                config.getSalary().getSmart().getLimit().getTenYears()
        ))) {
            results = config.getSalary().getSmart().getTenYearsPercent();

        } else if (employee.getStartingDate().isBefore(LocalDateTime.now().plusYears(
                config.getSalary().getSmart().getLimit().getFiveYears()
        ))) {
            results = config.getSalary().getSmart().getFiveYearsPercent();
        } else if (employee.getStartingDate().isBefore(LocalDateTime.now().plusYears(
                config.getSalary().getSmart().getLimit().getTwoYears()
        ).plusMonths(
                config.getSalary().getSmart().getLimit().getSixMonths()
        ))) {
            results = config.getSalary().getSmart().getTwoYearsPercent();
        }
        return results;
    }
}
