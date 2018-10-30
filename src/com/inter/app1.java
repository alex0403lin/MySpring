package com.inter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app1 {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("com/inter/beans.xml");
        ChangeLetter changeLetter = (ChangeLetter) ac.getBean("changeLetter");
        System.out.println(changeLetter.change());
    }
}
