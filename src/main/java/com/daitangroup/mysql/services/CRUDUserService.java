package com.daitangroup.mysql.services;

import com.daitangroup.mysql.entities.User;

public interface CRUDUserService {
    User addUser(User user);

    User updateUser(User user);

    void deleteUser(User user);

    User getUser(String id);

    User getUserByName(String name);
}
