/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laligatournament;

/**
 *
 * @author student
 */
public class Tournament {
    private String tname;
    private Team listofteam[];
    private int Teamcount=0;
    
    public Tournament(){}
    
    public Tournament(String tn)
    {
        this.tname=tn;
        listofteam=new Team[20];
    }
    
    public void printInfo()
    {
        System.out.println("\t \t"+ this.tname );
    }
    
    public void addTeam(Team tn)
    {
        listofteam[Teamcount]=tn;
        Teamcount++;
    }
    
    public void printallteam()
    {
        for(int i=0;i<Teamcount;i++)
        {
            int j=i+1;
            System.out.println("Team "+ j +": "+listofteam[i].getname());
        }
    }
}
