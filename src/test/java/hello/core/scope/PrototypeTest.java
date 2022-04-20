package hello.core.scope;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import static org.assertj.core.api.Assertions.assertThat;

public class PrototypeTest {
    @Test
    void prototypeBeanFind(){

        AnnotationConfigApplicationContext ac =new AnnotationConfigApplicationContext(PrototypeBean.class);

        PrototypeBean prototypeBean1=ac.getBean(PrototypeBean.class);
        PrototypeBean protytypeBean2=ac.getBean(PrototypeBean.class);
        System.out.println("prototypeBean1 = " + prototypeBean1);
        System.out.println("protytypeBean2 = " + protytypeBean2);

        assertThat(prototypeBean1).isNotSameAs(protytypeBean2);
        ac.close();
    }



    @Scope("prototype")
    static class PrototypeBean{ 

        @PostConstruct
        public void init(){
            System.out.println("prototype init" );
        }

        @PreDestroy
        public void destroy(){
            System.out.println("prototype destroy");
        }
    }


}
