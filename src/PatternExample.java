import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExample {
    public static final int USERCENTER_REFRESH_ALL = 0x10000000;
    public static int SHOW_LOADING = 0x00000100;
    public static int READ_CACHE = 0x00000010;

    public static void main(String[] args) {
        int refreshMode = SHOW_LOADING | USERCENTER_REFRESH_ALL;
        if (refreshMode == READ_CACHE) {
            System.out.println(11111);
        }
        if ((refreshMode & SHOW_LOADING) == SHOW_LOADING) {
            System.out.println(2222);
        }

        long l = 543000;

        String str = "id=1&type=0";
        String[] strs = str.split("&");
        Map<String, String> map = new HashMap<>();
        for (String s : strs) {
            System.out.println(s);
            String[] ss = s.split("=");
            map.put(ss[0], ss[1]);
        }
        System.out.println(map.size());
        try {
            System.out.println("====" + InetAddress.getByName("baidu.com").getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        try {
            URL url = new URL("http://vb.wting.info/fiction/wenxue/nkjwl/ioo0v3fv.mp3?token=KPlVpTk2HLTP1SZKF6GjFg**_ngjdEXw8zlOtM1vDbNt70LXM3Sjiu9Py&e=1526021126063&t=2&res=380911199&sign=1eecae7f4ee15947fc4232309d7ac042");
            System.out.println(url.getHost());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        String tem = getIP("http://blog.lrts.me/?cat=2&lazyref=app&lazyembed=app&uid=0&mparam=VHKg%2BJDx2kiMfd05AWT11nLcvSwtmfTIvg%2BSsvubxixJ81NFylnpSOwtQCNT9f68T9bd6aRJlSyF%0ApH2FlVLfhPbAUzunuPHW");
        System.out.println(tem);
    }

    public static String getIP(String url) {
        //使用正则表达式过滤，
        String re = "((http|ftp|https)://)(([a-zA-Z0-9._-]+)|([0-9]{1,3}.[0-9]{1,3}.[0-9]{1,3}.[0-9]{1,3}))(([a-zA-Z]{2,6})|(:[0-9]{1,4})?)";
        String str = "";
        // 编译正则表达式
        Pattern pattern = Pattern.compile(re);
        // 忽略大小写的写法
        // Pattern pat = Pattern.compile(regEx, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(url);
        //若url==http://127.0.0.1:9040或www.baidu.com的，正则表达式表示匹配
        if (matcher.matches()) {
            str = url;
        } else {
            String[] split2 = url.split(re);
            if (split2.length > 1) {
                String substring = url.substring(0, url.length() - split2[1].length());
                str = substring;
            } else {
                str = split2[0];
            }
        }
        return str;
    }
}
