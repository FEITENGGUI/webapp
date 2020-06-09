package com.example.demo;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestTianchi {
    public static void main(String[] args){
        try {
            FileOutputStream outputStream=new FileOutputStream("result.json");
            FileReader fileReader=new FileReader("/tcdata/num_list.csv");
            BufferedReader inputStream=new BufferedReader(fileReader);
//            List<String> list = inputStream.lines().collect(Collectors.toList());
            List<Integer> list = inputStream.lines()
                    .map(
                            s -> Integer.parseInt(s)
                    )
                    .collect(Collectors.toList());
            list.sort(Comparator.comparing(Integer::intValue).reversed());
            System.out.println(list);
//            outputStream.write("{\n\t\"Q1\"\n}".getBytes());
            outputStream.write("{\n".getBytes());
            outputStream.write("\t\"Q1\":\"Hello world\",\n".getBytes());
            outputStream.write(("\t\"Q2\":"+",\n").getBytes());
            outputStream.write(("\t\"Q3\":"+"\n").getBytes());
            outputStream.write("}".getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
