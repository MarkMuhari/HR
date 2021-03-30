package hu.webuni.hr.markmuhari;

import hu.webuni.hr.markmuhari.model.Employee;
import hu.webuni.hr.markmuhari.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;

@SpringBootApplication
public class HrApplication implements CommandLineRunner {

    @Autowired
    private SalaryService salaryService;

    public static void main(String[] args) {
        SpringApplication.run(HrApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        LocalDateTime time = LocalDateTime.of(2011, 3, 25, 0, 0);
        LocalDateTime time2 = LocalDateTime.of(2018, 9, 25, 0, 0);
        LocalDateTime time3 = LocalDateTime.of(2016, 3, 25, 0, 0);

        Employee employee = new Employee(1, "Jack", "programers", 20_000, time);
        Employee employee2 = new Employee(2, "Joe", "builder", 20_000, time2);
        Employee employee3 = new Employee(3, "Jane", "coder", 20_000, time3);

        System.out.println(employee.getName() + ": " + salaryService.getFinalPay(employee));
        System.out.println(employee2.getName() + ": " + salaryService.getFinalPay(employee2));
        System.out.println(employee3.getName() + ": " + salaryService.getFinalPay(employee3));
        System.out.println("employee.getStartingDate() = " + employee.getStartingDate());

    }


}
