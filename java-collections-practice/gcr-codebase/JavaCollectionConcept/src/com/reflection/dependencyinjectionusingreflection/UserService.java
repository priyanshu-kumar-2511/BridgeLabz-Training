package com.reflection.dependencyinjectionusingreflection;

public class UserService {

    @Inject
    private UserRepository userRepository;

    public void process() {
        userRepository.save();
    }
}
