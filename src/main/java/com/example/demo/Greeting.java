package com.example.demo;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Greeting {
	@Setter
	@Getter
	private long id;

	@Setter
	@Getter
	private String content;
}
