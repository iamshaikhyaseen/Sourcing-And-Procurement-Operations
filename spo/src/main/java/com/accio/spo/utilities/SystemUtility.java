package com.accio.spo.utilities;

import com.accio.spo.models.Operation;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class SystemUtility {

    public static void setGlobalRecordProperties(Operation operation,
                                          String createdBy,
                                          String updatedBy,
                                          LocalDateTime createdAt,
                                          LocalDateTime updatedAt){
        operation.setCreatedBy(createdBy);
        operation.setUpdatedBy(updatedBy);
        operation.setCreatedAt(createdAt);
        operation.setUpdatedAt(updatedAt);
    }

}
