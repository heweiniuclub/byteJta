package com.xa.order.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xa.order.dao.OrderMapper;
import com.xa.order.service.OrderFacede;

@Service("orderFacede")
public class OrderFacedeImpl implements OrderFacede {
	@Resource
	private OrderMapper orderMapper;
	
	@Transactional(rollbackFor=Exception.class)
	public int updateState(Long orderId, Integer state) {
		return orderMapper.updateState(orderId, state);
	}
}
