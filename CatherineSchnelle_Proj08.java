
/**
 * Nine coins are places in a 3x3 matrix with some face up and some face down.
 * You can represent the state of the coins using a 3x3 matrix with values 0(heads), 1 (tails).
 * Each state can be represented using a binary. There are total 512 possibilities, use decimals
 * to represent all states of the matrix. Write a program that prompts user to enter
 * a number between 0 - 511 and displays corresponding matrix with characters H and T.
 *
 * @Catherine Schnelle
 * @9/29/19
 */
import java.util.Scanner;
public class CatherineSchnelle_Proj08
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        int n;
        char [][] arr;
        //prompt user to enter number between 0-511
        System.out.println("Enter a number between 0 - 511:");
        //user input
        n = input.nextInt();
        //call convert method, convert input to a  two dimensional array
        arr = convert(n);
        // call printArray method to print array as table
        if(arr != null)
            printArray(arr);
        else
        System.out.println("The input is out of range.");
    }
    
    public static char [][] convert(int n)
    {
        //if n out of range, return null
        if(n < 0 || n > 511) return null;
        //convert n to binary 
        String s = Integer.toBinaryString(n);
        //if string less than 9 digits, add zero's in front
        while(s.length() < 9){
            s = "0" + s;  
        }
        //create a 3 x 3 char array, return result
        char [][] result = new char[3][3];
        for(int i = 0; i < 9; i ++){
            if(s.charAt(i) == '0')
                result [i/3][i%3] = 'H'; 
            else result [i/3][i%3] = 'T';
        }
        return result;
    }
    
    public static void printArray(char[][] arr)
    {
        for(int i = 0; i < arr.length; i++){ //step through each row
            for(int j = 0; j < arr[1].length; j++){ //step through each column
                //print array element
                System.out.print(arr[i][j] + " ");
            }
        //print new line for next row
        System.out.println();
        }
    }
}
