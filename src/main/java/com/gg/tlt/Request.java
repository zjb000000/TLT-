package com.gg.tlt;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class Request {
    public static void sendGET(String url, String param) {
        String result = "";//访问返回结果
        BufferedReader read = null;//读取访问结果
        try {
            //创建url
            URL realurl = new URL(url + "/" + param);
            //打开连接
            URLConnection connection = realurl.openConnection();
            // 设置通用的请求属性
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            //建立连接
            connection.connect();
            read = new BufferedReader(new InputStreamReader(
                    connection.getInputStream(), "UTF-8"));
            String line;//循环读取
            while ((line = read.readLine()) != null) {
                result += line;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (read != null) {//关闭流
                try {
                    read.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println(result);
    }

    public static String sendPost(String urlPath, String param) throws IOException {
        String result = "";

        param = "param=" + URLEncoder.encode(param, "UTF-8");

        //建立连接
        URL url = new URL(urlPath);
        HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();

        //设置参数
        httpConn.setDoOutput(true);     //需要输出
        httpConn.setDoInput(true);      //需要输入
        httpConn.setUseCaches(false);   //不允许缓存
        httpConn.setRequestMethod("POST");      //设置POST方式连接

        //设置请求属性
        httpConn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        httpConn.setRequestProperty("Connection", "Keep-Alive");// 维持长连接
        httpConn.setRequestProperty("Charset", "UTF-8");

        //连接,也可以不用明文connect，使用下面的httpConn.getOutputStream()会自动connect
        httpConn.connect();

        //建立输入流，向指向的URL传入参数
        DataOutputStream dos = new DataOutputStream(httpConn.getOutputStream());
        dos.writeBytes(param);
        dos.flush();
        dos.close();

        //获得响应状态
        int resultCode = httpConn.getResponseCode();
        if (HttpURLConnection.HTTP_OK == resultCode) {
            StringBuffer sb = new StringBuffer();
            String readLine = new String();
            BufferedReader responseReader = new BufferedReader(new InputStreamReader(httpConn.getInputStream(), "UTF-8"));
            while ((readLine = responseReader.readLine()) != null) {
                sb.append(readLine).append("\n");
            }
            responseReader.close();
            result = sb.toString();
            System.out.println(sb.toString());
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        String result = Request.sendPost("http://"+"172.18.37.167:8080"+"/hadoop/getAcademicShow","111");
        System.out.println(result);
    }

}
