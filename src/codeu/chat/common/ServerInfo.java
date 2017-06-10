package codeu.chat.common;

import codeu.chat.util.Uuid;

import java.io.IOException;

public class ServerInfo {
    private final static String SERVER_VERSION = "1.0.0";

    public final Uuid version;
    public ServerInfo() throws IOException {
        this.version = Uuid.parse(SERVER_VERSION);
    }
    public ServerInfo(Uuid version) {
        this.version = version;
    }
}
