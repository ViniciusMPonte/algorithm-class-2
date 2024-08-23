import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    
        int firstNum, secondNum, result;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro Número: ");
        
        firstNum = scanner.nextInt();
        
        System.out.print("Digite o segundo Número: ");
        
        secondNum = scanner.nextInt();
        
        result = firstNum + secondNum;
        
        System.out.print("O resultado da soma é: " + result);
        scanner.close();
        
}    

}