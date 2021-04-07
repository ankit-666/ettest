package com.example.ettest.entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Getter
@Setter
@ToString(doNotUseGetters = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "DOCUMENT")
public class Document {

  @Id
  @GeneratedValue
  private Long id;

  @Column(name = "UNSIGNED_PATH")
  private String unsignedPath;

  @Column(name = "SIGNED_PATH")
  private String signedPath;

  @Column(name = "TITLE")
  private String title;

  @Column(name = "DESCRIPTION")
  private String description;

  @Column(name ="UPLOADED_BY")
  private String uploadedBy;

  @Column(name = "UPLOADED_ON")
  private Timestamp uploadedOn;

  @Column(name = "TO_BE_SIGNED_BY")
  private String toBeSignedBy;

  @Column(name = "IS_SIGNED")
  private boolean isSigned;

  @Column(name = "SIGNED_ON")
  private Timestamp signedOn;

  @Column(name = "CONFLICT_ID")
  private Long conflictId;

  @Column(name = "STATUS")
  private String status;
}
