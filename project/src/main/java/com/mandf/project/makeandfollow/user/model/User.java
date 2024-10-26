package com.mandf.project.makeandfollow.user.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class User {

    private String userId;
    private String password;
    private String status;
    private String type;
    private String companyUid;
}
