package ylu6.org.servermonitor.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ylu6.org.servermonitor.domain.Server;
import ylu6.org.servermonitor.services.ServerService;

import java.util.List;

@RestController
@RequestMapping
public class ServerController {
    public static final String BASE_URL = "/api/servers";

    private ServerService serverService;

    public ServerController(ServerService serverService) {
        this.serverService = serverService;
    }

    @GetMapping("/api/servers/names")
    public List<String> getServerNames(){
        return serverService.getAllServerNames();
    }

    @GetMapping("/api/servers")
    public List<Server> getServers(){
        return serverService.getAllServers();
    }
}
