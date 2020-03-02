
package acp;

import java.util.ArrayList;

/**
 *
 * @author adm-achina
 */
 
public class InviteFriend implements InviteHandler {
   
    
    public void HandleInvites(Integer playerID, ArrayList<String>... PUBGArray) {
        
        // Declaration of the two 
        
        Integer PlayerID = playerID;
        ArrayList<String> SteamFriendList = PUBGArray[0];
        ArrayList<String> TeamMembers = PUBGArray[1];
        
        // This will add the declared items in TeamMembers to the SteamFriendsList array according to PlayerID typed
        
        TeamMembers.add(SteamFriendList.get(PlayerID));
        
        // Outputs when player is added to team.
        
        System.out.println(SteamFriendList.get(PlayerID) + " has joined the game.");
        
        // Displays the leader of the team and those that joined.
        
        System.out.println("Party Leader: GreatGoldenBaby \n" + "Party Members:" + TeamMembers + "\n");
    
     
    }
    
}
