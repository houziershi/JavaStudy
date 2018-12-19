import dimens.utils.MakeUtils;

import java.util.TimeZone;

public class StringUtils {

    /**Created by guokun on 2018/12/18.
     * Description: static静态块*/
    static {
        System.out.println("static block");
    }

    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

    public static boolean isEmptyOrNull(String str) {
        return str == null || str.length() == 0 || "null".equalsIgnoreCase(str);
    }

    public static long getCurrentDateVersion(int dayNum) {
        // 每天凌晨5点作为是否更新缓存的临界点
        return (System.currentTimeMillis() - 5 * 60 * 60 * 1000 + TimeZone.getDefault().getRawOffset())
                / (dayNum * 24 * 60 * 60 * 1000);
    }

    public static void main(String[] args) {
        long l = Long.MAX_VALUE + 100;
        System.out.println(MakeUtils.str);
//        MakeUtils.mainTest();
        System.out.println(l);
        System.out.println(getCurrentDateVersion(1));
        System.out.println(Long.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
    }
}
