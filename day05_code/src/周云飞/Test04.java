package 周云飞;
/*打印100-1000以内的对称数（如 101 111  121  131  141  ....）并且求统计一共有多少个*/
public class Test04 {
    public static void main(String[] args) {
        int num =0;
        for (int i = 100; i <1000 ; i++) {
            int bai = i/100;
            int ge = i%10;
            if(bai==ge){
                System.out.println(i);
                num++;
            }
        }
        System.out.println("=============================");
        System.out.println("一共有："+num+"个");
    }
}
