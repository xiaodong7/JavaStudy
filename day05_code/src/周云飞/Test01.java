package 周云飞;
/*定义两个整数 int a  int b  用 三元运算符来求出a 和b 的最大值max,并    且打印出来。*/
/*定义三个整数 int x,int y ,int z 用if语句来求出x,y,z的最小值min,并且打印出来*/
public class Test01 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        System.out.println("max:"+(a > b ? a : b));
        System.out.println("====================================");
        int x =3;
        int y =2;
        int z =1;
        int min = 0;
        if(x>y && y>z){
            min = z;
            System.out.println("最小值为："+min);
        }else if(x>z && z>y){
            min = y;
            System.out.println("最小值为："+min);
        }else{
            min = x;
            System.out.println("最小值为："+min);
        }

    }
}
