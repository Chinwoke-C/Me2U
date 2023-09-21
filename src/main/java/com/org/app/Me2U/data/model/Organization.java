package com.org.app.Me2U.data.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="organization")
public class Organization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "organization")
    private List<User> users;

    @OneToMany(mappedBy = "organization")
    private List<OrganizationInvites> invites;
}
