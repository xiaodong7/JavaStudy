package 周云飞;
/*定义一个方法，传入一个int类型的数值 n，打印出相应次数n次的   ”helloworld!!!”*/
public class Test03 {
    public static void main(String[] args) {
        a(3);
    }

    private static void a(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("helloworld!!!");
        }
    }
}
