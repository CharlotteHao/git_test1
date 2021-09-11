package com.hao.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitApplication {
    public static void main(String[] args) {
        System.out.println("git2");
        System.out.println("git3");
        System.out.println("git4");
        System.out.println("git5");
        SpringApplication.run(GitApplication.class,args);
    }
}
