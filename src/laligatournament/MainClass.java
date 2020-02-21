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
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Tournament t1=new Tournament("La Liga Soccer Tournament");
        Team tm1=new Team("Barcelona");
        Team tm2=new Team("Real Madrid");
        t1.addTeam(tm1);
        t1.addTeam(tm2);
        
        
        t1.printInfo();
        System.out.println("Participating Teams in the Tournament are:");
        
        t1.printallteam();
        
        System.out.println("Enter which Team you want to update: ");
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        
        if(v==1){
        System.out.println("Insert/Update/Del in Team: "+tm1.getname());
        tm1.insertPlayer();
        tm1.insertPlayer();
        tm1.insertPlayer();
        tm1.printallPlayers();
        tm1.UpdatePlayer();
        tm1.DeletePlayer();
        
        tm1.printallPlayers();
        }
        
        if(v==2)
        {
        System.out.println("Insert/Update/Del in Team: "+tm2.getname());
        tm1.insertPlayer();
        tm2.insertPlayer();
        tm2.insertPlayer();
        tm2.printallPlayers();
        tm2.UpdatePlayer();
        tm2.DeletePlayer();
        
        tm2.printallPlayers();
        } 
        }
        
        
    }
    

