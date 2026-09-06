package org.example;

public class Payroll {

    public double getGrossPay(double hours){
        double hourlyRate = 16.78;
        double grossPay;
        if ( hours <= 40) {
            grossPay = hours * hourlyRate ;
        }
        else {
            double regularPay = 40 * hourlyRate;
            double overtime = hours - 40 ;
            double overtimeRate = hourlyRate * 1.5 ;
            double overtimePay = overtime * overtimeRate ;

            grossPay = regularPay + overtimePay ;
        }
        return grossPay ;

    }
    public double getSocialSecurity(double grossPay) {
        double socialSecurity = 0.06 * grossPay;
        return socialSecurity ;
    }
    public double getFederalTax(double grossPay) {
        double federalTax = 0.14 * grossPay;
        return federalTax ;

    }
    public double getStateTax(double grossPay) {
        double stateTax = 0.05 * grossPay;
        return stateTax ;

    }
    public double getInsurance(int dependents) {
        double insurance;
        if (dependents >= 3) {
            insurance = 35.00;
        }
        else{
            insurance = 15.00;
        }
        return insurance;
    }
    public double getNetPay(double grossPay , int dependents) {
        double socialSecurity = getSocialSecurity(grossPay);
        double federalTax = getFederalTax(grossPay);
        double stateTax = getStateTax(grossPay);
        double unionDues = 10.00 ;
        double insurance = getInsurance(dependents);

        double netPay = grossPay
                - socialSecurity
                - federalTax
                - stateTax
                - unionDues
                - insurance;
        return netPay;

    }
}
