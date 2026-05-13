package br.com.jasaas;

import br.com.jasaas.entity.WebhookConfig;
import br.com.jasaas.util.JsonUtil;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class WebhookConfigTest {

    @Test
    public void shouldSerializeWebhookPayloadUsingNewContract() {
        WebhookConfig webhookConfig = new WebhookConfig();
        webhookConfig.setId("whk_123");
        webhookConfig.setName("WebhookAtrio");
        webhookConfig.setUrl("https://www.example.com/webhook/event-asaas/123/6");
        webhookConfig.setEmail("contato@email.com");
        webhookConfig.setEnabled(Boolean.TRUE);
        webhookConfig.setInterrupted(Boolean.FALSE);
        webhookConfig.setApiVersion(3);
        webhookConfig.setAuthToken("AuthToken");
        webhookConfig.setSendType("SEQUENTIALLY");
        webhookConfig.setEvents(Arrays.asList("PAYMENT_CREATED", "PAYMENT_RECEIVED"));
        webhookConfig.setHasAuthToken(Boolean.TRUE);
        webhookConfig.setPenalizedRequestsCount(2);

        String json = JsonUtil.toJSON(webhookConfig);

        Assert.assertTrue(json.contains("\"name\":\"WebhookAtrio\""));
        Assert.assertTrue(json.contains("\"sendType\":\"SEQUENTIALLY\""));
        Assert.assertTrue(json.contains("\"events\":[\"PAYMENT_CREATED\",\"PAYMENT_RECEIVED\"]"));
        Assert.assertFalse(json.contains("\"id\""));
        Assert.assertFalse(json.contains("\"hasAuthToken\""));
        Assert.assertFalse(json.contains("\"penalizedRequestsCount\""));
    }

    @Test
    public void shouldParseWebhookResponseUsingNewContract() {
        String json = "{\"id\":\"bbf67496-1379-4b6d-a348-fd5fa229f1c\",\"name\":\"Name Example\",\"url\":\"https://www.example.com/webhook/asaas\",\"email\":\"john.doe@asaas.com.br\",\"enabled\":true,\"interrupted\":false,\"apiVersion\":3,\"hasAuthToken\":true,\"sendType\":\"SEQUENTIALLY\",\"penalizedRequestsCount\":0,\"events\":[\"PAYMENT_RECEIVED\",\"PAYMENT_CONFIRMED\"]}";

        WebhookConfig webhookConfig = (WebhookConfig) JsonUtil.parse(json, WebhookConfig.class);

        Assert.assertNotNull(webhookConfig);
        Assert.assertEquals("bbf67496-1379-4b6d-a348-fd5fa229f1c", webhookConfig.getId());
        Assert.assertEquals("Name Example", webhookConfig.getName());
        Assert.assertEquals("SEQUENTIALLY", webhookConfig.getSendType());
        Assert.assertTrue(webhookConfig.getHasAuthToken());
        Assert.assertEquals(Integer.valueOf(0), webhookConfig.getPenalizedRequestsCount());
        Assert.assertEquals(Arrays.asList("PAYMENT_RECEIVED", "PAYMENT_CONFIRMED"), webhookConfig.getEvents());
    }
}
