package hu.webuni.hr.markmuhari.service;

import hu.webuni.hr.markmuhari.config.HrConfigProperties;
import hu.webuni.hr.markmuhari.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.Period;

@Service
public class SmartEmployeeService implements EmployeeService {

    @Autowired
    private HrConfigProperties config;

    @Override
    public int getPayRaisePercent(Employee employee) {
        int results = 0;

        HrConfigProperties.Smart smart = config.getSalary().getSmart();

        LocalDateTime employeeStartingDate = employee.getStartingDate();

        LocalDateTime now = LocalDateTime.now();

        if (Period.between(employeeStartingDate.toLocalDate(), now.toLocalDate()).getYears() >=
                smart.getLimit().getMaxYearsOfPaymentRaise()) {

            results = smart.getMaxPaymentRaisePercentage();

        } else if (Period.between(employeeStartingDate.toLocalDate(), now.toLocalDate()).getYears() >=
                smart.getLimit().getMedYearsOfPaymentRaise()) {

            results = smart.getMediumPaymentRaisePercentage();
        } else if (Period.between(employeeStartingDate.toLocalDate(), now.toLocalDate()).toTotalMonths() >=
                smart.getLimit().getMinMonthsOfPaymentRaise()) {
            results = smart.getMinPaymentRaisePercentage();
        }
        return results;
    }
}
