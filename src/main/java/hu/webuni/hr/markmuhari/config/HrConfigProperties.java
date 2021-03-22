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
        private int tenYearsPercent;
        private int fiveYearsPercent;
        private int twoYearsPercent;
        private Limit limit = new Limit();

        public int getTenYearsPercent() {
            return tenYearsPercent;
        }

        public void setTenYearsPercent(int tenYearsPercent) {
            this.tenYearsPercent = tenYearsPercent;
        }

        public int getFiveYearsPercent() {
            return fiveYearsPercent;
        }

        public void setFiveYearsPercent(int fiveYearsPercent) {
            this.fiveYearsPercent = fiveYearsPercent;
        }

        public int getTwoYearsPercent() {
            return twoYearsPercent;
        }

        public void setTwoYearsPercent(int twoYearsPercent) {
            this.twoYearsPercent = twoYearsPercent;
        }

        public Limit getLimit() {
            return limit;
        }

        public void setLimit(Limit limit) {
            this.limit = limit;
        }
    }

    public static class Limit {
        private int tenYears;
        private int fiveYears;
        private int twoYears;
        private int sixMonths;

        public int getTenYears() {
            return tenYears;
        }

        public void setTenYears(int tenYears) {
            this.tenYears = tenYears;
        }

        public int getFiveYears() {
            return fiveYears;
        }

        public void setFiveYears(int fiveYears) {
            this.fiveYears = fiveYears;
        }

        public int getTwoYears() {
            return twoYears;
        }

        public void setTwoYears(int twoYears) {
            this.twoYears = twoYears;
        }

        public int getSixMonths() {
            return sixMonths;
        }

        public void setSixMonths(int sixMonths) {
            this.sixMonths = sixMonths;
        }
    }


}
