package org.zerock.springex.sample;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Qualifier;

@Service
@ToString
@RequiredArgsConstructor
public class SampleService {
    /* RequiredArgsConstructor를 사용하지 않았을 때
    @Autowired
    private SampleDAO sampleDAO;
    */
    @Qualifier("normal")
    private final SampleDAO sampleDAO;
}
