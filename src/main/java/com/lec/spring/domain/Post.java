package com.lec.spring.domain;

import lombok.*;

import javax.lang.model.type.ArrayType;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
// Model 객체 (domain)


/**
 * DTO 객체
 *  : Data Transfer Object 라고도 함.
 *
 *  객체 -> DB
 *  DB -> 객체
 *  request -> 객체
 *  객체 -> response
 *  ..
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Post {
    private Long id;
    private String subject;
    private String content;
    private LocalDateTime regDate;
    private Long viewCnt;

    private User user;  //글 작성자(FK)

    //글 : 첨부파일 = 1:N
    @ToString.Exclude
    @Builder.Default
    private List<Attachment> fileList = new ArrayList<>();

}

