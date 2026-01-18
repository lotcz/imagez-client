package eu.zavadil.java.imagez.client;

import lombok.Data;

@Data
public class ImageHealthPayload {

	private String name;
	
	private int size;

	private int width;

	private int height;

	private String mime;
}
