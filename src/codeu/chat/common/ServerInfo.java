package codeu.chat.common;

import codeu.chat.util.Uuid;

import java.io.IOException;

public class ServerInfo {
    private final static String SERVER_VERSION = "1.0.0";

    public Uuid version = null;

    public ServerInfo() {
        try {
            this.version = Uuid.parse(SERVER_VERSION);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ServerInfo(Uuid version) {
        this.version = version;
    }
}
