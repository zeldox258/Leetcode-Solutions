
import java.util.*;
class Logger {
    Map<String,Integer> map=new HashMap<>();
    public boolean shouldPrintMessage(int timestamp, String message) {
        if (timestamp<map.getOrDefault(message,0)) return false;
        map.put(message,timestamp+10); return true;
    }
}
