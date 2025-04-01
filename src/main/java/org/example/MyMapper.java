package org.example;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class MyMapper {
    MyMapper INSTANCE = Mappers.getMapper(MyMapper.class);

//    @Mappings({
////            @Mapping(source = "id", target = "userId"),
////            @Mapping(source = "name", target = "fullName"),
////            @Mapping(source = "tags", target = "labels"),
////            @Mapping(source = "detail", target = "info")
//            @Mapping(source = "source", target = "info")
//    })
//    TargetVO toTargetVO(SourceDTO source);

    @Mapping(source = "description", target = "desc")
    @Mapping(source = "meta", target = "metaInfo")
    public abstract TargetVO.InfoVO mapDetailInfo(SourceDTO.DetailInfo detailInfo);

    @Mapping(source = "createdBy", target = "creator")
    @Mapping(source = "updatedBy", target = "updater")
    @Mapping(source = "createdAt", target = "createdAt")
    public abstract TargetVO.MetaVO mapMetaData(SourceDTO.MetaData metaData);
}
