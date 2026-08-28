import java.util.*;

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {

        Integer[] index = new Integer[names.length];

        for (int i = 0; i < names.length; i++) {
            index[i] = i;
        }

        Arrays.sort(index, (a, b) -> heights[b] - heights[a]);

        String[] result = new String[names.length];

        for (int i = 0; i < names.length; i++) {
            result[i] = names[index[i]];
        }

        return result;
    }
}
