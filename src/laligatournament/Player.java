/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laligatournament;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class Player {
    public String pl_name;
    public String pl_role;
    
    public Player(){}
    public Player(String name,String role)
    {
        this.pl_name=name;
        this.pl_role=role;
    }
    
    public void updatePlayer()
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Please Enter player name:");
       this.pl_name=sc.nextLine();
       System.out.println("Please Enter player role:");
       this.pl_role=sc.nextLine();
    }
    public String getname()
    {
        return this.pl_name;
    }
    
    public String getrole()
    {
        return this.pl_role;
    }
    public void printinfo()
    {
        System.out.println(this.pl_name);
        System.out.println(this.pl_role);
    }
   
}
