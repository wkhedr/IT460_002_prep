package com.wik4apps.it460_002_prep.data;

import java.util.HashMap;
import java.util.Map;

public class Books {
    static String[] Networks = {"Networks Book 1","Networks Book 2", "Networks Book 3"};
    static String[] Graphics = {"Graphics Book 1","Graphics Book 2", "Graphics Book 3"};
    static String[] Programming = {"Programming Book 1","Programming Book 2", "Programming Book 3"};
    public static Map<String, String[]> BooksTopics = new HashMap<String, String[]>();

    public Books() {
        BooksTopics.put("Networks", Networks);
        BooksTopics.put("Graphics", Graphics);
        BooksTopics.put("Programming", Programming);
    }


    public String[] BooksByTopic(String title){
        return BooksTopics.get(title);
    }


}
