package com.metr.api.configuration;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.joda.time.LocalDate;

import java.io.IOException;


public class CustomDateSerializer extends JsonSerializer<LocalDate> {

    private static final String DATE_FORMAT = "YYYY-MM-dd";

    @Override
    public void serialize(LocalDate localDate, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonProcessingException {
        String dateString = localDate.toString(DATE_FORMAT);

        jsonGenerator.writeString(dateString);
    }
}
