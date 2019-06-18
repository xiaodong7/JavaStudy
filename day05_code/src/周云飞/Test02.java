package 周云飞;
/*商场根据消费金额不同,折扣也不同,折扣的规则如下（P代表消费的总金额）：
        P>=2000 7折，1000<=P<2000 8折，500<=P<1000 9.5折，P<500 不打折
        需求:自定义p1=200，
        输出对应的折扣和折扣前后的金额.
        输出格式如下：
        “打折前的价格为1500元，打折后的价格为1200元”
        “打折前的价格为200元，不参与打折活动”*/
public class Test02 {
    public static void main(String[] args) {
        int p =200;
        if(p>=2000){
            System.out.println("打折前的价格为"+p+"元，打折后的价格为："+(0.7*p)+"元");
        }else if(p>=1000 && p<2000){
            System.out.println("打折前的价格为"+p+"元，打折后的价格为："+(0.8*p)+"元");
        }else if(p>=500 && p<1000){
            System.out.println("打折前的价格为"+p+"元，打折后的价格为："+(0.95*p)+"元");
        }else if(p <500&&p>0){
            System.out.println("打折前的价格为"+p+"元，不参与打折活动");
        }else{
            System.out.println("p数据不正常");
        }
    }
}
