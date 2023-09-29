import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        System.out.println(factorial(3));
    }
    public static String factorial(int number){
        int result = number;
        int num2 = number - 1;
        while (num2 - 1 > 0){
            result = result * num2;
            num2 = num2 - 1;
            
        }
        return "El resultado de " + number + " factorial es " + result;
    }
}
