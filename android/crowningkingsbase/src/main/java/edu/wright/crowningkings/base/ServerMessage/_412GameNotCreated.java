package edu.wright.crowningkings.base.ServerMessage;

import edu.wright.crowningkings.base.BaseClient;

/**
 * Created by csmith on 11/3/16.
 */

public class _412GameNotCreated extends AbstractServerMessage {
    public _412GameNotCreated(String message) {
        setParameters(message.split(" "));
    }

    public void run(BaseClient client) {
		System.out.println("_412GameNotCreated.run(BaseClient)");
		client.gameNotCreated();
    }
}
