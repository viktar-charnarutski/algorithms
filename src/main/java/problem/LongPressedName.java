package problem;

/**
 * 925. Long Pressed Name
 * <p>
 * Your friend is typing his name into a keyboard.  Sometimes, when typing a character c, the key might get long
 * pressed, and the character will be typed 1 or more times.
 * <p>
 * You examine the typed characters of the keyboard.  Return True if it is possible that it was your friends name, with
 * some characters (possibly none) being long pressed.
 */
public class LongPressedName {
    public boolean isLongPressedName(String name, String typed) {
        // Input: name = "alex", typed = "aaleex"
        int typedInd = 0;
        for (int nameInd = 0; nameInd < name.length(); nameInd++) {
            if (typedInd >= typed.length() || name.charAt(nameInd) != typed.charAt(typedInd)) {
                return false;
            }
            typedInd++;
            if (nameInd + 1 < name.length() && typedInd < typed.length()
                    && name.charAt(nameInd + 1) != typed.charAt(typedInd)) {
                while (typedInd < typed.length() && typed.charAt(typedInd) == name.charAt(nameInd)) {
                    typedInd++;
                }
            }
        }
        return typedInd == typed.length();
    }
}
