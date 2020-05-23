package com.codebubby.common.web;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class Result<T> {

    private String code;

    private T result;

}
