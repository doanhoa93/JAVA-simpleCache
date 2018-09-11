package com.app.simplecache.exam1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Cache cache = new InMemoryCache();
        cache.add("ok","Hoa",10000);
        String a = cache.get("ok").toString();
        System.out.println("======================>");
        System.out.println(a);
        while(true){
            Thread.sleep(5000);
            System.out.println("---------------------");
            System.out.println(a);
        }
    }
}
