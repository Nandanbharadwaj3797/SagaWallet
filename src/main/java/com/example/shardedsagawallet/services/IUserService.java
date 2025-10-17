package com.example.shardedsagawallet.services;

import com.example.shardedsagawallet.entities.User;
import java.util.List;

public interface IUserService {

    User createUser(User user);

    User getUserById(Long id);

    List<User> getUsersByName(String name);
}
