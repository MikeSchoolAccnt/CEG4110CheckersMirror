package edu.wright.crowningkings.base.ServerMessage;

import edu.wright.crowningkings.base.BaseClient;

/**
 * Created by csmith on 11/3/16.
 */

public class _217NowLeftLobby extends AbstractServerMessage {
    public _217NowLeftLobby(String message) {
        String[] param = message.split(" ");
		String msgID = param[0];
		String client = param[1];
		String[] fullParam = {msgID, client};
        setParameters(fullParam);
    }

    public void run(BaseClient client) {
		System.out.println("_217NowLeftLobby.run(BaseClient)");
		client.nowLeftLobby(getParameters()[1]);
    }
}
