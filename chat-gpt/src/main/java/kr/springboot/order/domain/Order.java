package kr.springboot.order.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;

@AllArgsConstructor
@ToString
@Builder
@Getter
public class Order {

    private final OrderId id;
    private final Member member;
    private final Product product;
    private final Integer count;
    private final BigDecimal totalAmount;
    private final OrderStatus status;



}
