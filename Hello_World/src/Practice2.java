import javax.swing.*;
//program to add two numbers together

public class Practice2 {
    public static void main(String[]args){
        //declaring variable

        String firstNumber, secondNumber;
        int number1, number2, sum;
        firstNumber = JOptionPane.showInputDialog("Enter first number: ");
        secondNumber = JOptionPane.showInputDialog("Enter second number: ");
        number1 = Integer.parseInt(firstNumber);
        number2 = Integer.parseInt(secondNumber);
        sum = number1 + number2;
        JOptionPane.showMessageDialog(null,"The sum is " + sum,"Result",
                JOptionPane.PLAIN_MESSAGE);
    }//end main method
}//end main class
