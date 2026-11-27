package com.accio.spo.models;

import com.accio.spo.enums.EmploymentType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employee")
public class Employee extends User{

    @Column(nullable = false,unique = true)
    private String employeeId;

    private String designation;
    private String department;
    private String costCenter;
    private String businessUnit;

    @Enumerated
    private EmploymentType employmentType;

    @ManyToOne
    private Employee manager;

    private BigDecimal approvalLimit;
    private Boolean approvesProcurement;
    private Boolean approvesFinance;
}
