package org.datentyp.spring;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfiguration.class)
public class SpringConfigurationTest {
    @Autowired
    private SpringService springService;

    @Autowired
    private SpringRepository springRepository;

    @Autowired
    private SpringComponent springComponent;

    @Test
    public void expectSpringDependencyInjectionToAutowireServiceSpringBeans() {
        assertThat("spring failed to inject autowired @Service spring bean", springService, is(notNullValue()));
    }

    @Test
    public void expectSpringDependencyInjectionToAutowireRepositorySpringBeans() {
        assertThat("spring failed to inject autowired @Repository spring bean", springRepository, is(notNullValue()));
    }

    @Test
    public void expectSpringDependencyInjectionToAutowireComponentSpringBeans() {
        assertThat("spring failed to inject autowired @Component spring bean", springComponent, is(notNullValue()));
    }
}
