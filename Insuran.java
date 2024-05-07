package insuran;

import java.util.Scanner;

public class Insuran {


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double gaji_asas;
        double bonus;
        int bil;
        
        System.out.println("Masukkan bilangan pelanggan = ");
        
        bil = input.nextInt();
        
         if (bil >= 40){
        bonus = 10000;
        } else if (bil >=30 && bil <=39){
            bonus = 8000;
        } else if (bil >=20 && bil <=29){
            bonus = 6000;
        } else if (bil >=10 && bil <=19){
            bonus = 4000;   
        } else if (bil >=1 && bil <=9){
            bonus = 2000;
        } else {
            bonus = 0;
        }
         
         gaji_asas = bonus + 1100;
         
         System.out.println("Jumlah pelanggan = " + bil);        
         System.out.println("Jumlah gaji : RM" + gaji_asas);
        
    }
    
}
