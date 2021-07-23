
import java.util.Scanner;

public class Department2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Dept d = new Dept(n,k);
        d.printReport();
    }
}
class Dept{
    int ministryBudget, eduFee, serviceFee,donation;
    int salary,elec,eduCost;
    Dept(int population,int student){
        int income =computeIncome(population,student);
        int expense =computeExpense(population,student);
        System.out.println("total income "+income);
        System.out.println("total expense "+expense);
    }
    int computeIncome(int population,int student){
        ministryBudget = population*500000 + student*3000;
        eduFee = student*5000;
        serviceFee = 300000;
        donation = 100000;
        return ministryBudget+eduFee+serviceFee+donation;
    }
    int computeExpense(int population,int student){
        salary = population*600000;
        elec = (population+student)*2000;
        eduCost = student*4000;
        return salary+elec+eduCost;
    }
    void printReport(){
        System.out.println("ministry budget = "+ministryBudget);
        System.out.println("education fee = "+eduFee);
        System.out.println("service fee = "+serviceFee);
        System.out.println("donation = "+donation);
        System.out.println("saraly = "+salary);
        System.out.println("electricity = "+elec);
        System.out.println("educational cost = "+eduCost);
    }
}