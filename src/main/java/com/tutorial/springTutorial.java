package com.tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class springTutorial {
    public static void main(String[] args) {
    /*interace obj=new printName();
    obj.print();                        //to void changing the java code for printing the putput we use beans
    }
    */
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        interace obj = (interace) context.getBean("name");
        obj.print();

    }
}