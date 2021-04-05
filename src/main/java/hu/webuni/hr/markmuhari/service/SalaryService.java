package hu.webuni.hr.markmuhari.service;

import hu.webuni.hr.markmuhari.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaryService {

    private EmployeeService employeeService;

    @Autowired
    public SalaryService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public void setFinalPay(Employee employee) {
        int finalyPay = (int) (employee.getMonthlyPay() / 100.0 * (100 + employeeService.getPayRaisePercent(employee)));
        employee.setMonthlyPay(finalyPay);
    }


}
