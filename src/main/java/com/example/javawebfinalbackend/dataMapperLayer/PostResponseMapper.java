package com.example.javawebfinalbackend.dataMapperLayer;

import com.example.javawebfinalbackend.dataAccessLayer.Post;
import com.example.javawebfinalbackend.presentationLayer.PostResponseModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;


@Mapper(componentModel = "spring")
public interface PostResponseMapper {
    @Mapping(target = "userId", source = "user.userId")
    @Mapping(target = "userName", source = "user.userName")
    @Mapping(target = "userImageUrl", source = "user.profilePictureUrl")
    PostResponseModel entityToResponseModel(Post post);
    List<PostResponseModel> entityListToResponseModelList(List<Post> posts);
}
