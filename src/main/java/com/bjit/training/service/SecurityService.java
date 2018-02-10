package com.bjit.training.service;

public interface SecurityService {
    String findLoggedInEmail();
    void autologin(String email, String password);
}
