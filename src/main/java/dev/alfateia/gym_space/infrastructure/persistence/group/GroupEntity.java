package dev.alfateia.gym_space.infrastructure.persistence.group;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "group")
public class GroupEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @ElementCollection
    private List<Long> clientsId;

    public GroupEntity() {
    }

    public GroupEntity(Long id, String name, List<Long> clientsId) {
        this.id = id;
        this.name = name;
        this.clientsId = clientsId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Long> getClientsId() {
        return clientsId;
    }

    public void setClientsId(List<Long> clientsId) {
        this.clientsId = clientsId;
    }
}
