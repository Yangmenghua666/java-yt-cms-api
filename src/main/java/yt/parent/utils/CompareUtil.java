package yt.parent.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * txt数据对比
 * @author yuanfei0241@hsyuntai.com
 * @version V1.0.0
 * @title CompareUtil
 * @date 2019/12/16
 */
public class CompareUtil {

    public static void main(String args[]) throws IOException {
        compare("C:\\Users\\ytyuanf\\Desktop\\MEDTRADENO.txt",
                "C:\\Users\\ytyuanf\\Desktop\\medTradeNoshitu.txt");
    }

    /**
     * 读入TXT文件
     */
    public static void compare(String pathname,String pathname2) throws IOException {
        List<String> dataList = new ArrayList<>();
        List<String> dataList2 = new ArrayList<>();
        FileReader reader = new FileReader(pathname);
        BufferedReader br = new BufferedReader(reader);
        FileReader reader2 = new FileReader(pathname2);
        BufferedReader br2 = new BufferedReader(reader2);
        String line;
        while ((line = br.readLine()) != null) {
            dataList.add(line);
        }
        while ((line = br2.readLine()) != null) {
            dataList2.add(line);
        }
        //对比
        Map<String,Integer> map = new HashMap<>();
        for(String item : dataList) {
            if(map.containsKey(item)){
                System.out.println(item);
            }else{
                map.put(item,1);
            }
            if(!dataList2.contains(item)){
                System.out.println("无效:" + item);
            }
        }
    }

}


