package edu.mum.cs.finalprep.bankingapplication.controller;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(HomeController.class)
public class HomeControllerTest {

    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private MockMvc mockMvc;

    @Before
    public void  setUp(){
        logger.info("myHomeController Mockito info guy started");
    }

    @Test
    public void testDisplayHomePage() throws Exception {
        mockMvc.perform(get("/bankingapp/"))
                .andExpect(status().isOk())
                .andExpect(view().name("index"))
//                .andExpect(content().string(
//                        containsString("<h3>Welcome to the eLibrary Books Management System (eLibBMS)</h3>")
//                        ))
        ;
    }


    @After
    public void tearDown(){
        logger.info("myHomeController Mockito info guy completed");
    }

}
