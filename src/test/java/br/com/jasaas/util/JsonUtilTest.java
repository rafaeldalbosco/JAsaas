package br.com.jasaas.util;

import br.com.jasaas.entity.Payment;
import br.com.jasaas.entity.meta.WebhookPayment;
import org.junit.Test;

import java.text.SimpleDateFormat;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class JsonUtilTest {

    @Test
    public void toJsonMantemDataIsoDepoisDeLerUmWebhook() throws Exception {
        Payment payment = new Payment();
        payment.setDueDate(new SimpleDateFormat("yyyy-MM-dd").parse("2026-11-21"));

        Webhook.parseToPayment("{\"data\":[{\"dueDate\":\"21/11/2026\"}]}");

        String json = JsonUtil.toJSON(payment);
        assertTrue(json, json.contains("\"dueDate\":\"2026-11-21\""));
    }

    @Test
    public void webhookContinuaLendoDataNoFormatoBrasileiro() throws Exception {
        JsonUtil.toJSON(new Payment());

        WebhookPayment webhook = Webhook.parseToPayment("{\"data\":[{\"dueDate\":\"21/11/2026\"}]}");

        assertEquals(new SimpleDateFormat("yyyy-MM-dd").parse("2026-11-21"),
                webhook.getData().get(0).getDueDate());
    }
}
