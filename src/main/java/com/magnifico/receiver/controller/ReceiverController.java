package com.magnifico.receiver.controller;

import ch.qos.logback.classic.Logger;
import com.magnifico.receiver.model.TradeStatusResponse;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/trade")
public class ReceiverController {

    Logger logger = (Logger) LoggerFactory.getLogger(ReceiverController.class);

    @GetMapping(value = "/status/{tradeId}")
    public ResponseEntity<TradeStatusResponse> getOrderStatus(@PathVariable("tradeId") String tradeId){

        TradeStatusResponse tradeStatusResponse = new TradeStatusResponse();
        tradeStatusResponse.setTradeId(tradeId);
        tradeStatusResponse.setTradeStatus("Processing");

        logger.trace("A TRACE Message - Order: " + tradeId + " is In Progress");
        logger.debug("A DEBUG Message - Order: " + tradeId + " is In Progress");
        logger.info("An INFO Message - Order: " + tradeId + " is In Progress");
        logger.warn("A WARN Message - Order: " + tradeId + " is In Progress");
        logger.error("An ERROR Message - Order: " + tradeId + " is In Progress");

        return ResponseEntity.ok(tradeStatusResponse);
    }

}
