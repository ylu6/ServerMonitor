package ylu6.org.servermonitor.services;

import ylu6.org.servermonitor.domain.Server;

import java.util.List;

public interface ServerService {
    List<String> getAllServerNames();
    List<Server> getAllServers();
}
