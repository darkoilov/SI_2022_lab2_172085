import java.util.ArrayList;
import java.util.List;

public class SILab2 {

    public static List<String> function(List<String> list) {                                     // 1
        if (list.size() <= 0) {                                                                  // 1
            throw new IllegalArgumentException("List length should be greater than 0");          // 2
        }                                                                                        // 2
        int n = list.size();                                                                     // 3
        int rootOfN = (int) Math.sqrt(n);                                                        // 3
        if (rootOfN * rootOfN  != n) {                                                           // 4
            throw new IllegalArgumentException("List length should be a perfect square");        // 5
        }                                                                                        // 5
        List<String> numMines = new ArrayList<>();                                               // 6
        for (int i = 0; i < n; i++) {                                                            // 7
            if (!list.get(i).equals("#")) {                                                      // 8
                int num = 0;                                                                     // 8
                if ( (i % rootOfN != 0 && list.get(i - 1).equals("#")) || (i % rootOfN != rootOfN - 1 && list.get(i + 1).equals("#")) ) {   // 9
                    if ( (i % rootOfN != 0 && list.get(i - 1).equals("#")) && (i % rootOfN != rootOfN - 1 && list.get(i + 1).equals("#")) ){  // 10
                        num += 2;                                                                // 11
                    }                                                                            // 11
                    else {                                                                       // 12
                        num  += 1;                                                               // 12
                    }                                                                            // 12
                }                                                                                // 13
                if (i - rootOfN >= 0 && list.get(i - rootOfN).equals("#")){                      // 13
                    num++;                                                                       // 14
                }                                                                                // 14
                if (i + rootOfN < n && list.get(i + rootOfN).equals("#")){                       // 15
                    num++;                                                                       // 16
                }                                                                                // 16
                numMines.add(String.valueOf(num));                                               // 17
            }                                                                                    // 18
            else {                                                                                  // 19
                numMines.add(list.get(i));                                                       // 19
            }                                                                                    // 19
        }                                                                                        // 20
        return numMines;                                                                         // 21
    }                                                                                            // 22
}
