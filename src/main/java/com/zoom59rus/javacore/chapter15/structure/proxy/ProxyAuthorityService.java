package com.zoom59rus.javacore.chapter15.structure.proxy;

public class ProxyAuthorityService implements AuthorityService {
    private AuthorityService authorityService;

    public ProxyAuthorityService() {
        this.authorityService = AuthorityServiceImpl.getInstance();
    }

    public boolean check(String name, String password) {
        if(name.matches("[A-z]+") && password.matches("[A-z]+")){
            return true;
        }
        return false;
    }

    @Override
    public void login(String name, String password) {
        if(check(name, password)){
            authorityService.login(name, password);
        }else System.out.println("Аутентификация не пройдена, попробуйте еще раз.");
    }
}
