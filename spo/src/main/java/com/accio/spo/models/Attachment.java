package com.accio.spo.models;

import com.accio.spo.enums.AttachmentType;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "attachments")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Attachment extends GlobalRecord{

    private String attachmentUrl;
    @Enumerated
    private AttachmentType attachmentType;
    private String attachmentDescription;
    private String fileOriginalName;
    private String fileSystemName;
}
