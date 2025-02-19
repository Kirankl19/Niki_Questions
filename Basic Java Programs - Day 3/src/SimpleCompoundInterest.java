//WAJP to compute both simple interest and compound interest.

import java.util.Scanner;
public class SimpleCompoundInterest {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double P=s.nextDouble();
        double T=s.nextDouble();
        double R=s.nextDouble();
        double Simple_Interest=(P*T*R)/100; //SI formula
        double Compound_Interest= P*Math.pow((1+R/100),T) -P;//Compound Interest Formula
        System.out.println("Simple Interest is "+Simple_Interest+"\nCompound Interest is "+Compound_Interest);
    }
}
