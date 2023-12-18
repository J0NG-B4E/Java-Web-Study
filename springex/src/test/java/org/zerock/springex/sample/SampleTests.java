package org.zerock.springex.sample;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/*
* ExtendWith는 JUnit5 버전에서 'spring-test'를 이용하기 위한설정(JUnit4 버전에서는 @Runwith)
* ContextConfiguration은 스프링의 설정 정보를 로딩하기 위해서 사용.
* 현재의 프로젝트의 경우 XML로 설정되어 있기 때문에 ContextConfiguration의 locations 속성을 이용하고
* 자바 설정을 이용하는 경우에는 classes 속성을 이용한다. */
@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations="file:src/main/webapp/WEB-INF/root-context.xml")
public class SampleTests {
    /* Autowired는 스프링에서 사용하는 의존성 주입 관련 어노테이션 */
    /* 만약 해당 타입의 빈(bean)이 존재하면 여기에 주입해 주기를 원한다라는 의미 */
    @Autowired
    private SampleService sampleService;

    @Test
    public void testService1(){
        log.info(sampleService);
        Assertions.assertNotNull(sampleService);
    }
}
