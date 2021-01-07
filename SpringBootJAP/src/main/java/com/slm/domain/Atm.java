package com.slm.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data @AllArgsConstructor @NoArgsConstructor
@Entity
public class Atm {
    @Id
    private String aname;
    @Column
    private String apassword;
    @Column
    private Float amoney;
}
