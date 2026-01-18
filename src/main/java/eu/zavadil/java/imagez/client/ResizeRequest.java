package eu.zavadil.java.imagez.client;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResizeRequest {

	private ResizeType type;

	private int width;

	private int height;

	private String ext;

	private VerticalAlign verticalAlign;

	private HorizontalAlign horizontalAlign;
}
