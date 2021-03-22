package hu.webuni.hr.markmuhari.config;

import hu.webuni.hr.markmuhari.service.EmployeeService;
import hu.webuni.hr.markmuhari.service.SmartEmployeeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("smart")
public class ProdSalaryConfiguration {

    @Bean
    public EmployeeService employeeService() {
        return new SmartEmployeeService();
    }

}
