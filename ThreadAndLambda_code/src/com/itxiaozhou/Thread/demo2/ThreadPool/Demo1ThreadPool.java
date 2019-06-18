package com.itxiaozhou.Thread.demo2.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * java.util.concurrent.Executors :线程池的工厂类，用来生成线程池
 * Executors的静态方法：
 * static ExecutorService newFixedThreadPool(int nThreads) 创建一个可重用固定线程数的线程池
 *        参数：
 *        int nThreads:创建线程池中线程包含数量
 *        返回值：
 *        ExecutorService接口，返回的是ExecutorService接口的实现类对象，我们可以使用ExecutorService接口接收（面向接口编程）
 *
 *        线程池的使用步骤:
 *        1.使用线程池的工厂类Executors中提供的静态方法newFixedThreadPool生产一个指定线程数量的线程池
 *        2.创建一个类,实现Runnable接口,重写run方法,设置线程任务
 *        3.调用ExecutorService中的方法submit,用来传递线程任务(实现类),开启线程,执行run方法
 *        4.调用ExecutorService中的方法shutdown,用来结束线程池(不建议执行)
 */
public class Demo1ThreadPool {
    public static void main(String[] args) {
        //1.使用线程池的工厂类Executors中提供的静态方法newFixedThreadPool生产一个指定线程数量的线程池
        ExecutorService es = Executors.newFixedThreadPool(3);
        //3.调用ExecutorService中的方法submit,用来传递线程任务(实现类),开启线程,执行run方法
        es.submit(new RunnableImpl());//pool-1-thread-2创建了一个新的线程执行了
        es.submit(new RunnableImpl());//pool-1-thread-3创建了一个新的线程执行了
        es.submit(new RunnableImpl());//pool-1-thread-1创建了一个新的线程执行了

        //线程池会一直开启,使用完了线程,会自动把线程归还给线程池,线程可以继续使用
        es.submit(new RunnableImpl());//pool-1-thread-2创建了一个新的线程执行了
        es.submit(new RunnableImpl());//pool-1-thread-1创建了一个新的线程执行了

        //4.调用ExecutorService中的方法shutdown,用来结束线程池(不建议执行)
        es.shutdown();//不建议执行
    }

}
