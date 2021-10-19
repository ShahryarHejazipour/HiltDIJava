package com.shahryar960103.hiltsampleproject.withoutManualDI.viewModel;


import com.shahryar960103.hiltsampleproject.withManualDI.model.model.UserRepository;

public class LoginViewModel {

    private final UserRepository userRepository;

    public LoginViewModel(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
