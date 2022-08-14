package jpabook.jpashop.controller;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;


@Getter @Setter
public class MemberForm {

    @NotBlank(message = "이름은 필수입력 값 입니다.")
    private String name;

    private String city;
    private String street;
    private String zipcode;
}
