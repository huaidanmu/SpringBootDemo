package com.slm.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class Atm {
    private String aname;
    private String apassword;
    private Float amoney;

}
