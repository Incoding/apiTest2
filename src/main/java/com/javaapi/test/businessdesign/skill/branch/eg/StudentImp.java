package com.javaapi.test.businessdesign.skill.branch.eg;

public class StudentImp implements PeopleI {

    @Override
    public String getName() {
        String name = "student";
        System.out.println(name);
        return name;
    }
}
