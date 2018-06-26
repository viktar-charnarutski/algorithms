package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MergeTwoSortedListsTest {

    @Test
    public void mergeTwoLists_equal_length() {
        ListNode n11 = new ListNode(1);
        ListNode n12 = new ListNode(2);
        ListNode n13 = new ListNode(3);
        ListNode n14 = new ListNode(4);
        ListNode n15 = new ListNode(5);
        ListNode n21 = new ListNode(1);
        ListNode n22 = new ListNode(2);
        ListNode n23 = new ListNode(3);
        ListNode n24 = new ListNode(4);
        ListNode n25 = new ListNode(5);
        n11.next = n12;
        n12.next = n13;
        n13.next = n14;
        n14.next = n15;
        n21.next = n22;
        n22.next = n23;
        n23.next = n24;
        n24.next = n25;

        ListNode n31 = new ListNode(1);
        ListNode n32 = new ListNode(2);
        ListNode n33 = new ListNode(3);
        ListNode n34 = new ListNode(4);
        ListNode n35 = new ListNode(5);
        ListNode n41 = new ListNode(1);
        ListNode n42 = new ListNode(2);
        ListNode n43 = new ListNode(3);
        ListNode n44 = new ListNode(4);
        ListNode n45 = new ListNode(5);
        n31.next = n41;
        n41.next = n32;
        n32.next = n42;
        n42.next = n33;
        n33.next = n43;
        n43.next = n34;
        n34.next = n44;
        n44.next = n35;
        n35.next = n45;

        MergeTwoSortedLists ins = new MergeTwoSortedLists();
        assertEquals(n31, ins.mergeTwoLists(n11, n21));
    }


    @Test
    public void mergeTwoLists_second_greater() {
        ListNode n11 = new ListNode(1);
        ListNode n12 = new ListNode(2);
        ListNode n13 = new ListNode(3);
        ListNode n14 = new ListNode(4);
        ListNode n15 = new ListNode(5);
        ListNode n21 = new ListNode(6);
        ListNode n22 = new ListNode(7);
        ListNode n23 = new ListNode(8);
        ListNode n24 = new ListNode(9);
        ListNode n25 = new ListNode(10);
        n11.next = n12;
        n12.next = n13;
        n13.next = n14;
        n14.next = n15;
        n21.next = n22;
        n22.next = n23;
        n23.next = n24;
        n24.next = n25;

        ListNode n31 = new ListNode(1);
        ListNode n32 = new ListNode(2);
        ListNode n33 = new ListNode(3);
        ListNode n34 = new ListNode(4);
        ListNode n35 = new ListNode(5);
        ListNode n41 = new ListNode(6);
        ListNode n42 = new ListNode(7);
        ListNode n43 = new ListNode(8);
        ListNode n44 = new ListNode(9);
        ListNode n45 = new ListNode(10);
        n31.next = n32;
        n32.next = n33;
        n33.next = n34;
        n34.next = n35;
        n35.next = n41;
        n41.next = n42;
        n42.next = n43;
        n43.next = n44;
        n44.next = n45;

        MergeTwoSortedLists ins = new MergeTwoSortedLists();
        assertEquals(n31, ins.mergeTwoLists(n11, n21));
    }

    @Test
    public void mergeTwoLists_first_is_longer() {
        ListNode n11 = new ListNode(1);
        ListNode n12 = new ListNode(2);
        ListNode n13 = new ListNode(3);
        ListNode n14 = new ListNode(4);
        ListNode n15 = new ListNode(5);
        ListNode n16 = new ListNode(6);
        ListNode n21 = new ListNode(1);
        ListNode n22 = new ListNode(2);
        ListNode n23 = new ListNode(3);
        ListNode n24 = new ListNode(4);
        ListNode n25 = new ListNode(5);
        n11.next = n12;
        n12.next = n13;
        n13.next = n14;
        n14.next = n15;
        n15.next = n16;
        n21.next = n22;
        n22.next = n23;
        n23.next = n24;
        n24.next = n25;

        ListNode n31 = new ListNode(1);
        ListNode n32 = new ListNode(2);
        ListNode n33 = new ListNode(3);
        ListNode n34 = new ListNode(4);
        ListNode n35 = new ListNode(5);
        ListNode n36 = new ListNode(6);
        ListNode n41 = new ListNode(1);
        ListNode n42 = new ListNode(2);
        ListNode n43 = new ListNode(3);
        ListNode n44 = new ListNode(4);
        ListNode n45 = new ListNode(5);
        n31.next = n41;
        n41.next = n32;
        n32.next = n42;
        n42.next = n33;
        n33.next = n43;
        n43.next = n34;
        n34.next = n44;
        n44.next = n35;
        n35.next = n45;
        n45.next = n36;

        MergeTwoSortedLists ins = new MergeTwoSortedLists();
        assertEquals(n31, ins.mergeTwoLists(n11, n21));
    }

    @Test
    public void mergeTwoLists_second_is_longer() {
        ListNode n11 = new ListNode(1);
        ListNode n12 = new ListNode(2);
        ListNode n13 = new ListNode(3);
        ListNode n14 = new ListNode(4);
        ListNode n15 = new ListNode(5);
        ListNode n21 = new ListNode(1);
        ListNode n22 = new ListNode(2);
        ListNode n23 = new ListNode(3);
        ListNode n24 = new ListNode(4);
        ListNode n25 = new ListNode(5);
        ListNode n26 = new ListNode(6);
        n11.next = n12;
        n12.next = n13;
        n13.next = n14;
        n14.next = n15;
        n21.next = n22;
        n22.next = n23;
        n23.next = n24;
        n24.next = n25;
        n25.next = n26;

        ListNode n31 = new ListNode(1);
        ListNode n32 = new ListNode(2);
        ListNode n33 = new ListNode(3);
        ListNode n34 = new ListNode(4);
        ListNode n35 = new ListNode(5);
        ListNode n41 = new ListNode(1);
        ListNode n42 = new ListNode(2);
        ListNode n43 = new ListNode(3);
        ListNode n44 = new ListNode(4);
        ListNode n45 = new ListNode(5);
        ListNode n46 = new ListNode(6);
        n31.next = n41;
        n41.next = n32;
        n32.next = n42;
        n42.next = n33;
        n33.next = n43;
        n43.next = n34;
        n34.next = n44;
        n44.next = n35;
        n35.next = n45;
        n45.next = n46;

        MergeTwoSortedLists ins = new MergeTwoSortedLists();
        assertEquals(n31, ins.mergeTwoLists(n11, n21));
    }

    @Test
    public void mergeTwoLists_first_is_empty() {
        ListNode n11 = new ListNode(1);
        ListNode n12 = new ListNode(2);
        ListNode n13 = new ListNode(3);
        ListNode n14 = new ListNode(4);
        ListNode n15 = new ListNode(5);
        ListNode n21 = null;

        n11.next = n12;
        n12.next = n13;
        n13.next = n14;
        n14.next = n15;

        ListNode n31 = new ListNode(1);
        ListNode n32 = new ListNode(2);
        ListNode n33 = new ListNode(3);
        ListNode n34 = new ListNode(4);
        ListNode n35 = new ListNode(5);
        ListNode n36 = null;
        n31.next = n32;
        n32.next = n33;
        n33.next = n34;
        n34.next = n35;
        n34.next = n36;

        MergeTwoSortedLists ins = new MergeTwoSortedLists();
        assertEquals(n31, ins.mergeTwoLists(n21, n11));
    }

    @Test
    public void mergeTwoLists_second_is_empty() {
        ListNode n11 = new ListNode(1);
        ListNode n12 = new ListNode(2);
        ListNode n13 = new ListNode(3);
        ListNode n14 = new ListNode(4);
        ListNode n15 = new ListNode(5);
        ListNode n21 = null;

        n11.next = n12;
        n12.next = n13;
        n13.next = n14;
        n14.next = n15;

        ListNode n31 = new ListNode(1);
        ListNode n32 = new ListNode(2);
        ListNode n33 = new ListNode(3);
        ListNode n34 = new ListNode(4);
        ListNode n35 = new ListNode(5);
        ListNode n36 = null;
        n31.next = n32;
        n32.next = n33;
        n33.next = n34;
        n34.next = n35;
        n34.next = n36;

        MergeTwoSortedLists ins = new MergeTwoSortedLists();
        assertEquals(n31, ins.mergeTwoLists(n11, n21));
    }

    @Test
    public void mergeTwoLists_one_node_lists() {
        ListNode n22 = new ListNode(2);
        ListNode n11 = new ListNode(1);

        ListNode n31 = new ListNode(1);
        ListNode n32 = new ListNode(2);
        n31.next = n32;

        MergeTwoSortedLists ins = new MergeTwoSortedLists();
        assertEquals(n31, ins.mergeTwoLists(n22, n11));
    }
}