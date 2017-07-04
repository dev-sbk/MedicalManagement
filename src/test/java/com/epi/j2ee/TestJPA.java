package com.epi.j2ee;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.epi.j2ee.domain.Assistante;
import com.epi.j2ee.domain.Docteur;
import com.epi.j2ee.domain.Ordonnance;
import com.epi.j2ee.domain.Role;
import com.epi.j2ee.metier.IGenericService;
import java.time.LocalDate;
import java.util.Date;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

public class TestJPA {

    private ClassPathXmlApplicationContext app;

    @Before
    public void setUp() throws Exception {
        app = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
    }

    @SuppressWarnings("unchecked")
    @Test
    public void test() {
     
      

    }
}
