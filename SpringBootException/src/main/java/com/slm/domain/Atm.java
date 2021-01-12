package com.slm.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data @AllArgsConstructor
public class Atm {
    @NotBlank(message="aname不能为空")
    private String aname;
    @NotBlank
    private String apassword;
    @NotNull
    private Float amoney;
}
