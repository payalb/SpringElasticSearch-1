package com.example.demo.dto;

import java.time.LocalDate;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class LocalDateStringConverter implements Converter<String, LocalDate> {

	@Override
	public LocalDate convert(String source) {
		return LocalDate.parse(source);
	}


}
