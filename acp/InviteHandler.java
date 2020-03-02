
package acp;

import java.util.ArrayList;

/**
 *
 * @author adm-achina
 */
 
public interface InviteHandler {
    
    // The handler is the smallest portion of the Application Controller
    // This one handles the list of String Arrays and the Integer PlayerID
    
    public void HandleInvites(Integer playerID, ArrayList<String>... PUBGArray);

    
}
