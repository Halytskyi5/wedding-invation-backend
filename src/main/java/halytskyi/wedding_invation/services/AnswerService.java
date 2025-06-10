package halytskyi.wedding_invation.services;

import halytskyi.wedding_invation.entities.AnswerEntity;
import halytskyi.wedding_invation.repositories.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerService {
    @Autowired
    private AnswerRepository answerRepository;

    public AnswerEntity addAnswer(AnswerEntity answer) {
        answer = this.answerRepository.save(answer);
        return answer;
    }

    public List<AnswerEntity> getAnswers() {
        return this.answerRepository.findAll();
    }
}
