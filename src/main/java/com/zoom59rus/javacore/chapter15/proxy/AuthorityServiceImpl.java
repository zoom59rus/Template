package com.zoom59rus.javacore.chapter15.proxy;

public class AuthorityServiceImpl implements AuthorityService {
    private static AuthorityServiceImpl authorityService = null;

    private AuthorityServiceImpl(){}

    public static synchronized AuthorityServiceImpl getInstance(){
        if(authorityService == null){
            authorityService = new AuthorityServiceImpl();
        }
        return authorityService;
    }

    @Override
    public void login(String name, String password) {

        System.out.println("Авторизация выполненна");
    }
}
