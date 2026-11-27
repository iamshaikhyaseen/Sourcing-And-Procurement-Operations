package com.accio.spo.models;

import com.accio.spo.enums.CompanyStatus;
import com.accio.spo.enums.CompanyType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "companies")
public class Company extends GlobalRecord{
    @Column(nullable = false,unique = true)
    private String companyId;
    private String legalName;
    private String displayName;
    private String mainLogoUrl;
    private String taxId;
    private String taxRegNumber;
    private String govtRegNumber;

    private String primaryContactNumber;
    private String contactName;
    private String contactEmail;
    @OneToOne
    private Address address;
    @Enumerated
    private CompanyType companyType;
    @Enumerated
    private CompanyStatus companyStatus;
    @OneToMany
    private List<Activity> activities;
    @OneToMany
    private List<Attachment> attachments;
}
