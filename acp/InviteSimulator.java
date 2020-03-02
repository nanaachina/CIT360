
package acp;

import java.util.ArrayList;

/**
 *
 * @author adm-achina
 */
 
public class InviteSimulator {

    public static void main(String[] args) {
        
        InviteController PUBGController = new InviteController();
        
    	// Offline and In Game status representation
    	String OfflineStatus = "Offline";
    	String InGameStatus = "In Game";
    		
        ArrayList<String> SteamFriendList = new ArrayList<>();
        ArrayList<String> TeamMembers = new ArrayList<>();
        
        String Status;
        Integer PlayerID, TeamMembersStatus;
        
	// Creating "friend list"
        
        SteamFriendList.add("Kofi");
        SteamFriendList.add("Kwame");
        SteamFriendList.add("Foster");
        SteamFriendList.add("Bismac");
        SteamFriendList.add("Mensa");
        SteamFriendList.add("Ntim");
        SteamFriendList.add("Oduro");
        SteamFriendList.add("Sophus");
        SteamFriendList.add("Lucy");

 
        
	// Sa!t called because they have Status = Online
				
        System.out.println("Invite Sent");
        Status = "Online";
        PlayerID = 0;
        PUBGController.handle(Status, PlayerID, SteamFriendList, TeamMembers);
        
        // Text output to "simulate" player being offline
        
        System.out.println("Invite Not Sent. Player is offline. \n");
        
        // Text output to "simulate" player being offline
        
        System.out.println("Invite Not Sent. Player is offline. \n");
        
        // Master2Mind called because they have Status = Online
        
        System.out.println("Invite Sent");
        Status = "Online";
        PlayerID = 3;
        PUBGController.handle(Status, PlayerID, SteamFriendList, TeamMembers);
        
        // Text output to "simulate" player being offline
        
        System.out.println("Invite Not Sent. Player is offline. \n");
        
        // BenignBrett called because they have Status = Online
        
        System.out.println("Invite Sent");
        Status = "Online";
        PlayerID = 5;
        PUBGController.handle(Status, PlayerID, SteamFriendList, TeamMembers);
        
 
        
        // Text output to "simulate" player being offline
        
        System.out.println("Invite Not Sent. Player is offline. \n");
        
        // Text output to "simulate" player being offline
        
        System.out.println("Invite Not Sent. Player is offline. \n");
        
        // Text output to "simulate" player being offline
        
        System.out.println("Invite Not Sent. Player is offline. \n");
        
    }
}