package com.blog.member;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

@ApiModel("账号表")
@Data
@Accessors(chain = true)
public class Account {

    @ApiModelProperty(value = "账号guid")
    private String guid;





}
