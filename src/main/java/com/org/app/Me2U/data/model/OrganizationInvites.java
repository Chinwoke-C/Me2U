package com.org.app.Me2U.data.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="organization_invites")
public class OrganizationInvites {
    @Id
    private Long id;

    private String email;

    private String token;

    private LocalDateTime TTL;
    @ManyToOne
    @JoinColumn(name = "org_id")
    private Organization organization;


}
