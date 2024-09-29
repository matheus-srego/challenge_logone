package com.teste.pratico.dtos;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class OpeningDTO {

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private Integer quantity;

}
