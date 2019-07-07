package demo4;

/*分别使用 String 的+=和 StringBuilder 的 append 方法对字符串做 100000 次拼
        接， 计算 String 拼接 100000 次花费时间与 StringBuilder 拼接 100000 次所花费时
        间并打印。*/
public class StringBuilderDemo {
    public static void main(String[] args) {

        method();//stringBuilder拼接10000次所需时间
        method1();//string拼接10000次所需时间
    }

    private static void method1() {
        long l = System.currentTimeMillis();
        String sb = "小周";
        for (int i = 1; i <= 10000; i++) {
            sb += ",";
        }
        long l1 = System.currentTimeMillis();
        System.out.println((l1 - l));
    }

    private static void method() {
        long l = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("小周");
        for (int i = 1; i <= 10000; i++) {
            sb.append(",");
        }
        long l1 = System.currentTimeMillis();
        System.out.println((l1 - l));
    }
}
