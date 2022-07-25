package com.microservice.fraud;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FraudCheckHistoryRepositoy
        extends JpaRepository<FraudCheckHistory, Integer> {
}
