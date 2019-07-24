package com.example.demo;

import com.example.demo.TTmodel;
import com.example.demo.Tmodel;
import com.example.demo.TranseModel;
import com.gexin.fastjson.JSON;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TranseUtil {

   public static void main(String[] args) throws IOException {
       String result=null;
//       File file=new File("C:\\Users\\www\\Desktop/json(1).txt");
       BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\www\\Desktop/json(1).txt"),"gb2312"));
       StringBuffer stringBuffer=new StringBuffer();
       while ((result=br.readLine())!=null){
           stringBuffer.append(result);
       }
       List<Tmodel> tmodelList=new ArrayList<>();
       List<TranseModel> list=JSON.parseArray(JSON.parseObject(stringBuffer.toString()).get("a").toString(),TranseModel.class);
       for(TranseModel tm:list){
           tmodelList.addAll(JSON.parseArray(tm.getChildren().toString(),Tmodel.class));
       }

       BufferedReader br2=new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\www\\Desktop/json(2).txt"),"gb2312"));
       stringBuffer=new StringBuffer();
       while ((result=br2.readLine())!=null){
           stringBuffer.append(result);
       }
       List<TTmodel> tTmodels=new ArrayList<>();
       List<TranseModel> list2=JSON.parseArray(JSON.parseObject(stringBuffer.toString()).get("areaList1").toString(),TranseModel.class);
       for(TranseModel tm:list2){
           tTmodels.addAll(JSON.parseArray(tm.getChildren().toString(),TTmodel.class));
       }
       System.out.println(tTmodels.size());
   }
}
