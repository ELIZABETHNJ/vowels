# vowels
import java.io.*;
import java.util.*;
public class Vowels
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char c;
System.out.println("Enter the character");
c=sc.next().charAt(0);
if(c=='a' ||c=='e' ||c=='i' ||c=='o' || c=='u'|| c=='A' || c=='E' ||c=='I' || c=='O' || c=='U')
{
System.out.println("Given character is vowel");
}
else
{
System.out.println("Given character is consonant");
}
}
}
