package hu.exercise.microservice.DataHandlerServer.client;

import hu.exercise.microservice.DataHandlerServer.client.DataHandlerClient.DataHandlerClientFallback;
import org.apache.commons.lang.StringUtils;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value = "datahandler", fallback = DataHandlerClientFallback.class)
public interface DataHandlerClient {

    @GetMapping("/{id}")
    String get(@PathVariable String id);

    @PostMapping("/{id}")
    void save(@PathVariable String id);

    @DeleteMapping("/{id}")
    void delete(@PathVariable String id);

    class DataHandlerClientFallback implements DataHandlerClient {

        @Override
        public String get(final String id) {
            return StringUtils.EMPTY;
        }

        @Override
        public void save(final String id) {
        }

        @Override
        public void delete(final String id) {
        }
    }
}
