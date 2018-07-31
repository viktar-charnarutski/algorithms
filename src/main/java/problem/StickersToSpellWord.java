package problem;

import java.util.HashMap;
import java.util.Map;

/**
 * 691. Stickers to Spell Word
 * <p>
 * We are given N different types of stickers. Each sticker has a lowercase English word on it.
 * <p>
 * You would like to spell out the given target string by cutting individual letters from your collection of stickers
 * and rearranging them.
 * <p>
 * You can use each sticker more than once if you want, and you have infinite quantities of each sticker.
 * <p>
 * What is the minimum number of stickers that you need to spell out the target? If the task is impossible, return -1.
 */
public class StickersToSpellWord {
    public int minStickers(String[] stickers, String target) {
        if (stickers == null || stickers.length == 0) return -1;
        if (target == null || target.isEmpty()) return 0;

        // arrange all chars a unique chars set mapped to sticker's num
        Map<Character, Integer /*sticker num*/> letters = new HashMap<>();
        for (int i = 0; i < stickers.length; i++) {
            for (char c : stickers[i].toCharArray()) {
                letters.put(c, i);
            }
        }

        // check if target could be composed out from stickers' chars
        int[] usedStickers = new int[stickers.length];
        for (char c : target.toCharArray()) {
            if (letters.containsKey(c)) {
                usedStickers[letters.get(c)]++;
            } else {
                return -1;
            }
        }

        // count used stickers
        int stickersAmount = 0;
        for (int s : usedStickers) {
            stickersAmount += s > 0 ? 1 : 0;
        }

        return stickersAmount;
    }
}
