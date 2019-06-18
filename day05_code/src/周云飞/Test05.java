package 周云飞;
/*定义数组{23,55,32,18,67,75,97,12,78,89}，求数组的最大值  总和, 平均值与奇数的个数。*/
public class Test05 {
    public static void main(String[] args) {
        int [] arr = {23,55,32,18,67,75,97,12,78,89};
        max(arr);
        avgAndSum(arr);
        count(arr);
    }

    private static void count(int [] arr) {
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2!=0){
               num++;
            }
        }
        System.out.println("奇数的个数是："+num);

    }

    public static void max(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("数组的最大值为："+max);
    }

    public static void avgAndSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+= arr[i];
        }
        System.out.println("数组的总和为："+sum);
        double avg = (double) sum / arr.length;
        System.out.println("数组的平均值为："+avg);
    }
}
