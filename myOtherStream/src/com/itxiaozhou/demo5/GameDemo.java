package com.itxiaozhou.demo5;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class GameDemo {
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();
        FileReader fr = new FileReader("myOtherStream\\game.txt");
        p.load(fr);
        fr.close();

        String count = p.getProperty("count");
        int number = Integer.parseInt(count);

        if (number >= 3) {
            System.out.println("游戏试玩结束,请充值...");
        } else {
            System.out.println("开始玩游戏...");
            number++;
            p.setProperty("count", String.valueOf(number));
            FileWriter fw = new FileWriter("myOtherStream\\game.txt");
            p.store(fw,null);
            fw.close();


        }
    }
}
