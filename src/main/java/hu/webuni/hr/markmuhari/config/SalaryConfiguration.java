package hu.webuni.hr.markmuhari.config;

import hu.webuni.hr.markmuhari.service.DefaultEmployeeService;
import hu.webuni.hr.markmuhari.service.EmployeeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("!smart")
public class SalaryConfiguration {

    @Bean
    public EmployeeService employeeService() {
        return new DefaultEmployeeService();
    }

}
