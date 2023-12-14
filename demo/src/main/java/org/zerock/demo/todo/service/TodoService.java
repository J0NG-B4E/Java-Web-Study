package org.zerock.demo.todo.service;

import com.sun.tools.javac.comp.Todo;
import org.zerock.demo.todo.dto.TodoDTO;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/* 정해진 수만큼 객체를 생성할 수 있다는 장점이 있음. */
public enum TodoService {
    /*
    * 객체의 개수를 결정하는 부분. 한 개만 지정되어 있으므로  하나의 객체만을 생성해서 사용함.
    * TodoService.INSTANCE와 같이 사용가능함.
    * */
    INSTANCE;  // 객체의 개수를 결정하는 부분. 한 개만 지정되어 있으므로  하나의 객체만을 생성해서 사용함.

    public void register(TodoDTO todoDTO){
        System.out.println("DEBUG............." + todoDTO);
    }

    public List<TodoDTO> getList(){
        List<TodoDTO> todoDTOS = IntStream.range(0, 10).mapToObj(i -> {
            TodoDTO dto = new TodoDTO();
            dto.setTno((long)i);
            dto.setTitle("Todo.." + i);
            dto.setDueDate(LocalDate.now());

            return dto;
        }).collect(Collectors.toList());

        return todoDTOS;
    }

    public TodoDTO get(Long tno){
        TodoDTO dto = new TodoDTO();
        dto.setTno(tno);
        dto.setTitle("Sample Todo");
        dto.setDueDate(LocalDate.now());
        dto.setFinished(true);

        return dto;
    }
}
