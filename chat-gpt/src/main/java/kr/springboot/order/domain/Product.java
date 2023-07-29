package kr.springboot.order.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Builder
@Getter
public class Product {

    private final ProductId number;
    private final String name;
    private final Integer price;

}
