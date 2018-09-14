package ylu6.org.servermonitor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import ylu6.org.servermonitor.domain.Server;
import ylu6.org.servermonitor.services.ServerService;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServerServiceTest {
    @Autowired
    ServerService serverService;

    List<String> serverNames = serverService.getAllServerNames();

    List<Server> servers = serverService.getAllServers();

    @Test
    public void testServerService() {
        System.out.println(serverNames.toString());
        for(Server s: servers)
            System.out.println(s.toString());
    }
}
