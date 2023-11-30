package hu.bca.interview.bcarest.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExampleResponseDto {

    @NotNull
    @Size(max = 36)
    private String id;

    @NotNull
    @Size(max = 64)
    private String exampleProperty;
}
