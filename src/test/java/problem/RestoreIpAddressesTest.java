package problem;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class RestoreIpAddressesTest {

    @Test
    public void restoreIpAddresses() {
        List<String> ips = new ArrayList<>();
        ips.add("255.255.11.135");
        ips.add("255.255.111.35");
        assertEquals(ips, new RestoreIpAddresses().restoreIpAddresses("25525511135"));
    }
}