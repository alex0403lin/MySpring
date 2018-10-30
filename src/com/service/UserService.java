package com.service;

public class UserService {
    private String name;

    private BybService bybService;

    public BybService getBybService() {
        return bybService;
    }

    public void setBybService(BybService bybService) {
        this.bybService = bybService;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHello()
    {
        System.out.println("Hello " +name);
        bybService.setByb();
    }
}
