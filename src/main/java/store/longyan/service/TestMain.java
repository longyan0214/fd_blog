package store.longyan.service;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestMain {

    @Autowired
    private ArticleService articleService;

    @Autowired
    private OptionService optionService;

    @Test
    public void test1() {
        System.out.println(articleService.findAll());
    }

    @Test
    public void test2() {
        System.out.println(optionService.findManagerInfo());
    }

}
