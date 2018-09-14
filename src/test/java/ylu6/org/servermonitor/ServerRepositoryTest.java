package ylu6.org.servermonitor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import ylu6.org.servermonitor.domain.Server;
import ylu6.org.servermonitor.repositories.ServerRepository;
import ylu6.org.servermonitor.services.ServerService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServerRepositoryTest {

    @Autowired ServerRepository serverRepository;

    @Test
    public void testGetAllServers() {
        for(Server s : serverRepository.findBySince(2017))
            System.out.println(s.getServerName());
    }
}
