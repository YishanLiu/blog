package com.blog.member;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@ApiModel("用户表")
public class User {

    @ApiModelProperty(value = "用户guid")
    private String guid;

    @ApiModelProperty(value = "用户名")
    private String userName;

    @ApiModelProperty(value = "昵称")
    private String nickName;

    @ApiModelProperty(value = "性别")
    private Integer sex;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "电话")
    private String telPhone;

    @ApiModelProperty(value = "账号")
    private String account;

    @ApiModelProperty(value = "第三方平台类型（0：淘宝；1：QQ；2：360）")
    private Integer thridCode;

    @ApiModelProperty(value = "第三方关联账号")
    private String thridAccount;

    @ApiModelProperty(value = "详细地址")
    private String address;

    @ApiModelProperty(value = "省")
    private Integer province;

    @ApiModelProperty(value = "市")
    private Integer city;

    @ApiModelProperty(value = "区")
    private Integer area;

}
