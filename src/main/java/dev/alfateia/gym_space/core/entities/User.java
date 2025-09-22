package dev.alfateia.gym_space.core.entities;

import dev.alfateia.gym_space.core.enums.Gender;
import dev.alfateia.gym_space.core.enums.Role;

public abstract class User {
    protected Long id;
    protected String name;
    protected String email;
    protected String password;
    protected Gender gender;
    protected Role role;

    protected User(Long id, String name, String email, String password,
                   Gender gender, Role role) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.role = role;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }
    public Gender getGender() { return gender; }
    public Role getRole() { return role; }
}
