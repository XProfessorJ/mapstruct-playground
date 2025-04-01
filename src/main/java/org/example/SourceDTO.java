package org.example;

import lombok.Data;

import java.util.List;

@Data
public class SourceDTO {
    private Long id;
    private String name;
    private DetailInfo detail;
    private List<String> tags;

    @Data
    public static class DetailInfo {
        private String description;
        private MetaData meta;
    }

    @Data
    public static class MetaData {
        private String createdBy;
        private String updatedBy;
        private Long createdAt;
    }
}