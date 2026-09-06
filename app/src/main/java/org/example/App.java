package org.example;
import java.util.Scanner;


public class App {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Payroll payroll = new Payroll();
    System.out.println("Welcome to Payroll Program!");
    System.out.println("How many hours did you work this week?");
    double hours = scanner.nextDouble();
    System.out.println("How many dependents do you have?");
    int dependents = scanner.nextInt();

    double grossPay = payroll.getGrossPay(hours);
    double socialSecurity = payroll.getSocialSecurity(grossPay);
    double federalTax = payroll.getFederalTax(grossPay);
    double stateTax = payroll.getStateTax(grossPay);
    double insurance = payroll.getInsurance(dependents);
    double netPay = payroll.getNetPay(grossPay , dependents );
    String grossPayFormatted = String.format("%.2f", grossPay);
    String socialSecurityFormatted = String.format("%.2f", socialSecurity);
    String federalTaxFormatted = String.format("%.2f", federalTax);
    String stateTaxFormatted = String.format("%.2f", stateTax);
    String insuranceFormatted = String.format("%.2f", insurance);
    String netPayFormatted = String.format("%.2f", netPay);

    System.out.println("Payroll Stub:");
    System.out.println();
    System.out.println("Hours worked :   " + hours + " hours");
    System.out.println("Hourly Rate :  $16.78");
    System.out.println("Gross Pay :    $" + grossPayFormatted );
    System.out.println("SocSec :       $" + socialSecurityFormatted );
    System.out.println("FedTax :       $" + federalTaxFormatted );
    System.out.println("StateTax :     $" + stateTaxFormatted );
    System.out.println("Union :        $10.00");
    System.out.println("Insurance :    $" + insuranceFormatted );
    System.out.println("Net :          $" + netPayFormatted );
    System.out.println();
    System.out.println("Thank you for using the Payroll Program!");


    scanner.close();

  }
  }
