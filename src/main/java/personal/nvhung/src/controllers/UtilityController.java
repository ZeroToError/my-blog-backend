package personal.nvhung.src.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UtilityController {

    @GetMapping("/ping")
    public ResponseEntity ping() {
        Map<String, String> result = new HashMap<>();
        result.put("status", "OK");
        return new ResponseEntity(result, HttpStatus.OK);
    }
}
