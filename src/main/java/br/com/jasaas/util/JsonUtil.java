package br.com.jasaas.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author bosco
 */
public class JsonUtil {

	// Uma instância por formato: o Gson é imutável, então ler um webhook com data BR
	// não muda o formato usado pelo toJSON (nem por outra thread).
	private static final Gson GSON = new GsonBuilder()
			.excludeFieldsWithoutExposeAnnotation()
			.setDateFormat("yyyy-MM-dd")
			.create();
	private static final Gson GSON_DATA_BR = new GsonBuilder()
			.excludeFieldsWithoutExposeAnnotation()
			.setDateFormat("dd/MM/yyyy")
			.create();

	public static Object parse(String json, Class clazz) {
		return parse(json, clazz, false);
	}

	public static Object parse(String json, Class clazz, Boolean showLog) {
		return parse(json, clazz, showLog, false);
	}

	public static Object parse(String json, Class clazz, Boolean showLog, Boolean verificaDataBR) {
		Gson gson = verificaDataBR ? GSON_DATA_BR : GSON;
		try {
			return gson.fromJson(json, clazz);
		} catch (Exception e) {
			if (showLog) {
                Logger.getLogger(JsonUtil.class.getName()).log(Level.SEVERE, "Error parse gson.fromJson\n" + json, e);
				e.printStackTrace();
			}
			return null;
		}
	}

    public static Object parse(String json, Type type) {
        return GSON.fromJson(json, type);
    }

    public static String toJSON(Object obj) {
        return GSON.toJson(obj);
    }

	private static Boolean isDateBR(String json) {
		Pattern pattern = Pattern.compile("^[0-9]{2}/[0-9]{2}/[0-9]{4}$");
		Matcher matcher = pattern.matcher(json);
		return matcher.matches();
//        String dateUS = "2018-01-01";
//        pattern = Pattern.compile("^[0-9]{4}-[0-9]{2}-[0-9]{2}$");
	}
}
