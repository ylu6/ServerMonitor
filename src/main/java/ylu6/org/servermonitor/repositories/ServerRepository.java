package ylu6.org.servermonitor.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ylu6.org.servermonitor.domain.Server;

import java.util.List;

@Repository
public interface ServerRepository extends CrudRepository<Server, Integer> {
    List<Server> findBySince(Integer since);
}
