package uz.bakhromjon.json.jsonObjects;


import java.net.URL;

public record BookRecord(String title,
                         String author,
                         String publisher,
                         Long priceInCents,
                         URL url) {
}
