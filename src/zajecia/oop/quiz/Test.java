package zajecia.oop.quiz;

import zajecia.oop.quiz.question.FileQuestionsRepository;
import zajecia.oop.quiz.question.Question;
import zajecia.oop.quiz.question.QuestionsRepository;
import zajecia.oop.quiz.result.FileResultsRepository;
import zajecia.oop.quiz.result.Result;

/**
 * Created by Szymon on 2017-04-26.
 */
public class Test {
    public static void main(String[] args) {
//        FileResultsRepository repository = new FileResultsRepository(
//                "C:\\Users\\Szymon\\projekt\\SDA-java-podstawy\\results.txt");
//        Result[] allResults = repository.getAllResults();
//        repository.add(new Result("Agnieszka", 2));
//        Result[] allResults1 = repository.getAllResults();
//        Result[] topResults = repository.getTopResults(10);
        QuestionsRepository questionsRepository = new FileQuestionsRepository("C:\\Users\\RENT\\IdeaProjects\\wzor\\SDA-java-podstawy-master\\quiz.txt");
        Question[] questions = questionsRepository.getQuestions();
    }
}
