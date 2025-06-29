package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OrderService {

    private static final Logger logger = LoggerFactory.getLogger(OrderService.class);

    public void placeOrder(String orderId) {
        logger.info("Placing order: {}", orderId);

        if (orderId == null || orderId.isBlank()) {
            logger.warn("Order ID is null or blank!");
            return;
        }

        if (orderId.startsWith("ERR")) {
            logger.error("Order ID {} caused a critical failure!", orderId);
        } else {
            logger.info("Order ID {} processed successfully.", orderId);
        }
    }

    public static void main(String[] args) {
        OrderService service = new OrderService();
        service.placeOrder("12345");
        service.placeOrder("");
        service.placeOrder("ERR-500");
    }
}
