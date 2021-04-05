package hu.webuni.hr.markmuhari.service;

import hu.webuni.hr.markmuhari.config.HrConfigProperties;
import hu.webuni.hr.markmuhari.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@Service
public class SmartEmployeeService implements EmployeeService {

    @Autowired
    private HrConfigProperties config;

    @Override
    public int getPayRaisePercent(Employee employee) {
        int results = 0;

        HrConfigProperties.Smart smart = config.getSalary().getSmart();

        double employeeYearsWorked = ChronoUnit.DAYS.between(employee.getStartingDate(), LocalDateTime.now()) / 365.0;

        if ((employeeYearsWorked) > smart.getMaxYearsOfPaymentRaise()) {
            results = smart.getMaxPaymentRaisePercentage();

        } else if (employeeYearsWorked > smart.getMedYearsOfPaymentRaise()) {
            results = smart.getMediumPaymentRaisePercentage();

        } else if (employeeYearsWorked > smart.getMinYearsOfPaymentRaise()) {
            results = smart.getMinPaymentRaisePercentage();
        }
        return results;
    }
}
