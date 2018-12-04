import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyStringDemo {

    public static ArrayList<Long> parseStringSectionsToList(String str) {
        ArrayList<Long> sections = new ArrayList<>();
        if (StringUtils.isEmptyOrNull(str)) return sections;

        if (str.contains(",")) {
            String[] arr = str.split(",");
            for (int i = 0, len = arr.length; i < len; i++) {
                String item = arr[i];
                if (item.contains("-")) {
                    String[] arr2 = item.split("-");
                    long prefix = Long.parseLong(arr2[0]);
                    long suffix = Long.parseLong(arr2[1]);
                    for (long j = prefix; j < (suffix + 1); j++) {
                        sections.add(j);
                    }
                } else {
                    sections.add(Long.parseLong(item));
                }
            }
        } else {
            if (str.contains("-")) {
                String[] arr = str.split("-");
                long prefix = Long.parseLong(arr[0]);
                long suffix = Long.parseLong(arr[1]);
                for (long j = prefix; j < (suffix + 1); j++) {
                    sections.add(j);
                }
            } else {
                sections.add(Long.parseLong(str));
            }
        }
        return sections;
    }

    public void methodB(int x, int y) {
        try {
            float z= methodA(x,y);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("methodB catch");
        }

        System.out.println("methodB return");
    }

    public float methodA(int x, int y) throws Exception {
        double z = x / y;
        if (z > 0) {
            System.out.println("methodA z > 0");
            return 10f;
        }
        System.out.println("methodA return");
        return 1.0f;
    }

    /**
     * 将list数据生成类似1-50,200格式字符串
     */
    public static String parseListSectionsToString(List<Long> list) {
        if (list == null || list.isEmpty()) return null;
        String sections;
        StringBuilder builder = new StringBuilder();
        Iterator<Long> iterator = list.iterator();
        long pre = Long.MIN_VALUE;
        long current;
        int length;
        while (iterator.hasNext()) {
            current = iterator.next();
            if (pre == Long.MIN_VALUE) {
                builder.append(String.valueOf(current));
            } else {
                if (current - 1 == pre) {
                    length = builder.length(); //1,2,3,4,5,6,7,8,9,10,15,16,17,18,19,20,22,100,101,102,103,104,105,107,109,110,111,112,113,114,115,
                    if (length == String.valueOf(pre).length()  || !"-".equals(String.valueOf(builder.charAt(length - String.valueOf(pre).length() - 1)))) {
                        builder.append("-");
                        builder.append(String.valueOf(current));
                    } else {
                        builder.delete(length - String.valueOf(pre).length(), length);
                        builder.append(String.valueOf(current));
                    }
                } else {
                    builder.append(",");
                    builder.append(String.valueOf(current));
                }
            }
            pre = current;
        }
        sections = builder.toString();
        return sections;
    }

    //验证上述两个方法正确性
    public static void main(String[] args) {
       /* ArrayList<Long> list = parseStringSectionsToList("10-11,15,16-20,22,100-105,107,109,110-115");
        for (long i : list) {
            System.out.print(i + ",");
        }
        String s = parseListSectionsToString(list);
        System.out.println();
        System.out.print(s);*/
       /* List<Long> list = new ArrayList();
        list.add(10l);
        list.add(12l);
        long[] longs = new long[]{10, 12};
        Gson gson = new Gson();
        System.out.println(gson.toJson(list));
        System.out.println(gson.toJson(longs));

        String[] strings = new String[]{"12","110"};
        System.out.println(gson.toJson(strings));*/

     /*  MyStringDemo myStringDemo = new MyStringDemo();
       myStringDemo.methodB(0,0);*/
     String a = "11;12";
     String[] b =  a.split(";");
     System.out.println(b.length);

     String  uri = "https://enaudio.ating.info/BSKdX6qT3NaY5gCd7lqObWINEzw=/lr_E-RD5nDZ-Unt8PVyzRVCANhN2?sign=7bf489a3cb3f0454d8183c75286aa954&t=5b9c8385";
     String  uri2 = "https://enaudio.ating.info/BSKdX6qT3NaY5gCd7lqObWINEzw=/lr_E-RD5nDZ-Unt8PVyzRVCANhN2";

     System.out.println(uri2.substring(0, uri2.indexOf("?")));

    }
}
