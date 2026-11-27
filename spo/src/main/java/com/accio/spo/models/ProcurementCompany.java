package com.accio.spo.models;

import com.accio.spo.enums.Currency;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "procurement_companies")
public class ProcurementCompany extends Company{
    @Column(nullable = false,unique = true)
    private String procurementCompanyId;
    // Proc org details
    private String procurementHead;
    private String procurementEmail;
    private String procurementPhone;

    // Financial Controls
    @Enumerated
    private Currency baseCurrency;
    private BigDecimal annualProcurementBudget;
    private BigDecimal  availableBudget;

    // Approval config
    private Boolean approvalRequired;
    private Integer approvalLevels;

    // Purchasing controls
    private BigDecimal autoApprovalThreshold;
    private BigDecimal rfqApprovalThreshold;
    private BigDecimal rfpApprovalThreshold;

    // Procurement policies
    private Boolean contractRequired;

    // ERP Integration
    private String erpSystem;
    private String erpCompanyCode;
    private String costCenterPrefix;

    // Procurement metrics
    private Integer activeSuppliers;
    private Integer activeContracts;
    private Integer activePurchaseRequests;
    private Integer activePurchaseOrders;

    // Compliance
    private Boolean complianceReviewRequired;
    private Boolean legalReviewRequired;

    //Dates
    private LocalDate goLiveDate;
    private LocalDate lastAuditDate;

    private String remarks;

}
