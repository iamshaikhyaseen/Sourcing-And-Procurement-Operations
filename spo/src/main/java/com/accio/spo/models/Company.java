package com.accio.spo.models;

import com.accio.spo.enums.CompanyStatus;
import com.accio.spo.enums.CompanyType;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Table(name = "companies")
public class Company extends GlobalRecord{
    private String companyId;
    private String legalName;
    private String displayName;
    private String taxId;
    private String taxRegNumber;
    private String govtRegNumber;
    private String primaryContactNumber;
    private String contactName;
    private String contactEmail;
    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String city;
    private String country;
    @Enumerated
    private CompanyType companyType;
    @Enumerated
    private CompanyStatus companyStatus;
}
