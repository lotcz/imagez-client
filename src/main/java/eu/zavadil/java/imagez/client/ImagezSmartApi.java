package eu.zavadil.java.imagez.client;

import java.net.URL;

public interface ImagezSmartApi {

	ImageHealthPayload getHealth(String name);

	ImageHealthPayload upload(String fileName, byte[] fileBytes);

	ImageHealthPayload uploadFromUrl(String url);

	void deleteOriginal(String name);

	URL getImageUrlOriginal(String name);

	URL getImageUrlResized(String name, ResizeRequest resizeRequest);

	URL getRemovedBackgroundUrl(String name, String hex, Integer threshold);

	ColorHexPayload guessBackgroundColor(String name);
}
