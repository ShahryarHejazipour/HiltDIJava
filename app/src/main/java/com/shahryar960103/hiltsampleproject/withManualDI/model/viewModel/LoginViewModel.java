package com.shahryar960103.hiltsampleproject.withManualDI.model.viewModel;

import com.shahryar960103.hiltsampleproject.withoutManualDI.model.UserRepository;

public class LoginViewModel {

    private final UserRepository userRepository;

    public LoginViewModel(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
