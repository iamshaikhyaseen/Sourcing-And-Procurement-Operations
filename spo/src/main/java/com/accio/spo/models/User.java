package com.accio.spo.models;

import com.accio.spo.enums.UserStatus;
import com.accio.spo.enums.UserType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User extends GlobalRecord{

    @Column(nullable = false,unique = true)
    private String userId;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false, unique = true)
    private String email;
    private String phoneNo;
    @OneToOne
    private Address address;

    @Enumerated
    private UserType userType;
    @Enumerated
    private UserStatus userStatus;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    private LocalDate joiningDate;
    private LocalDateTime lastLoginDate;
    private Boolean emailVerified;
    private Boolean mfaEnabled;

}
