package com.semicolon.oTaxi.dto.response;

import lombok.*;

import java.io.Serializable;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse implements Serializable {
    private String status;
    private String message;
   private Object data;

}
