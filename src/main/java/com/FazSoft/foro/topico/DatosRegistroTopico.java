package com.FazSoft.foro.topico;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public record DatosRegistroTopico(
        @NotBlank String titulo,
        @NotBlank String mensaje,
        @DateTimeFormat @FutureOrPresent Date fecha,
        @NotBlank Estado estado,
        @NotBlank String autor,
        @NotBlank String curso
) {
}
