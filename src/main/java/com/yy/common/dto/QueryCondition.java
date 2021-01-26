package com.yy.common.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/*
 *@Description: 通用查询的condition
 *@ClassAuthor: tengYong
 *@Date: 2021-01-26 13:46:44
*/
@Getter
@Setter
public class QueryCondition {
    @ApiModelProperty(value="第几页，默认值为1")
	private Integer pageNum = 1;
	@ApiModelProperty(value="每页显示几条数据，默认值为0")
	private Integer pageSize = 5;
}