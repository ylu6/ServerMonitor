package ylu6.org.servermonitor.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
//import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;
import ylu6.org.servermonitor.domain.ServerLoad;
import ylu6.org.servermonitor.services.ServerLoadService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(ServerLoadController.BASE_URL)
public class ServerLoadController {
    public static final String BASE_URL = "/api/serverload";

    ServerLoadService serverLoadService;

    public ServerLoadController(ServerLoadService serverLoadService) {
        this.serverLoadService = serverLoadService;
    }

//    @Secured({"ROLE_ADMIN"})
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public String saveServerLoad(@RequestBody List<ServerLoad> serverLoads) {
        serverLoadService.saveAllServerLoad(serverLoads);
        return "Server load information successfully added.";
    }

    @GetMapping
    public List<ServerLoad> getAllServerLoadById(@RequestBody List<String> serverNames) {
        List<ServerLoad> serverLoads = new ArrayList<>();
        for (ServerLoad sl : serverLoadService.findAllServerLoadByServerName(serverNames))
            serverLoads.add(sl);

        return serverLoads;
    }

    @GetMapping("/all")
    public List<ServerLoad> getAllServerLoad() {
        List<ServerLoad> serverLoads = new ArrayList<>();
        for(ServerLoad sl : serverLoadService.findAllServerLoad())
            serverLoads.add(sl);

        return serverLoads;
    }

}
