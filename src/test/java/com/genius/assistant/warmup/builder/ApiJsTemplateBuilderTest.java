package com.genius.assistant.warmup.builder;

import com.genius.assistant.warmup.generate.builder.ApiJsTemplateBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Genius
 * @date 2023/03/23 20:02
 **/
@SpringBootTest
public class ApiJsTemplateBuilderTest {

    @Autowired
    ApiJsTemplateBuilder apiJsTemplateBuilder;
    @Test
    public void testBuild() {
        System.out.println(apiJsTemplateBuilder.build());
    }
}