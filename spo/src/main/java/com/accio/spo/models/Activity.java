package com.accio.spo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "activities")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Activity extends GlobalRecord{
    @Column(nullable = false,unique = true)
    private String activityId;
    private String comment;
    @ManyToOne
    private User user;
}
