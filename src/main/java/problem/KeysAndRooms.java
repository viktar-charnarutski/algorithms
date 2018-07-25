package problem;

import java.util.*;

/**
 * 841. Keys and Rooms
 * <p>
 * There are N rooms and you start in room 0.  Each room has a distinct number in 0, 1, 2, ..., N-1,
 * and each room may have some keys to access the next room.
 * <p>
 * Formally, each room i has a list of keys rooms[i], and each key rooms[i][j] is an integer in [0, 1, ..., N-1]
 * where N = rooms.length.  A key rooms[i][j] = v opens the room with number v.
 * <p>
 * Initially, all the rooms start locked (except for room 0).
 * <p>
 * You can walk back and forth between rooms freely.
 * <p>
 * Return true if and only if you can enter every room.
 */
public class KeysAndRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        if (rooms == null || rooms.size() == 0) return true;

        Set<Integer> openedRooms = new HashSet<>();
        Queue<Integer> keysToCheck = new LinkedList<>();
        keysToCheck.offer(0);

        while (!keysToCheck.isEmpty()) {
            Integer keyToCheck = keysToCheck.poll();
            if (keyToCheck == null) {
                continue;
            }
            openedRooms.add(keyToCheck);
            List<Integer> foundKeys = rooms.get(keyToCheck);
            for (Integer key : foundKeys) {
                if (key != null && !openedRooms.contains(key)) {
                    keysToCheck.offer(key);
                }
            }
        }
        return openedRooms.size() == rooms.size();
    }
}
