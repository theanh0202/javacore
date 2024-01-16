package com.vti.backend.service;

public interface IAccountService {
    void createAccount(String username, String email, String password);

    void updateAccount(int id, String oldPassWord, String newPassWord);

    void deleteAccount(int id);

    boolean login(String email, String password);
}
