package com.wangs.utils.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public class HttpClientUtils {

	public static String get(String url){
		BufferedReader in = null;  
		StringBuffer sb=new StringBuffer();
        try {  
            // 定义HttpClient  
            HttpClient client = new DefaultHttpClient();  
            // 实例化HTTP方法  
            HttpGet request = new HttpGet();  
            request.setURI(new URI(url));  
            HttpResponse response = client.execute(request);  
  
            in = new BufferedReader(new InputStreamReader(response.getEntity()  
                    .getContent()));  
            
            String line = "";  
//            String NL = System.getProperty("line.separator");  
            while ((line = in.readLine()) != null) {  
                sb.append(line);
            }  
            in.close();  
        }catch(Exception e){
        	e.printStackTrace();
        } finally {  
            if (in != null) {  
                try {  
                    in.close();// 最后要关闭BufferedReader  
                } catch (Exception e) {  
                    e.printStackTrace();  
                }  
            }  
        }  
        return sb.toString();
	}
	
	public static void main(String []args){
		String url="http://restapi.amap.com/v3/place/text?keywords=%E4%B8%AD%E9%93%81%E9%80%B8%E9%83%BD%E5%9B%BD%E9%99%85&key=5c1e86e7ec4fdb59a2190da819cbb87c&city=370100";
		String data=get(url);
		System.out.println(data);
	}
}
