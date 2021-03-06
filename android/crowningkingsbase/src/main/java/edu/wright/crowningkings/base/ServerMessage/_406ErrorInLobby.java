package edu.wright.crowningkings.base.ServerMessage;

import edu.wright.crowningkings.base.BaseClient;

/**
 * Created by csmith on 11/3/16.
 */

public class _406ErrorInLobby extends AbstractServerMessage {
    public _406ErrorInLobby(String message) {
        setParameters(message.split(" "));
    }

    public void run(BaseClient client) {
		System.out.println("_406ErrorInLobby.run(BaseClient)");
		client.errorLobby();
    }
}
