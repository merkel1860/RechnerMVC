package core.view;

import java.util.Scanner;
// Calculus Sheet
public class RechnungSeite {

    public float askOperand(){
        System.out.println("Entrez op:");
        Scanner sc = new Scanner(System.in);
        float op = sc.nextFloat();
        return op;
    }

    public String askOperator(){
        System.out.println("Entrez operator (add|mul|div|subs):");
        Scanner sc = new Scanner(System.in);
        String op = sc.nextLine();
        return op;
    }

    public void displayResult(float res){
        System.out.println("results :"+String.valueOf(res));
    }
}
