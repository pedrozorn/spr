package main.java.com.spr.presentation;


import lombok.RequiredArgsConstructor;
import main.java.com.spr.application.usecase.GetTasksUseCase;
import main.java.com.spr.generated.controller.CommonApi;
import main.java.com.spr.generated.model.GetCommonTasksResponse;
import main.java.com.spr.generated.model.Task;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class CommonApiContoller implements CommonApi {
    private final GetTasksUseCase getTasksUseCase;

    @Override
    public ResponseEntity<GetCommonTasksResponse> getTasks(Integer userId) {

        System.out.println("************************************");
        System.out.println("Controller");
        System.out.println("userId" + userId);

        final var tasksList = getTasksUseCase.execute(userId);

//        Mapperで取得したTaskをOpenApiで定義したResponseのTask型に変換する
        final var taskResponseList = tasksList.stream()
                .map(task -> new Task(task.userId(),task.userId(), task.taskName())) // task.id(), task.name() でデータを取り出し
                .toList();

        return ResponseEntity.ok(new GetCommonTasksResponse(taskResponseList));
    }
}