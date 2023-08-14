package com.abl.wakala.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuthenticationDto {
    @NonNull
    private String username;
    @NonNull
    private String password;
}
