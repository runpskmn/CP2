
import java.util.Scanner;

/*public class Department1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        Dept d = new Dept(n,k);
        d.printReport();
    }
}

class Dept {
    int ministryBudget,eduFee,serviceFee,donation;
    
    Dept(int population,int std){
      computeIncome(population,std);
    }
    
    void computeIncome(int population,int std){
        this.ministryBudget = (population*500000)+(std*3000);
        this.eduFee = std*5000;
        this.serviceFee = 300000;
        this.donation = 100000;
    }
    
    void printReport(){
        System.out.println("ministry budget = "+ministryBudget);
        System.out.println("education fee = "+eduFee);
        System.out.println("service fee = "+ serviceFee);
        System.out.println("donation = "+donation);
    }
}
