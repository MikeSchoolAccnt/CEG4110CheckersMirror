package edu.wright.crowningkings.base.ServerMessage;

import edu.wright.crowningkings.base.BaseClient;

/**
 * Created by csmith on 11/3/16.
 */

public class _235StoppedObserving extends AbstractServerMessage {
    public _235StoppedObserving(String message) {
        String[] param = message.split(" ");
		String msgID = param[0];
		String table = param[1];
		String[] fullParam = {msgID, table};
        setParameters(fullParam);
    }

    public void run(BaseClient client) {
		System.out.println("_235StoppedObserving.run(BaseClient)");
		String[] p = getParameters();
		client.stoppedObserving(p[1]);
    }
}
