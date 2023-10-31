package com;

import com.fasterxml.jackson.core.type.TypeReference;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.List;
import path.to.JsonDataService;

public class ObjectMapper {
    
}
@Service
public class JsonDataService {

    private final ObjectMapper objectMapper = new ObjectMapper();
    private final String jsonFilePath = "data.json"; // Adjust the file path as needed.

    public List<Product> getAllProducts() {
        try {
            return objectMapper.readValue(new File(jsonFilePath), new TypeReference<List<Product>>() {});
        } catch (IOException e) {
            // Handle the exception, e.g., log an error or return an empty list.
            return new ArrayList<>();
        }
    }

    public void saveProducts(List<Product> products) {
        try {
            objectMapper.writeValue(new File(jsonFilePath), products);
        } catch (IOException e) {
            // Handle the exception, e.g., log an error.
        }
    }

    // Similar methods for Consumption and Exchange data

}
