package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class PayrollTest {
    @Test
    void test30Hours() {
        Payroll payroll = new Payroll();
        assertEquals(503.40, payroll.getGrossPay(30), 0.01);
    }

    @Test
    void test40Hours() {
        Payroll payroll = new Payroll();
        assertEquals(671.20, payroll.getGrossPay(40), 0.01);
    }

    @Test
    void test50Hours() {
        Payroll payroll = new Payroll();
        assertEquals(922.90, payroll.getGrossPay(50), 0.01);
    }

    @Test
    void testSocialSecurity() {
        Payroll payroll = new Payroll();
        assertEquals(30.00, payroll.getSocialSecurity(500.00), 0.01);
    }

    @Test
    void testFederalTax() {
        Payroll payroll = new Payroll();
        assertEquals(70.00, payroll.getFederalTax(500.00), 0.01);
    }

    @Test
    void testStateTax() {
        Payroll payroll = new Payroll();
        assertEquals(25.00, payroll.getStateTax(500.00), 0.01);
    }

    @Test
    void testInsuranceZeroDependents() {
        Payroll payroll = new Payroll();
        assertEquals(15.00, payroll.getInsurance(0), 0.01);
    }

    @Test
    void testInsuranceTwoDependents() {
        Payroll payroll = new Payroll();
        assertEquals(15.00, payroll.getInsurance(2), 0.01);
    }

    @Test
    void testInsuranceThreeDependents() {
        Payroll payroll = new Payroll();
        assertEquals(35.00, payroll.getInsurance(3), 0.01);
    }

    @Test
    void testInsuranceFourDependents() {
        Payroll payroll = new Payroll();
        assertEquals(35.00, payroll.getInsurance(4), 0.01);
    }

    @Test
    void testNetPayTwoDependents() {
        Payroll payroll = new Payroll();
        assertEquals(350.00, payroll.getNetPay(500.00, 2), 0.01);
    }

    @Test
    void testNetPayThreeDependents() {
        Payroll payroll = new Payroll();
        assertEquals(330.00, payroll.getNetPay(500.00, 3), 0.01);
    }
}