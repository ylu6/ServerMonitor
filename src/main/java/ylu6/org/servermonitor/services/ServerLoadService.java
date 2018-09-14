package ylu6.org.servermonitor.services;

import ylu6.org.servermonitor.domain.ServerLoad;

import java.util.List;
import java.util.Optional;

public interface ServerLoadService {
    public ServerLoad saveServerLoad(ServerLoad serverLoad);
    public Iterable<ServerLoad> saveAllServerLoad(List<ServerLoad> serverLoads);
    public Iterable<ServerLoad> findAllServerLoad();
    public Iterable<ServerLoad> findAllServerLoadByServerName(Iterable<String> serverNames);
}
