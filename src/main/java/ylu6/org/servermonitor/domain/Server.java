package ylu6.org.servermonitor.domain;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import java.io.Serializable;
import java.util.Date;

@Table("servers")
public class Server implements Serializable{

    @PrimaryKeyColumn(name = "since", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    private Integer since; // since which year

    @PrimaryKeyColumn(name = "num_cores", ordinal = 1, type = PrimaryKeyType.CLUSTERED)
    private Integer nCores; // number of cpu cores on this server

    @PrimaryKeyColumn(name = "server_name", ordinal = 2, type = PrimaryKeyType.CLUSTERED)
    private String serverName;

    @Column("mem_total")
    private Float memTotal; // total memory

    @Column("cpu_code")
    private String cpuCode; // CPU code of this server

    @Column("os")
    private String OS; // operating system

    @Column("cpu_freq")
    private Float cpuFreq;

    @Column("qsc")
    private String qsc;

    @Column("status")
    private String status;

    // Constructor
    public Server() {
    }

    // Getter and Setter
    public Integer getSince() {
        return since;
    }

    public void setSince(Integer since) {
        this.since = since;
    }

    public Integer getnCores() {
        return nCores;
    }

    public void setnCores(Integer nCores) {
        this.nCores = nCores;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public Float getMemTotal() {
        return memTotal;
    }

    public void setMemTotal(Float memTotal) {
        this.memTotal = memTotal;
    }

    public String getCpuCode() {
        return cpuCode;
    }

    public void setCpuCode(String cpuCode) {
        this.cpuCode = cpuCode;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public Float getCpuFreq() {
        return cpuFreq;
    }

    public void setCpuFreq(Float cpuFreq) {
        this.cpuFreq = cpuFreq;
    }

    public String getQsc() {
        return qsc;
    }

    public void setQsc(String qsc) {
        this.qsc = qsc;
    }

    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status; }
}
