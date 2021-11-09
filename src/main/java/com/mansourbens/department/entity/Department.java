package com.mansourbens.department.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "DEPARTMENT")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long departmentId;
    @Column(name = "name")
    private String departmentName;
    @Column(name = "address")
    private String departmentAddress;
    @Column(name = "code")
    private String departmentCode;
}
