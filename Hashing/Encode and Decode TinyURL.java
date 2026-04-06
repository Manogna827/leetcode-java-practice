public class Codec {
    HashMap<String,String> map=new HashMap<>();
    String base="http://tinyurl.com/";
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String key=Integer.toHexString(longUrl.hashCode());
        while(map.containsKey(key)&&!map.get(key).equals(longUrl)){
            key=key+"#";
        }
     map.put(key,longUrl);
     return base+key;   }
    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String key=shortUrl.replace(base,"");
        return map.get(key);    } }

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
