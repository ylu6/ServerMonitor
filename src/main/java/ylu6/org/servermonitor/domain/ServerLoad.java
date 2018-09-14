package ylu6.org.servermonitor.domain;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import java.io.Serializable;
import java.util.Date;

@Table("server_loads")
public class ServerLoad implements Serializable{
    @PrimaryKeyColumn(name = "server_name", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    private String serverName;

    @PrimaryKeyColumn(name = "event_time", ordinal = 1, type = PrimaryKeyType.CLUSTERED)
    private Date eventTime;

    @PrimaryKeyColumn(name = "cpu_load", ordinal = 2, type = PrimaryKeyType.CLUSTERED)
    private Float cpuLoad;

    @Column("num_cores")
    private Integer nCores;

    @Column("mem_total")
    private Float memTotal;

    @Column("mem_used")
    private Float memUsed;

    // Constructor
    public ServerLoad() {
    }

    // Setter and Getter
    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public Date getEventTime() {
        return eventTime;
    }

    public void setEventTime(Date eventTime) {
        this.eventTime = eventTime;
    }

    public Float getCpuLoad() {
        return cpuLoad;
    }

    public void setCpuLoad(Float cpuLoad) {
        this.cpuLoad = cpuLoad;
    }

    public Integer getnCores() {
        return nCores;
    }

    public void setnCores(Integer nCores) {
        this.nCores = nCores;
    }

    public Float getMemTotal() {
        return memTotal;
    }

    public void setMemTotal(Float memTotal) {
        this.memTotal = memTotal;
    }

    public Float getMemUsed() {
        return memUsed;
    }

    public void setMemUsed(Float memUsed) {
        this.memUsed = memUsed;
    }
}
