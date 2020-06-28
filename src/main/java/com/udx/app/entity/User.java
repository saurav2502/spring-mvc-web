package com.udx.app.entity;

import lombok.*;

/**
 * Created By Saurav Kumar on 6/28/2020
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    private String userName;
    private int userId;
    private Long userContact;
    private String userEmail;
}
