package ylu6.org.servermonitor.services;

import org.springframework.stereotype.Service;
import ylu6.org.servermonitor.domain.Server;
import ylu6.org.servermonitor.repositories.ServerRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServerServiceImpl implements ServerService {

    ServerRepository serverRepository;

    public ServerServiceImpl(ServerRepository serverRepository) {
        this.serverRepository = serverRepository;
    }

    @Override
    public List<String> getAllServerNames() {
        List<String> serverNames = new ArrayList<>();
        for(Server s : serverRepository.findAll())
            serverNames.add(s.getServerName());

        return serverNames;
    }

    @Override
    public List<Server> getAllServers() {
        List<Server> servers = new ArrayList<>();
        for(Server s : serverRepository.findAll())
            servers.add(s);

        return servers;
    }
}
