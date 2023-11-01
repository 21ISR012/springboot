package com.jpac1.jpac1;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String name;
  private String password;
  private String year;
  private String location;
  private String hotel;
  
}