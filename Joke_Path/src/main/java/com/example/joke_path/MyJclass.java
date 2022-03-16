package com.example.joke_path;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MyJclass {
    List<String> x = new ArrayList<>(Arrays.asList("sayHi","Que: What is the biggest lie in the entire universe?" +"\n"+"Ans: I have read and agree to the Terms & Conditions.", "Scene: A bookstore\n" +
            "\n" +
            "Customer: Can you help me find a book?\n" +
            "\n" +
            "Me: Of course. Do you know the author or title?\n" +
            "\n" +
            "Customer: Well, I was at the beach and I saw this girl reading a purple book. She looked like she was really enjoying it. I want that book.\n" +
            "\n" +
            "Me: Ma'am, you're going to have to be more specific. There are a lot of books with purple covers.\n" +
            "\n" +
            "Customer: Can't you search on your computer for purple books?\n" +
            "\n" +
            "Me: Unfortunately, no.\n" +
            "\n" +
            "Customer: In that case, I'll take my business to a bookstore that has better computers.\n" +
            "\n", "PATIENT: Doctor, I need your help. I’m addicted to checking my Twitter!"+"\n"+" DOCTOR:I’m so sorry,I don’tfollow."));

    public String retrieve() {
        Random random = new Random();
        int i = random.nextInt(x.size());
        return x.get(i);
    }
}
