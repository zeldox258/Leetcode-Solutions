
public class Codec {
    Map<String, String> map = new HashMap<>();
    String base = "http://tinyurl.com/";
    int id = 0;
    public String encode(String longUrl) {
        String key = base + id++;
        map.put(key, longUrl);
        return key;
    }
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}
