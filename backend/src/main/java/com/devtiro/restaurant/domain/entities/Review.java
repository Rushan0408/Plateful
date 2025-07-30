package com.devtiro.restaurant.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Review {

    @Field(type = FieldType.Keyword)
    private String id;

    @Field(type = FieldType.Text)
    private String content;

    @Field(type = FieldType.Integer)
    private String rating;

    @Field(type = FieldType.Date, format = DateFormat.date_hour_minute_second)
    private String datePosted;

    @Field(type = FieldType.Date, format = DateFormat.date_hour_minute_second)
    private String lastEdited;

    @Field(type = FieldType.Nested)
    private List<Photo> photos = new ArrayList<>();

    @Field(type = FieldType.Nested)
    private User writtenBy;

}
