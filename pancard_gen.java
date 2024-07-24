import java.util.Random;
import java.util.Scanner;
public class PanNumberGen{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.next();
        System.out.println("1. Individual - P\n2. Company - C\n3. Association - A\n4. Firm - F\n5.HUF - H\n6. Trust - T\nEnter type of card: ");
        String type = sc.next();
        Generate(name, type);
        sc.close();
    }
    private static void Generate(String surname, String type){
        Random rand = new Random();
        String first = "" + (char)(rand.nextInt(26) + 'A') + (char)(rand.nextInt(26) + 'A') + (char)(rand.nextInt(26) + 'A');
        char firstletter =  surname.charAt(0);
        int seq = rand.nextInt(1000, 10000);
        String panNumber = first + type +  firstletter + seq;        
        int sum = 0; 
        for(int i = 0; i<panNumber.length();i++){
            sum = sum + (int)panNumber.charAt(i);
        }
        panNumber += (char)((sum%26)+'A');
        System.out.println(panNumber);
    }

}