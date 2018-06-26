package problem;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PartitionLabelsTest {

    @Test
    public void partitionLabels() {
        PartitionLabels ins = new PartitionLabels();
        ArrayList<Object> output = new ArrayList<>();
        output.add(9);
        output.add(7);
        output.add(8);
        assertEquals(output, ins.partitionLabels("ababcbacadefegdehijhklij"));
    }
}