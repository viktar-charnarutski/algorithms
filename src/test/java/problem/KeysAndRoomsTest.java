package problem;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class KeysAndRoomsTest {

    @Test
    public void canVisitAllRooms1() {
        ArrayList<List<Integer>> rooms = new ArrayList<>();
        ArrayList<Integer> keys1 = new ArrayList<>();
        keys1.add(1);
        rooms.add(keys1);
        ArrayList<Integer> keys2 = new ArrayList<>();
        keys2.add(2);
        rooms.add(keys2);
        ArrayList<Integer> keys3 = new ArrayList<>();
        keys3.add(3);
        rooms.add(keys3);
        ArrayList<Integer> keys4 = new ArrayList<>();
        rooms.add(keys4);
        assertTrue(new KeysAndRooms().canVisitAllRooms(rooms));
    }
    @Test
    public void canVisitAllRooms2() {
        ArrayList<List<Integer>> rooms = new ArrayList<>();
        ArrayList<Integer> keys1 = new ArrayList<>();
        keys1.add(1);
        keys1.add(3);
        rooms.add(keys1);
        ArrayList<Integer> keys2 = new ArrayList<>();
        keys2.add(3);
        keys2.add(0);
        keys2.add(1);
        rooms.add(keys2);
        ArrayList<Integer> keys3 = new ArrayList<>();
        keys3.add(2);
        rooms.add(keys3);
        ArrayList<Integer> keys4 = new ArrayList<>();
        keys4.add(0);
        rooms.add(keys4);
        assertTrue(new KeysAndRooms().canVisitAllRooms(rooms));
    }
}