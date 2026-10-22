package com.accio.spo.jobs;

import com.accio.spo.constants.SystemConstant;
import com.accio.spo.models.Operation;
import com.accio.spo.repositories.OperationRepository;
import com.accio.spo.utilities.SystemUtility;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
@Slf4j
@Component
public class SystemJob {

    private final OperationRepository operationRepository;
    @Autowired
    public SystemJob(OperationRepository operationRepository){
        this.operationRepository=operationRepository;
    }

    public List<Operation> getAllSystemOperations(){
        return List.of(
                Operation.builder().id("OPR-01").operationName("SOURCE_STRATEGY_DEFINITION").operationCategory("SOURCING").build(),
                Operation.builder().id("OPR-02").operationName("CATEGORY_MANAGEMENT").operationCategory("SOURCING").build(),
                Operation.builder().id("OPR-03").operationName("SPEND_ANALYSIS").operationCategory("SOURCING").build(),
                Operation.builder().id("OPR-04").operationName("MARKET_RESEARCH").operationCategory("SOURCING").build(),
                Operation.builder().id("OPR-05").operationName("SOURCING_PIPELINE_MANAGEMENT").operationCategory("SOURCING").build(),
                Operation.builder().id("OPR-06").operationName("STRATEGIC_SOURCING").operationCategory("SOURCING").build(),
                Operation.builder().id("OPR-07").operationName("RFx_MANAGEMENT").operationCategory("SOURCING").build(),
                Operation.builder().id("OPR-08").operationName("BID_EVALUATION").operationCategory("SOURCING").build(),
                Operation.builder().id("OPR-09").operationName("COST_BENCHMARKING").operationCategory("SOURCING").build(),
                Operation.builder().id("OPR-10").operationName("SOURCING_PERFORMANCE_ANALYSIS").operationCategory("SOURCING").build(),

                Operation.builder().id("OPR-11").operationName("SUPPLIER_IDENTIFICATION").operationCategory("SUPPLIER_MANAGEMENT").build(),
                Operation.builder().id("OPR-12").operationName("SUPPLIER_ONBOARDING").operationCategory("SUPPLIER_MANAGEMENT").build(),
                Operation.builder().id("OPR-13").operationName("SUPPLIER_REGISTRATION").operationCategory("SUPPLIER_MANAGEMENT").build(),
                Operation.builder().id("OPR-14").operationName("SUPPLIER_QUALIFICATION").operationCategory("SUPPLIER_MANAGEMENT").build(),
                Operation.builder().id("OPR-15").operationName("SUPPLIER_PERFORMANCE_MONITORING").operationCategory("SUPPLIER_MANAGEMENT").build(),
                Operation.builder().id("OPR-16").operationName("SUPPLIER_RISK_ASSESSMENT").operationCategory("SUPPLIER_MANAGEMENT").build(),
                Operation.builder().id("OPR-17").operationName("SUPPLIER_RELATIONSHIP_MANAGEMENT").operationCategory("SUPPLIER_MANAGEMENT").build(),
                Operation.builder().id("OPR-18").operationName("SUPPLIER_AUDIT_MANAGEMENT").operationCategory("SUPPLIER_MANAGEMENT").build(),
                Operation.builder().id("OPR-19").operationName("SUPPLIER_COMPLIANCE_TRACKING").operationCategory("SUPPLIER_MANAGEMENT").build(),
                Operation.builder().id("OPR-20").operationName("SUPPLIER_SCORECARD_MANAGEMENT").operationCategory("SUPPLIER_MANAGEMENT").build(),

                Operation.builder().id("OPR-21").operationName("PURCHASE_REQUISITION_MANAGEMENT").operationCategory("PROCUREMENT").build(),
                Operation.builder().id("OPR-22").operationName("PURCHASE_ORDER_MANAGEMENT").operationCategory("PROCUREMENT").build(),
                Operation.builder().id("OPR-23").operationName("PURCHASE_ORDER_APPROVAL").operationCategory("PROCUREMENT").build(),
                Operation.builder().id("OPR-24").operationName("CONTRACT_MANAGEMENT").operationCategory("PROCUREMENT").build(),
                Operation.builder().id("OPR-25").operationName("PROCUREMENT_PLANNING").operationCategory("PROCUREMENT").build(),
                Operation.builder().id("OPR-26").operationName("INVOICE_PROCESSING").operationCategory("PROCUREMENT").build(),
                Operation.builder().id("OPR-27").operationName("GOODS_RECEIPT_MANAGEMENT").operationCategory("PROCUREMENT").build(),
                Operation.builder().id("OPR-28").operationName("THREE_WAY_MATCHING").operationCategory("PROCUREMENT").build(),
                Operation.builder().id("OPR-29").operationName("PROCUREMENT_BUDGET_CONTROL").operationCategory("PROCUREMENT").build(),
                Operation.builder().id("OPR-30").operationName("PROCUREMENT_SPEND_TRACKING").operationCategory("PROCUREMENT").build(),

                Operation.builder().id("OPR-31").operationName("INVENTORY_MONITORING").operationCategory("INVENTORY_MANAGEMENT").build(),
                Operation.builder().id("OPR-32").operationName("STOCK_LEVEL_OPTIMIZATION").operationCategory("INVENTORY_MANAGEMENT").build(),
                Operation.builder().id("OPR-33").operationName("DEMAND_FORECASTING").operationCategory("INVENTORY_MANAGEMENT").build(),
                Operation.builder().id("OPR-34").operationName("REORDER_POINT_MANAGEMENT").operationCategory("INVENTORY_MANAGEMENT").build(),
                Operation.builder().id("OPR-35").operationName("SAFETY_STOCK_MANAGEMENT").operationCategory("INVENTORY_MANAGEMENT").build(),
                Operation.builder().id("OPR-36").operationName("WAREHOUSE_COORDINATION").operationCategory("INVENTORY_MANAGEMENT").build(),
                Operation.builder().id("OPR-37").operationName("STOCK_RECONCILIATION").operationCategory("INVENTORY_MANAGEMENT").build(),
                Operation.builder().id("OPR-38").operationName("INVENTORY_VALUATION").operationCategory("INVENTORY_MANAGEMENT").build(),
                Operation.builder().id("OPR-39").operationName("EXCESS_STOCK_MANAGEMENT").operationCategory("INVENTORY_MANAGEMENT").build(),
                Operation.builder().id("OPR-40").operationName("INVENTORY_TURNOVER_ANALYSIS").operationCategory("INVENTORY_MANAGEMENT").build(),

                Operation.builder().id("OPR-41").operationName("PROCUREMENT_RISK_ASSESSMENT").operationCategory("RISK_AND_COMPLIANCE").build(),
                Operation.builder().id("OPR-42").operationName("REGULATORY_COMPLIANCE_MONITORING").operationCategory("RISK_AND_COMPLIANCE").build(),
                Operation.builder().id("OPR-43").operationName("CONTRACT_COMPLIANCE_AUDIT").operationCategory("RISK_AND_COMPLIANCE").build(),
                Operation.builder().id("OPR-44").operationName("FRAUD_DETECTION_MONITORING").operationCategory("RISK_AND_COMPLIANCE").build(),
                Operation.builder().id("OPR-45").operationName("SUPPLY_CHAIN_DISRUPTION_MONITORING").operationCategory("RISK_AND_COMPLIANCE").build(),
                Operation.builder().id("OPR-46").operationName("ETHICAL_SOURCING_COMPLIANCE").operationCategory("RISK_AND_COMPLIANCE").build(),
                Operation.builder().id("OPR-47").operationName("PROCUREMENT_POLICY_ENFORCEMENT").operationCategory("RISK_AND_COMPLIANCE").build(),
                Operation.builder().id("OPR-48").operationName("SUPPLIER_SANCTIONS_SCREENING").operationCategory("RISK_AND_COMPLIANCE").build(),
                Operation.builder().id("OPR-49").operationName("PROCUREMENT_AUDIT_MANAGEMENT").operationCategory("RISK_AND_COMPLIANCE").build(),
                Operation.builder().id("OPR-50").operationName("RISK_MITIGATION_PLANNING").operationCategory("RISK_AND_COMPLIANCE").build()
        );
    }

    @Scheduled(initialDelay = 1000, fixedDelay = 3000)
    public void loadAllOperations(){
        List<Operation> operations=getAllSystemOperations();
        for (Operation operation:operations){
            SystemUtility.setGlobalRecordProperties(operation, SystemConstant.APPLICATION_USER_NAME,SystemConstant.APPLICATION_USER_NAME, LocalDateTime.now(),LocalDateTime.now());
            Optional<Operation> optionalOperation=operationRepository.findByOperationName(operation.getOperationName());
            if (optionalOperation.isEmpty()){
                operationRepository.save(operation);
                log.info(String.format("Operation with name %s has been saved ",operation.getOperationName()));
            }else log.info(String.format("Operation with name %s already exists in table ",operation.getOperationName()));
        }
    }
}
