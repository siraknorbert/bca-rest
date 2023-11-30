package hu.bca.interview.bcarest.processor;

import org.springframework.stereotype.Component;

import hu.bca.interview.bcarest.dto.ExampleResponseDto;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class GetExampleByIdProcessor {

    public ExampleResponseDto findById(String id) {
        ExampleResponseDto dummyResponse = new ExampleResponseDto();
        dummyResponse.setId("dummyId");
        dummyResponse.setExampleProperty("dummyExampleProperty");

        return dummyResponse;
    }
}
