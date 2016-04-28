package com.ullink.slack.simpleslackapi.impl;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

class GsonHelper
{
    private GsonHelper() {}

    static Long getLongOrNull(JsonElement jsonElement)
    {
        return getLongOrDefaultValue(jsonElement,null);
    }

    static JsonArray getJsonArrayOrNull(JsonElement jsonElement)
    {
        return jsonElement != null ? jsonElement.getAsJsonArray() : null;
    }

    static String getStringOrNull(JsonElement jsonElement)
    {
        return getStringOrDefaultValue(jsonElement,null);
    }

    static Boolean getBooleanOrDefaultValue(JsonElement jsonElement, Boolean defaultValue)
    {
        return jsonElement != null ? jsonElement.getAsBoolean() : defaultValue;
    }

    static Long getLongOrDefaultValue(JsonElement jsonElement, Long defaultValue)
    {
        return jsonElement != null ? jsonElement.getAsLong() : defaultValue;
    }

    static String getStringOrDefaultValue(JsonElement jsonElement, String defaultValue)
    {
        return jsonElement != null ? jsonElement.getAsString() : defaultValue;
    }

    static Boolean ifNullFalse(JsonObject jsonUser, String field)
    {
        JsonElement jsonElement = jsonUser.get(field);
        if (jsonElement == null)
        {
            return false;
        }
        return jsonElement.getAsBoolean();
    }
}
