package com.vn.angulardemoproject.models;


import lombok.*;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


@Entity
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Users {

    @Id
    @Column(name = "user_id")
    private Long id;

    @Column
    @NotNull(message="{NotNull.User.firstName}")
    private String firstName;

    @Column
    @NotNull(message="{NotNull.User.lastName}")
    private String lastName;

    @Column
    @NotNull(message = "{NotNull.User.email}")
    private String email;


}
