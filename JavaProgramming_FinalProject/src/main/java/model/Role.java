package model;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Alexandr Abashkin on 3/22/2016.
 */
public class Role {
    private int id;
    private String roleName;
    private Set<User> users = new HashSet<>();

    public Role() {
    }

    public Role(String roleName) {
        setRoleName(roleName);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public boolean addUser(User user){
        return users.add(user);
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                '}';
    }
}
