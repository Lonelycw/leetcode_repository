import java.util.Arrays;

/**
 * @author xujiazheng
 * @Description:有效的字母异位词
 * @date 2022/4/15
 */
public class topic_242 {
    public boolean isAnagram(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        return Arrays.equals(sArr, tArr);
    }
}
