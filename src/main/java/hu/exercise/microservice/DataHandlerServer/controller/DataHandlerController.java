package hu.exercise.microservice.DataHandlerServer.controller;

import hu.exercise.microservice.DataHandlerServer.client.DataHandlerClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class DataHandlerController {

    private final DataHandlerClient dataHandlerClient;

    @GetMapping("/{id}")
    public String getData(@PathVariable final String id) {
        log.info("Get data with id: {}", id);
        return dataHandlerClient.get(id);
    }

    @PostMapping("/{id}")
    void save(@PathVariable final String id) {
        log.info("Save data with id: {}", id);
        dataHandlerClient.save(id);
    }

    @DeleteMapping("/{id}")
    void delete(@PathVariable final String id) {
        log.info("Delete data with id: {}", id);
        dataHandlerClient.delete(id);
    }
}
