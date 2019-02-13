package tianhuan;

import com.alibaba.fastjson.JSONObject;
import com.test.config.SessionFactoryConfig;
import com.test.config.WebMvcConfig;
import com.test.entity.User;
import com.test.service.JobService;
import com.test.service.UserService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * UserServiceImpl Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>���� 2, 2017</pre>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SessionFactoryConfig.class})
public class UserServiceImplTest extends AbstractJUnit4SpringContextTests {

    @Resource
    UserService userService;
    @Resource
    JobService jobService;

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: sayHello()
     */
    @Test
    public void testSayHello() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: findAll()
     */
    @Test
    public void testFindAll() throws Exception {
        System.out.println(JSONObject.toJSONString(""));
    }

    /**
     * Method: findById(int userId)
     */
    @Test
    public void testFindById() throws Exception {
//TODO: Test goes here... 
    }


} 
