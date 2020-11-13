package com.example.shoppingcart.bean;

import com.example.shoppingcart.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
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

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "团子", "捞饭", "拌面", "拉面", "奶茶", "蛋黄酥","多肉","垫子"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "沈大成 双酿团",
            "蟹黄风味捞饭",
            "咸蛋黄拌面",
            "拉面炒年糕",
            "原味奶茶",
            "轩妈蛋黄酥",
            "优质多肉",
            "加绒坐垫"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {6888, 3999, 2999, 2899, 2698, 2098};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.tz_s, R.drawable.lf_s, R.drawable.bm_s,
            R.drawable.lm_s, R.drawable.nc_s, R.drawable.dhs_s,
            R.drawable.dr_s,R.drawable.pd_s
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.tz, R.drawable.lf, R.drawable.bm,
            R.drawable.lm, R.drawable.nc, R.drawable.dhs,
            R.drawable.dr,R.drawable.pd
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
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
