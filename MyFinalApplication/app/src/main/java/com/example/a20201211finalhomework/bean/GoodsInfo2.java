package com.example.a20201211finalhomework.bean;

import com.example.a20201211finalhomework.R;

import java.util.ArrayList;

public class GoodsInfo2 {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo2() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个商品的名称数组
    private static String[] mNameArray = {
            "星巴克中杯", "星巴克大杯", "星巴克超大杯",
            "星巴克中杯", "星巴克大杯", "星巴克超大杯",
            "星巴克中杯", "星巴克大杯"

    };
    // 声明一个商品的描述数组
    private static String[] mDescArray = {
            "星巴克中杯香草风味星冰乐",
            "星巴克大杯抹茶星冰乐",
            "星巴克超大杯摩卡星冰乐",
            "星巴克中杯芒果西番莲果茶星冰乐",
            "星巴克大杯冷萃冰咖啡",
            "星巴克超大杯阿馥奇朵",
            "星巴克中杯香甜奶油冷萃冰咖啡",
            "星巴克大杯红茶拿铁"
    };
    // 声明一个商品的价格数组
    private static float[] mPriceArray = {32, 35, 38, 32, 35, 38, 32, 35};
    // 声明一个商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.xiangcao_middle_s, R.drawable.mocha_large_s, R.drawable.moka_superlarge_s,
            R.drawable.mangotea_middle_s, R.drawable.coldbrew_large_s, R.drawable.affogato_superlarge_s,
            R.drawable.creamcold_middle_s,R.drawable.blacktealatte_large_s
    };
    // 声明一个商品的大图数组
    private static int[] mPicArray = {
            R.drawable.xiangcao_middle, R.drawable.mocha_large, R.drawable.moka_superlarge,
            R.drawable.mangotea_middle, R.drawable.coldbrew_large, R.drawable.affogato_superlarge,
            R.drawable.creamcold_middle,R.drawable.blacktealatte_large
    };
    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo2> getDefaultList() {
        ArrayList<GoodsInfo2> goodsList = new ArrayList<GoodsInfo2>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo2 info = new GoodsInfo2();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}