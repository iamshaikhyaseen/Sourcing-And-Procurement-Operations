package com.accio.spo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "address")
public class Address extends GlobalRecord{
    @Column(nullable = false)
    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    @Column(nullable = false)
    private String city;
    @Column(nullable = false)
    private String country;
}
