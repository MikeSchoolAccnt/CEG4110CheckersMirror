package edu.wright.crowningkings.base.ServerMessage;

import edu.wright.crowningkings.base.BaseClient;

/**
 * Created by csmith on 11/3/16.
 */

public class _411TableNotExist extends AbstractServerMessage {
    public _411TableNotExist(String message) {
        setParameters(message.split(" "));
    }

    public void run(BaseClient client) {
		System.out.println("_411TableNotExist.run(BaseClient)");
		client.tableNotExist();
    }
}
