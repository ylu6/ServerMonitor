package ylu6.org.servermonitor.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ylu6.org.servermonitor.domain.ServerLoad;

@Repository
public interface ServerLoadRepository extends CrudRepository<ServerLoad, String> {
}
