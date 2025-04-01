//package org.example;
//
//import org.mapstruct.Mapper;
//import org.mapstruct.Mapping;
//
//@Mapper
//public abstract class MyLayerMapper {
//    public TargetVO assemble(SourceDTO source) {
//        if (source == null) {
//            return null;
//        }
//        TargetVO target = new TargetVO();
////        target.setUserId(source.getId());
////        target.setFullName(source.getName());
////        target.setLabels(source.getTags());
//        if (source.getDetail() != null) {
//            target.getInfo().setDesc(source.getDetail().getDescription());
//            if (source.getDetail().getMeta() != null) {
//                target.getInfo().getMetaInfo().setCreator(source.getDetail().getMeta().getCreatedBy());
//            }
//        }
//        return target;
//    }
//
//    @Mapping(source = "id", target = "userId")
//    @Mapping(source = "name", target = "fullName")
//    @Mapping(source = "detail.description", target = "info.desc")
//    @Mapping(source = "detail.meta.createdBy", target = "info.metaInfo.creator")
//    @Mapping(source = "tags", target = "labels")
//    public abstract TargetVO toTargetVO(SourceDTO source);
//}
