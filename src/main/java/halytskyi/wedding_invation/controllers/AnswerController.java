package halytskyi.wedding_invation.controllers;

import halytskyi.wedding_invation.entities.AnswerEntity;
import halytskyi.wedding_invation.services.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/answers")
public class AnswerController {
    @Autowired
    private AnswerService service;

    @GetMapping("/get-all")
    public ResponseEntity<List<AnswerEntity>> getAnswers() {
        return ResponseEntity.ok(this.service.getAnswers());
    }

    @PostMapping("/add")
    public ResponseEntity<AnswerEntity> addAnswer(@RequestBody AnswerEntity answer) {
        return ResponseEntity.ok(this.service.addAnswer(answer));
    }
}
