import java.util.*;

public class Spaghetti{

     public static void main(String []args)
     {
        Scanner input = new Scanner(System.in);
        String inputString, output = "";
        int length;
        double mod = 0;
        
        System.out.println("Enter your string: ");
        inputString = input.nextLine();
        
        length = inputString.length();
        
        for(int i = 0; i < length; i++)
        {
            if(mod % 2 == 0)
            {
                output = output + inputString.substring(i, i+1).toUpperCase() + inputString.substring(i+1);
                output = output.substring(0, i+1);
            }
            
            if(mod % 2 == 1)
            {
                output = output + inputString.substring(i, i+1).toLowerCase() + inputString.substring(i+1);
                output = output.substring(0, i+1);
            }
            mod++;
        }
        
        System.out.println(output);
        
     }
}