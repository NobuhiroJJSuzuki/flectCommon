package jp.co.flect.json;

import java.io.IOException;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonImplByJackson implements JsonImpl {
	
	public <T> T fromJson(String json, Class<T> clazz) throws JsonException {
		try {
			return new ObjectMapper().readValue(json, clazz);
		} catch (IOException e) {
			throw new JsonException(e);
		}
	}
}
