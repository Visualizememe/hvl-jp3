
public class Oppgave1 {
	public static void main (String[] args) {
        // Input your salary pre-tax (norwegian: "brutto")
        final int salaryPreTax = 200000;

        double taxRate;

        if (salaryPreTax <= 184800) {
            taxRate = 0;
        } else if (salaryPreTax > 184800 && salaryPreTax <= 260100) {
            taxRate = 1.7;
        } else if (salaryPreTax > 260100 && salaryPreTax <= 651250) {
            taxRate = 4;
        } else if (salaryPreTax > 651250 && salaryPreTax <= 1021550) {
            taxRate = 13.2;
        } else {
            taxRate = 16.2;
        }

        final double salaryPostTax = salaryPreTax - (salaryPreTax * (taxRate) / 100);
        System.out.println("The provided salary pre-tax is: " + salaryPreTax);
        System.out.println("The tax rate is: " + taxRate);
        System.out.println("The post-tax salary is:" + salaryPostTax);
    }
}
