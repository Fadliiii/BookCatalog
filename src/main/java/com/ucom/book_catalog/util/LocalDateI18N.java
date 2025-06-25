package com.ucom.book_catalog.util;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author fadli a.k.a. FadliLlatul Umam
Java Developer
Created on 25/06/2025 21:45
@Last Modified 25/06/2025 21:45
Version 1.0
*/

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.springframework.context.i18n.LocaleContext;
import org.springframework.context.i18n.LocaleContextHolder;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class LocalDateI18N extends JsonSerializer<LocalDate> {

    @Override
    public void serialize(LocalDate value, JsonGenerator gen, SerializerProvider serializerProvider) throws IOException {
        //ambil Locale dari serializer context, atau pakai default

        Locale locale = LocaleContextHolder.getLocale();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM YYYY",locale);
        gen.writeString(value.format(formatter));

    }
}
