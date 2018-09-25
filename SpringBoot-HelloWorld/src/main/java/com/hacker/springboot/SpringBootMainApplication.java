package com.hacker.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Hacker
 * @date：2018/9/25
 * @project SpringBootTest
 * @describe
 */
@SpringBootApplication
public class SpringBootMainApplication {

    public static void main(String[] args) {

        /**
         *  写完了 Controller 的业务逻辑后，直接运行这个类即可，然后通过浏览器访问：http://localhost:8080/hello
         *  注意：启动这个程序后，可以在控制太看到他是在 8080 端口启动的 -- 以前的配置不再需要了
         *
         *  部署：更加的简单，以前需要达成war包，然后放到tomcat上启动，现在不需要了，可以直接打成jar包
         *        然后直接通过  java -jar xxx.jar 就可以了
         *  注意：要想达成jar包，需要在pom文件中导入 spring-boot-maven-plugin 的依赖
         *        mvn clean package  -- 可以看到在 target 下有一个jar包
         *
         */
        SpringApplication.run(SpringBootMainApplication.class, args);
    }
}
