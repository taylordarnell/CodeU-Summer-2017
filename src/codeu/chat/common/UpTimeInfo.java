package codeu.chat.common;

import codeu.chat.util.Time;

public class UpTimeInfo {
    public final Time startTime;
    public UpTimeInfo() {
        this.startTime = Time.now();
    }
    public UpTimeInfo(Time startTime) {
        this.startTime = startTime;
    }
}
