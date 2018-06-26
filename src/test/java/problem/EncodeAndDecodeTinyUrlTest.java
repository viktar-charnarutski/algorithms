package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EncodeAndDecodeTinyUrlTest {

    @Test
    public void encodeDecode() {
        String url = "http://www.viktarx.com/blog/2018/02/13/memory-usage-optimization-for-distributed-cache-cluster.html";
        EncodeAndDecodeTinyUrl codec = new EncodeAndDecodeTinyUrl();
        String encodedUrl = codec.encode(url);
        assertEquals(url, codec.decode(encodedUrl));
    }
}