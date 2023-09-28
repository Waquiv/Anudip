//Write a program to find the sum of even numbers between 25 to 51.
public class Odd {
    public static void main(String[] args) {
        //upper and lower breakpoints for the loop
        int LowerLimit = 25;
        int UpperLimit = 51;

        //variable for storing the number
        int EvenSum=0;

        // for loop for finite loop
        for(int i=LowerLimit; i<=UpperLimit; i++){
            if(i%2==0){
                EvenSum += i;
            }
        }

        //Printing teh result to the console
        System.out.println("The sum of even numbers is: "+EvenSum);
    }
}
