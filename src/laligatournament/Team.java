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
public class Team {
    private String teamname;
    private Player[] listofPlayers;
    private int playercount=0;
    private int delcount=0;
    
    public Team(){}
    public Team(String tmn)
    {
        this.teamname=tmn;
        listofPlayers=new Player[30];
    }
    
    public void printinfo()
    {
        System.out.println(this.teamname);
    }
    
    public String getname()
    {
        return teamname;
    }
    
    public void insertPlayer()
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Please Enter player name:");
       String plname=sc.nextLine();
       System.out.println("Please Enter player Role:");
       String plrole=sc.nextLine();
       listofPlayers[playercount]=new Player(plname,plrole);
       playercount++;
       
    }
    
    public void UpdatePlayer()
    {
       System.out.print("Enter The player number to Update: ");
       Scanner sc=new Scanner(System.in);
       int plno=sc.nextInt();
       listofPlayers[plno-1].updatePlayer(); 
    }
    
    public void DeletePlayer()
    {
       System.out.print("Enter The player number to remove: ");
       Scanner sc=new Scanner(System.in);
       int plno=sc.nextInt();
       listofPlayers[plno-1]=null;
       playercount--;
       delcount++;
    }
    
    public void printallPlayers()
    {
        for(int i=0;i<playercount+delcount;i++)
        {
            int j=i+1;
            if(listofPlayers[i]!=null){
            System.out.println("Player "+ j +": "+"Name: " +listofPlayers[i].getname());
            System.out.println("\t "+"Role: "+listofPlayers[i].getrole());}
            else
                System.out.println("Player "+ j +": Player Removed");
        }
    
}
}
