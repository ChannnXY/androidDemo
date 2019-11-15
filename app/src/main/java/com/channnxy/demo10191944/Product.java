package com.channnxy.demo10191944;

import java.util.ArrayList;

public class Product {
    public int image;
    public String title;
    public String desc;
    public String distance;
    public String current;
    public String discount;
    public String original;
    public String process;

    public Product(int image, String title, String desc,String distance,String current,String discount,String original,String process) {
        this.image = image;
        this.title = title;
        this.distance = distance;
        this.current = current;
        this.discount = discount;
        this.original = original;
        this.desc = desc;
        this.process = process;
    }

    private static int[] iconArray = {R.drawable.shuixing, R.drawable.jinxing, R.drawable.diqiu,
            R.drawable.huoxing, R.drawable.muxing, R.drawable.tuxing};
    private static String[] titleArray = {
            "我就喜欢3-4人餐",
            "【鸡肉|鲜果|蟹肉|蟹柳】招牌双人套餐",
            "20元零食优惠券礼包",
            "20元可莎蜜儿优惠券礼包",
            "【可乐】牛肉BBQ披萨套餐",
            "【可乐】牛肉BBQ披萨套餐"
    };
    private static String[] descArray = {
            "麦当劳（余杭嘻嘻欢乐城餐厅）",
            "鲜目录（杭州西湖店）",
            "零食（闲林中路店）",
            "可莎蜜儿（无常店）",
            "可莎蜜儿（无常店）",
            "可莎蜜儿（无常店）"
    };
    private static String[] distanceArray = {"2.5km", "1.4km", "2.2km", "200m", "2.6km", "500m"};
    private static String[] currentArray = {"118元", "19元", "86元", "8元", "29元", "18元"};
    private static String[] originalArray = {"119元", "29元", "99元", "12元", "31元", "22元"};
    private static String[] discountArray = {"5折", "8.5折", "5.5折", "8.9折", "3.7折", "5.6折"};
    private static String[] processArray = {"已经抢购10份", "已经抢购10份", "已经抢购10份", "已经抢购10份", "已经抢购10份", "已经抢购10份"};


    public static ArrayList<Product> getDefaultList() {
        ArrayList<Product> ProductList = new ArrayList<Product>();
        for (int i = 0; i < iconArray.length; i++) {
            ProductList.add(new Product(iconArray[i], titleArray[i], descArray[i],distanceArray[i],currentArray[i],discountArray[i],originalArray[i],processArray[i]));
        }
        for (int i = 0; i < iconArray.length; i++) {
            ProductList.add(new Product(iconArray[i], titleArray[i], descArray[i],distanceArray[i],currentArray[i],discountArray[i],originalArray[i],processArray[i]));
        }
        return ProductList;
    }
}
