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

public class Conflict {

  @Id
  @GeneratedValue
  private Long id;

  @Column(name = "DOCUMENT_ID")
  private Long documentId;

  @Column(name = "USER_ID")
  private String userId;

  @Column(name = "SIGNEE_ID")
  private String signeeId;

  @Column(name = "ISSUE")
  private String issue;

  @Column(name = "ISSUED_ON")
  private Timestamp issuedOn;

  @Column(name = "IS_RESOLVED")
  private boolean isResolved;

}
