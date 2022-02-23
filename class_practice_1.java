import java.util.Scanner;
public class EXE1_2 {
    public static void main(String [] args){
        Scanner gg = new Scanner(System.in);
        double a,b,c;
        System.out.print("輸入身高(公分整數):");
        a=gg.nextDouble();
        System.out.print("輸入體重(公斤整數):");
        b=gg.nextDouble();
        c=b/((a/100)*(a/100));
        System.out.printf("你的BMI為:%.2f",c);
    }
}
