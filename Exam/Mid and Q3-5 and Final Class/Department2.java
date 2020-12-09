
import java.util.Scanner;

public class Department2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k =sc.nextInt();
        
        Dept d = new Dept(n,k);
        d.printReport();
    }
}
class Dept {
    int ministryBudget,eduFee,serviceFee,donation;
    int Income,Expense;
    int salary,elec,eduCost;
    Dept(int population,int std){
      Income = computeIncome(population,std);
      Expense = computeExpense(population,std);
        System.out.println("total income = "+Income);
        System.out.println("total expense = "+Expense);
        System.out.println("income - expense = "+(Income-Expense));
    }
    
    int computeIncome(int population,int std){
        this.ministryBudget = (population*500000)+(std*3000);
        this.eduFee = std*5000;
        this.serviceFee = 300000;
        this.donation = 100000;
        return ministryBudget+eduFee+serviceFee+donation;
    }
    
    int computeExpense(int population,int std){
        this.salary = population*600000;
        this.elec = (population+std)*2000;
        this.eduCost = std*4000;
        return salary+elec+eduCost;
    }
    
    void printReport(){
        System.out.println("ministry budget = "+ministryBudget);
        System.out.println("education fee = "+eduFee);
        System.out.println("service fee = "+ serviceFee);
        System.out.println("donation = "+donation);
        System.out.println("salary = "+salary);
        System.out.println("electricity = "+elec);
        System.out.println("educational cost = "+eduCost);
    }
}