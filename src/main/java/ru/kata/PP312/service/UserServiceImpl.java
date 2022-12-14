package ru.kata.PP312.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kata.PP312.dao.UserDao;
import ru.kata.PP312.model.User;


import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao dao;

    @Autowired
    public UserServiceImpl(UserDao dao) {
        this.dao = dao;
    }
    @Override
    public List<User> getAllUsers() {
        return dao.getAllUsers();
    }

    @Override
    public User getUserById(int id) {
        return dao.getUserById(id);
    }

    @Override
    public void saveUser(User user) {
        dao.saveUser(user);
    }

    @Override
    public void updateUser(int id, User updatedUser) {
        dao.updateUser(id,updatedUser);
    }

    @Override
    public void deleteUser(int id) {
        dao.deleteUser(id);
    }
}