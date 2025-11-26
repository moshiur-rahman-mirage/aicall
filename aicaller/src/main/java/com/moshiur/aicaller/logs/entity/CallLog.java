package com.moshiur.aicaller.logs.entity;
import jakarta.persistence.*;
import lombok.Data;

import java.time.Instant;

@Data
@Entity
@Table(name = "call_logs")
public class CallLog {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String callSid;
    private String fromNumber;
    private Instant startedAt;
    private Instant endedAt;
    private String transcript;

}
