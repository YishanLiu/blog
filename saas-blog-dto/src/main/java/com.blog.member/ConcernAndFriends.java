package com.blog.member;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

@ApiModel("用户关注粉丝表")
@Data
@Accessors(chain = true)
public class ConcernAndFriends {

    @ApiModelProperty(value = "账号guid")
    private String guid;

    @ApiModelProperty (value = "账号")
    private String account;

    @ApiModelProperty(value = "账号guid")
    private String accountGuid;

    //eg:["6685722712213553152","6685722712213553153","6685722712213553154","6685722712213553155"]
    @ApiModelProperty(value = "粉丝guid（逗号分隔）")
    private String fenSGuid;

    @ApiModelProperty(value = "")
    private String name;






}
