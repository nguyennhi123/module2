package com.codegym.dao;

import com.codegym.model.Login;
import com.codegym.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
private static List<User>users;
static
{
    users = new ArrayList<>();
    User u1 = new User("nam","nam123","12345","nam@gmail.com",18);
    users.add(u1);
    User u2 = new User("Lan","lan123","12345","lan@gmail.com",19);
    users.add(u2);
}
public static User checkLogin(Login login){
    for (User u:users){
      if (u.getAccount().equals(login.getAccount())
      && u.getPassworld().equals(login.getPassworld())){
          return u;
      }
    }return null;
}
}
