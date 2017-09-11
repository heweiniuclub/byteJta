package com.xa.order.dao;

import org.apache.ibatis.annotations.Param;

public interface OrderMapper {
	int updateState(@Param("id") Long orderId, @Param("state")Integer state);
}
