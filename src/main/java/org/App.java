package org;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        Gson gson = new Gson();

        List<Company> list = new ArrayList<>();
                list = gson.fromJson(new FileReader
                (new File("CompaniesData.json")),new TypeToken<List<Company>>(){}.getType());


        DateTimeFormatter.ofPattern("[yyyy-MM-dd]|[yyyy.MM-dd]");
        list.stream().filter((s)->s.id==1).forEach(s-> System.out.println(s.type));
    }
}
