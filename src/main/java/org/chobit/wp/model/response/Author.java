package org.chobit.wp.model.response;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Author {

    @JsonProperty("user_id")
    private String userId;

    @JsonProperty("user_login")
    private String userLogin;


    @JsonProperty("display_name")
    private String displayName;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return "Author{" +
                "userId='" + userId + '\'' +
                ", userLogin='" + userLogin + '\'' +
                ", displayName='" + displayName + '\'' +
                '}';
    }
}