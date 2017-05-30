package com.social.domain;

/**
 * Created by KimYJ on 2017-05-18.
 */
public enum SocialType {
    FACEBOOK("facebook"),
    TWITTER("twitter"),
    GOOGLE("google"),
    KAKAO("kakao");

    private String role;

    SocialType(String type) {
        this.role = type;
    }

    public String getType() {
        return "ROLE_" + role.toUpperCase();
    }

    public String getValue() { return role; }
}
