
import java.util.Scanner;

/*
Prime finding program
 */
public class Main {
    public static boolean asalmı(int sayı){
        for(int i = 2;i<sayı;i++){
            if(sayı % i == 0){
                return false;
                
            }
            
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); 
        System.out.println("Bu program girdiğiniz sayıya kadar kaç adet asal sayı var yada varmı onu kotrol etmekte ve sonucunu vermektedir.");
        while(true){
        System.out.println("Lütfen bir sayı giriniz : ");
        int k = scn.nextInt();
        for(int i = 2;i<=k;i++){
            if(asalmı(i)){
                System.out.println(i);
            }
        }
        }
     
        
    }
}
