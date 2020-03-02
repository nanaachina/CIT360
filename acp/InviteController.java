
package acp;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author adm-achina
 */

public class InviteController {
    
    // private Hashmap usage below
    
    private HashMap<String, InviteHandler> controlHash = new HashMap<>();
    
    // public controller below
    
    public InviteController() {
        
        // Creating need for Online to work
        
        InviteFriend InviteFriend = new InviteFriend();
        controlHash.put("Online", InviteFriend);
        
    }
    
      
    public void handle(String Status, Integer playerID, ArrayList<String>... PUBGArray) {
        
        // Retrieves value from Status
        
        InviteHandler PUBGInvite = controlHash.get(Status);
        
        PUBGInvite.HandleInvites(playerID, PUBGArray);
        
    }
    
    
}
