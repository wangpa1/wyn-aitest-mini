package com.aitest.aitestmini.dto.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value="注册用户对象",description="用户对象user")
public class AddUserDto {
    @ApiModelProperty(value="用户名",required=true)
    private String userName;
    @ApiModelProperty(value="密码",required=true)
    private String password;
    @ApiModelProperty(value="邮箱",required=true)
    private String email;
}

