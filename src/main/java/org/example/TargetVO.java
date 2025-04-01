package org.example;

import lombok.Data;

import java.util.List;

@Data
public class TargetVO {
//    private Long userId;
//    private String fullName;
    private InfoVO info;
//    private List<String> labels;

    @Data
    public static class InfoVO {
        private String desc;
        private MetaVO metaInfo;

    }

    @Data
    public static class MetaVO {
        private String creator;
        private String updater;
        private Long createdAt;
    }
}