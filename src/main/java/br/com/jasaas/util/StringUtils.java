package br.com.jasaas.util;

import java.text.Normalizer;

public class StringUtils {

    public static String removerAcentos(String texto) {
        if (texto == null) return null;

        String normalized = Normalizer.normalize(texto, Normalizer.Form.NFD);
        return normalized.replaceAll("[^\\p{ASCII}]", "");
    }

}