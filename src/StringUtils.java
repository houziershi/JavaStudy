

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by xiaojian.fu on 2017/6/8.
 */

public class StringUtils {

    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

    public static boolean isEmptyOrNull(String str) {
        return str == null || str.length() == 0 || "null".equalsIgnoreCase(str);
    }


}
