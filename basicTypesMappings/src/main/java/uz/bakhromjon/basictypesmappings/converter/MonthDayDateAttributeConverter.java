package uz.bakhromjon.basictypesmappings.converter;

import jakarta.persistence.AttributeConverter;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.MonthDay;

public class MonthDayDateAttributeConverter
        implements AttributeConverter<MonthDay, Date> {


    @Override
    public java.sql.Date convertToDatabaseColumn(
            MonthDay monthDay) {
        if (monthDay != null) {
            return java.sql.Date.valueOf(
                    monthDay.atYear(1)
            );
        }
        return null;
    }


    @Override
    public MonthDay convertToEntityAttribute(
            java.sql.Date date) {
        if (date != null) {
            LocalDate localDate = date.toLocalDate();
            return MonthDay.of(
                    localDate.getMonth(),
                    localDate.getDayOfMonth()
            );
        }
        return null;
    }
}