package org.zerock.springex.service;

import org.zerock.springex.dto.TodoDTO;
import org.zerock.springex.dto.PageRequestDTO;
import org.zerock.springex.dto.PageResponseDTO;

import java.util.List;

public interface TodoService {
    void register(TodoDTO todoDTO);

    /* 기존의  getAll을 대체 */
    //List<TodoDTO> getAll();
    PageResponseDTO<TodoDTO> getList(PageRequestDTO pageRequestDTO);
    TodoDTO getOne(Long tno);
    void remove(Long tno);
    void modify(TodoDTO todoDTO);


}
