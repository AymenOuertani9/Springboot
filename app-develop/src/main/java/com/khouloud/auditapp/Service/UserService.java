package com.khouloud.auditapp.Service;

import com.khouloud.auditapp.Entity.Role;
import com.khouloud.auditapp.Entity.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;

public interface UserService {
    User saveUser(User clientapp);

     public  void addRoleToClient(String username, String roleName);
    public UserDetails loadUserByUsername(String username);
    User findByUsername(String username);
    List<User> getAll();
    public Role save(Role role);

	User findById(long id);
}
