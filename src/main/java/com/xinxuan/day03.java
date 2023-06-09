package com.xinxuan;

public class day03 {
    public static void main(String[] args) {
        System.out.println("测试开始");
        int testTimes = 10000000;
        int count = 0;
        for (int i = 1; i < testTimes; i++) {
            if (y()==1){
                count++;
            }
        }
        System.out.println((double) 1/2);
        System.out.println((double) count/(double)testTimes);

    }

    public static int f1(){
        int a = (int)(Math.random()*17) + 3;
        return a;
    }
    public static int f2(){
        int ans =0;
        do {
            ans = f1();
        }while (ans==11);
        return ans< 11?0:1;
    }
    public static int f3(){
        return (f2()<<5) + (f2()<<4) + (f2()<<3) +(f2()<<2) +(f2()<<1) +(f2());
    }
    public static int f4(){
        int ans = 0;
        do {
            ans = f3();
        }while (ans>39);
            return ans+17;
    }
    public static int x(){
        return (Math.random())>0.8?0: 1;
    }
    public static int y(){
        int ans = 0;
        do {
           ans = x();
        }while (ans == x());
        return ans;
    }
}
