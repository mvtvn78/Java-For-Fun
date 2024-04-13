/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.helloworld;
import java.util.Scanner;
/**
 *
 * @author PC
 */

public class HelloWorld
{
  
  
    public static void main (String[] args)
    {
      Scanner sc = new  Scanner(System.in);
      System.out.println("Type Your FullName");
      String full_name = sc.nextLine();
      System.out.println("Type Your Birthday");
      String your_birth = sc.nextLine();
      System.out.println("Have a nice day ! " +full_name  +" "+ your_birth);
    }

}
