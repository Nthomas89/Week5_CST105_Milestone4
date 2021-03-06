/*
 * Program: Milestone 4
 * File: Player_Manager.java
 * Summary: Modified to shoe Players of Offense and Defense
 * Author: Nicholas Thomas
 * Date: December 24, 2017
 * This is my own work
 */

import java.util.ArrayList;



public class Player_Manager {
	
	public static void main(String[] args) {
	        
        //create array list of player objects
        ArrayList<NFL_Players> Players = new ArrayList<>();
       
        createPlayers(Players);
        
        for(int index = 0; index < Players.size();++index)
        {
            String name = (Players.get(index).getName());
            int age = (Players.get(index).getAge());
            String position = (Players.get(index).getPosition());
            int height = (Players.get(index).getHeight());
            System.out.printf(name +"\n", + height + "\n", + age + "\n", position);
        }
        

    }
    @SuppressWarnings("rawtypes")
	public static ArrayList createPlayers(ArrayList<NFL_Players> Players)
    {
        //offensive players
        NFL_Players drew = new Offensive_Players("Drew Stanton", "Quarterback", "Arizona Cardinals", 75, 243, 33,
				10, "Michigan State", 0, 0, 0, 0);
        NFL_Players jaron = new Offensive_Players("Jaron Brown", "Wide Reciever", "Arizona Cardinals", 6-2, 205, 27,
				5, "Clemson", 30, 3, 15.1, 0);
        NFL_Players larry = new Offensive_Players("Larry Fitzgerald", "Wide Reciever", "Arizona Cardinals", 6-3, 218, 34,
				14, "Pittsburg", 101, 6, 10.9, 1);
        NFL_Players adrian = new Offensive_Players("Adrian Peterson", "Runningback", "Arizona Cardinals", 76-1, 220, 32,
				11, "Oklahoma", 9, 2, 3.5, 2);

        //defensive players
       NFL_Players josh = new Defensive_Players("Josh Mauro", "Defensive end", "Arizona Cardinals", 6-6, 282, 26,
				4, "Stanford", 0, 20, 0);
       NFL_Players frostee = new Defensive_Players("Frostee Rucker", "Defensive End", "Arizona Cardinals", 6-3, 280, 34,
				12, "USC", 0, 20, 0);
       NFL_Players patrick = new Defensive_Players("Patrick  Peterson", "CornerBack", "Arizona Cardinals", 6-1, 203, 27,
				7, "LSU", 0, 26, 1);
       NFL_Players chandler = new Defensive_Players("Chandler Jones", "OutsideLineBacker", "Arizona Cardinals", 6-5, 265, 27,
				6, "Syracuse", 2, 47, 0);

        //add players to list
        Players.add(drew);
        Players.add(jaron);
        Players.add(larry);
        Players.add(adrian);
        Players.add(josh);
        Players.add(frostee);
        Players.add(patrick);
        Players.add(chandler);
        
        return Players;
    }	

}

