package edu.wright.crowningkings.base.ServerMessage;

import edu.wright.crowningkings.base.BaseClient;

/**
 * Created by csmith on 11/8/16.
 */

public class Ready extends AbstractServerMessage {
    public Ready() {
        String[] parameters = new String[1];
        parameters[0] = "105 ";
        setParameters(parameters);
    }

    public void run(BaseClient client) {
        //do something
    }
}
