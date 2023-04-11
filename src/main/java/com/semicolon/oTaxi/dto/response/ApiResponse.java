package com.semicolon.oTaxi.dto.response;

import lombok.*;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse {
    private String status;
    private String message;
   private Object data;

}
