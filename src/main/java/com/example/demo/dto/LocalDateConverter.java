/*package com.example.demo.dto;

import static org.hamcrest.CoreMatchers.instanceOf;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.stereotype.Component;

@Component
public class LocalDateConverter implements HttpMessageConverter<LocalDate>{

	@Override
	public boolean canRead(Class<?> clazz, MediaType mediaType) {
		return true;
	}

	@Override
	public boolean canWrite(Class<?> clazz, MediaType mediaType) {
		return true;
	}

	@Override
	public List<MediaType> getSupportedMediaTypes() {
		return Arrays.asList(MediaType.APPLICATION_JSON);
	}

	@Override
	public LocalDate read(Class<? extends LocalDate> clazz, HttpInputMessage inputMessage)
			throws IOException, HttpMessageNotReadableException {
		return LocalDate.parse(inputMessage.getBody().toString());
	}

	@Override
	public void write(LocalDate t, MediaType contentType, HttpOutputMessage outputMessage)
			throws IOException, HttpMessageNotWritableException {
		outputMessage.getBody().write(t.toString().getBytes());
	}
}
*/