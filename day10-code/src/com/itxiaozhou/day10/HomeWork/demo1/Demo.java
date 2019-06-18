package com.itxiaozhou.day10.HomeWork.demo1;
/*

        1.定义手机类
        行为:  打电话,发短信

        2.定义接口IPlay
        行为: 玩游戏

        3.定义旧手机类继承手机类
        行为: 继承父类的行为

        4.定义新手机继承手机类实现IPlay接口
        行为: 继承父类的行为,重写玩游戏方法

        5.定义测试类
        在测试类中定义一个 用手机的方法,要求该方法既能接收老手机对象,也能接收新手机对象
        在该方法内部调用打电话,发短信以及新手机特有的玩游戏方法


        运行效果
        旧手机打电话
        旧手机发信息
        新手机打电话
        新手机发信息
        新手机玩游戏
*/

public class Demo {
    public static void main(String[] args) {
        NewPhone newPhone = new NewPhone();
        OldPhone oldPhone = new OldPhone();
        method(oldPhone);
        method(newPhone);
    }

    private static void method(Phone p) {
        if(p instanceof NewPhone){
            NewPhone newPhone = (NewPhone) p;
            newPhone.call();
            newPhone.message();
            newPhone.play();

        }else if(p instanceof OldPhone){
            OldPhone oldPhone = (OldPhone) p;
            p.call();
            p.message();
        }
    }
}
