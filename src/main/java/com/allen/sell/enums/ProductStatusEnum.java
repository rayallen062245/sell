package com.allen.sell.enums;

import lombok.Getter;

@Getter
public enum ProductStatusEnum {

    UP(1, "上架"),
    DOWN(2, "下架");

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {

        this.code = code;
        this.message = message;
    }
}
