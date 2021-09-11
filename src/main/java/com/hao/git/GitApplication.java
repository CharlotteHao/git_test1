package com.hao.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitApplication {
    public static void main(String[] args) {
        System.out.println("git2");
        System.out.println("git3");
        System.out.println("master");
        System.out.println("git4");
        System.out.println("git5");
        System.out.println("git6");
        System.out.println("push test");
        System.out.println("pull test");
        System.out.println("github里更新，码云里同步");
        SpringApplication.run(GitApplication.class,args);
    }
}
