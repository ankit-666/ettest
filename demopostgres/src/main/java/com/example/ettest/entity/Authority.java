package com.example.ettest.entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@ToString(doNotUseGetters = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "AUTHORITY")
public class Authority {

  @Id
  private String id;

  @Column(name = "FIRST_NAME")
  private String firstName;

  @Column(name = "LAST_NAME")
  private String lastName;

  @Column(name = "UNIVERSITY")
  private String university;

  @Column(name = "EMAIL_ID")
  private String emailId;

  @Column(name = "DESIGNATION")
  private String designation;

  @Column(name = "ROLE")
  private String role;
}
