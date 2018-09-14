package ylu6.org.servermonitor.services;

import org.springframework.stereotype.Service;
import ylu6.org.servermonitor.domain.ServerLoad;
import ylu6.org.servermonitor.repositories.ServerLoadRepository;

import java.util.List;

@Service
public class ServerLoadServiceImpl implements ServerLoadService {
    ServerLoadRepository serverLoadRepository;

    public ServerLoadServiceImpl(ServerLoadRepository serverLoadRepository) {
        this.serverLoadRepository = serverLoadRepository;
    }

    @Override
    public ServerLoad saveServerLoad(ServerLoad serverLoad) {
        return serverLoadRepository.save(serverLoad);
    }

    @Override
    public Iterable<ServerLoad> saveAllServerLoad(List<ServerLoad> serverLoads) {
        return serverLoadRepository.saveAll(serverLoads);
    }

    @Override
    public Iterable<ServerLoad> findAllServerLoad() {
        return serverLoadRepository.findAll();
    }

    @Override
    public Iterable<ServerLoad> findAllServerLoadByServerName(Iterable<String> serverNames) {
        return serverLoadRepository.findAllById(serverNames);
    }
}
