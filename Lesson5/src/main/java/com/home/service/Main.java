package com.home.service;

import com.home.model.Computer;

public class Main {
    public static void main(String[] args) {
        Computer c = new Computer("sda", "dsf", "fds");
        System.out.println(c);
        c.on();
        c.on();


    }
}
