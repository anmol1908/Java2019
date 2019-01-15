/*
5. Write a Java program that asks the user to provide a single character from 	the alphabet. Print Vowel or Consonant, depending on the user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.

Definition of Done:
a) The program asks an input from the user.
b) A single character input is taken from the user or an error message is generated.
c) The program should print “Vowel” if the entered character is a vowel and “Consonant” if the entered character is a consonant.

By- Anmol Nagpal
 18csu023
 CS-1A
*/

import java.util.*;
class Alphabet
{
	public static void main (String []args)
	{
                // to enter alphabet from user
		System.out.println("Enter an Alphabet");
		Scanner scan = new Scanner(System.in);	
                char alpha = scan.next().charAt(0);	
                if((alpha.length())==1)
                {
                  if (alpha=='A'||alpha=='E'||alpha=='I'||alpha=='O'||alpha=='U'||alpha=='a'||alpha=='e'||alpha=='i'||alpha=='o'||alpha=='u')
                  System.out.println("\n The entered alphabet is a vowel");
		  else 
                  System.out.println("\n The entered alphabet is a consonant");
                // when entered character is not an alphabet or is a string of length greater than 1  
                }            
                else 
                System.out.println("\n ERROR ! you have not entered any alphabet ");
                
	}
} 
