package hu.bca.interview.bcarest.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hu.bca.interview.bcarest.dto.ExampleResponseDto;
import hu.bca.interview.bcarest.processor.GetExampleByIdProcessor;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/example")
public class ExampleController {

    private final GetExampleByIdProcessor getExampleByIdProcessor;

    @GetMapping(path = "{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<ExampleResponseDto> findById(@PathVariable String id) {
        return ResponseEntity.ok(getExampleByIdProcessor.findById(id));
    }
}
