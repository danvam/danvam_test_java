package com.danvam.capitole.testjava.domain.entity;

import com.danvam.capitole.testjava.domain.vo.Currency;

import java.time.LocalDateTime;

public record Prices(Long brandId
		, LocalDateTime  startDate
		, LocalDateTime endDate
		, Long priceList
		, Long productId
		, Integer priority
		, Double price
		, Currency curr) {


}
