package hu.webuni.hr.markmuhari.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "hr")
@Component
public class HrConfigProperties {
    private Salary salary = new Salary();

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    public static class Salary {
        private Default def = new Default();
        private Smart smart;

        public Default getDef() {
            return def;
        }

        public void setDef(Default def) {
            this.def = def;
        }

        public Smart getSmart() {
            return smart;
        }

        public void setSmart(Smart smart) {
            this.smart = smart;
        }
    }

    public static class Default {
        private int percent;

        public int getPercent() {
            return percent;
        }

        public void setPercent(int percent) {
            this.percent = percent;
        }
    }

    public static class Smart {

        private int maxPaymentRaisePercentage;
        private int mediumPaymentRaisePercentage;
        private int minPaymentRaisePercentage;

        private double maxYearsOfPaymentRaise;
        private double medYearsOfPaymentRaise;
        private double minYearsOfPaymentRaise;


        public int getMaxPaymentRaisePercentage() {
            return maxPaymentRaisePercentage;
        }

        public void setMaxPaymentRaisePercentage(int maxPaymentRaisePercentage) {
            this.maxPaymentRaisePercentage = maxPaymentRaisePercentage;
        }

        public int getMediumPaymentRaisePercentage() {
            return mediumPaymentRaisePercentage;
        }

        public void setMediumPaymentRaisePercentage(int mediumPaymentRaisePercentage) {
            this.mediumPaymentRaisePercentage = mediumPaymentRaisePercentage;
        }

        public int getMinPaymentRaisePercentage() {
            return minPaymentRaisePercentage;
        }

        public void setMinPaymentRaisePercentage(int minPaymentRaisePercentage) {
            this.minPaymentRaisePercentage = minPaymentRaisePercentage;
        }

        public double getMaxYearsOfPaymentRaise() {
            return maxYearsOfPaymentRaise;
        }

        public void setMaxYearsOfPaymentRaise(double maxYearsOfPaymentRaise) {
            this.maxYearsOfPaymentRaise = maxYearsOfPaymentRaise;
        }

        public double getMedYearsOfPaymentRaise() {
            return medYearsOfPaymentRaise;
        }

        public void setMedYearsOfPaymentRaise(double medYearsOfPaymentRaise) {
            this.medYearsOfPaymentRaise = medYearsOfPaymentRaise;
        }

        public double getMinYearsOfPaymentRaise() {
            return minYearsOfPaymentRaise;
        }

        public void setMinYearsOfPaymentRaise(double minYearsOfPaymentRaise) {
            this.minYearsOfPaymentRaise = minYearsOfPaymentRaise;
        }
    }


}
