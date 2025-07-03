package com.AmericanAir;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Country {
    public static void main(String[] args) {
        
        String countyName="Afganistan";

        System.out.println(parseJsonResponse(countyName));
    }

    public static String parseJsonResponse(String county)
    {
        String capitallCity="";
        try{
            System.out.println("Hello");
            URL url=new URL("http://jsonmock.hackerrank.com/api/countries?name="+county);
            System.out.println("Hello 22");
            HttpURLConnection conn=(HttpURLConnection)url.openConnection();
            conn.setRequestMethod("GET");
            System.out.println("Hello 25");
            int responseCode=conn.getResponseCode();
            System.out.println("Hello 27");
            System.out.println(responseCode);
            if(responseCode==HttpURLConnection.HTTP_OK)
            {
                BufferedReader in=new BufferedReader(new InputStreamReader(conn.getInputStream()));
                StringBuilder response=new StringBuilder();
                String inputLine;
                while((inputLine=in.readLine()) !=null)
                {
                    System.out.println(inputLine);
                    response.append((inputLine));
                }
                in.close();
                String jsonRespone=response.toString();
                System.out.println("The JsonData is" +jsonRespone);
                 capitallCity=parseJsonResponse(jsonRespone);
                 System.out.println("The Capital city is" +capitallCity);

            }
            

        }
        
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return capitallCity;

       
    }
    
}
