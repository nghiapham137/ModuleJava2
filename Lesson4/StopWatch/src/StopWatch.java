import java.util.Date;
import java.util.Scanner;

public class StopWatch {
    private long startTime,endTime;

    public long getStartTime() {
        return this.startTime = System.currentTimeMillis();
    }

    public long getEndTime() {
        return this.endTime = System.currentTimeMillis();
    }
    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }

    
}

