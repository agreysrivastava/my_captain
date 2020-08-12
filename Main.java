package com.company;
import java.io.*;
public class Main {
    public static void Sopln(Object o){System.out.println(o);}
    public static void main(String[] args) {
        try {
            File file = new File("myjson.txt");
            File out = new File("output.txt");
            FileWriter fw = new FileWriter(out,true);
            if (!file.exists())
                file.createNewFile();
            BufferedReader br = new BufferedReader(new FileReader(file));
            String str;int i=0;
            while ((str = br.readLine())!=null&&i<5000){
                String[] myArr = str.split("\t");
                //Sopln(myArr[0]+" "+myArr[1]+" "+myArr[2]+" "+myArr[3]+" " +myArr[4]+""+myArr[9]);
               Sopln("\""+myArr[2].trim()+"\":[" +
                        "{" +
                        "\"column\":" +"\"Country\","+
                        "\"value\":\"" +myArr[0].trim()+
                        "\"},"+
                       "{" +
                       "\"column\":" +"\"State\","+
                       "\"value\":\"" +myArr[1].trim()+
                       "\"},"+
                       "{" +
                       "\"column\":" +"\"STD Code\","+
                       "\"value\":\"" +myArr[4].trim()+
                       "\"},"+
                        "{" +
                        "\"column\":" +"\"Status\","+
                        "\"value\":\"" +myArr[9].trim()+
                        "\"}"+
                        "],");
               fw.write("\n\""+myArr[2].trim()+"\":[" +
                       "{" +
                       "\"column\":" +"\"Country\","+
                       "\"value\":\"" +myArr[0].trim()+
                       "\"},"+
                       "{" +
                       "\"column\":" +"\"State\","+
                       "\"value\":\"" +myArr[1].trim()+
                       "\"},"+
                       "{" +
                       "\"column\":" +"\"STD Code\","+
                       "\"value\":\"" +myArr[4].trim()+
                       "\"},"+
                       "{" +
                       "\"column\":" +"\"Status\","+
                       "\"value\":\"" +myArr[9].trim()+
                       "\"}"+
                       "],");
            }
        }
        catch (Exception e){
            Sopln(e.getMessage());
        }
    }
}
