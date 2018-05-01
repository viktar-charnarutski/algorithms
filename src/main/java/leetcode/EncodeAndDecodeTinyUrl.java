package leetcode;

import java.util.HashMap;

/**
 * 535. Encode and Decode TinyURL
 * <p>
 * TinyURL is a URL shortening service where you enter a URL such as https://leetcode.com/problems/design-tinyurl
 * and it returns a short URL such as http://tinyurl.com/4e9iAk.
 * <p>
 * Design the encode and decode methods for the TinyURL service. There is no restriction on how your encode/decode
 * algorithm should work.
 * You just need to ensure that a URL can be encoded to a tiny URL and the tiny URL can be decoded to the original URL.
 */
public class EncodeAndDecodeTinyUrl {
    private HashMap<String, String> urls = new HashMap<>();

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        if (longUrl == null || longUrl.isEmpty()) return longUrl;

        String shortUrl = encodedUrlFor(longUrl);

        if (urls.containsKey(shortUrl)) {
            return urls.get(shortUrl);
        }
        urls.put(shortUrl, longUrl);

        return shortUrl;
    }

    private String encodedUrlFor(String longUrl) {
        StringBuilder encoded = new StringBuilder("http://tinyurl.com/");
        char[] chars = longUrl.trim().toCharArray();

        for (int i = 0; i < chars.length; i += 5) {
            char c = chars[i];
            if (c - 'a' > 0) encoded.append(c);
        }
        return encoded.toString();
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return urls.get(shortUrl);
    }
}
