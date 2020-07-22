package com.wanderers.wanderers.app.payload;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class NewUserResponse {

    // @JsonProperty("username")
    private String username;

    // @JsonProperty("password")
    private String password;
}
