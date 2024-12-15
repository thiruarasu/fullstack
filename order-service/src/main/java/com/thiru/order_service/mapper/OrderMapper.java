package com.thiru.order_service.mapper;

import org.mapstruct.factory.Mappers;

import com.thiru.order_service.dto.OrderDTO;
import com.thiru.order_service.model.Order;

public interface OrderMapper {

	OrderMapper INSTANCE=Mappers.getMapper(OrderMapper.class);
	Order mapOrderDTOToOrder(OrderDTO orderDTO);
    OrderDTO mapOrderToOrderDTO(Order order);
}
