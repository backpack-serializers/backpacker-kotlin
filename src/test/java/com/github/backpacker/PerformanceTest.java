package com.github.backpacker;

import com.google.gson.Gson;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class PerformanceTest {

    int LOOPS = 10000;

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    @Test
    public void compareUsingPerson() throws ParseException {
        Person anna = new Person("Anna", sdf.parse("21/07/1988"), 20);
        byte[] bytes = new PersonBackpacker().toBytes(anna);
        String json = new Gson().toJson(anna);

        long backpackToBytes = 0;
        for (int i = 0; i < LOOPS; i++) {
            long start = System.currentTimeMillis();
            new PersonBackpacker().toBytes(anna);
            backpackToBytes += (System.currentTimeMillis() - start);
        }

        long backpackFromBytes = 0;
        for (int i = 0; i < LOOPS; i++) {
            long start = System.currentTimeMillis();
            new PersonBackpacker().fromBytes(bytes);
            backpackFromBytes += (System.currentTimeMillis() - start);
        }

        long gsonToJson = 0;
        for (int i = 0; i < LOOPS; i++) {
            long start = System.currentTimeMillis();
            new Gson().toJson(anna);
            gsonToJson += (System.currentTimeMillis() - start);
        }

        long gsonFromJson = 0;
        for (int i = 0; i < LOOPS; i++) {
            long start = System.currentTimeMillis();
            new Gson().fromJson(json, Person.class);
            gsonFromJson += (System.currentTimeMillis() - start);
        }

        System.out.println("Totals:");
        System.out.println("Backpack toBytes: " + backpackToBytes + "ms");
        System.out.println("Backpack fromBytes: " + backpackFromBytes + "ms");
        System.out.println("Backpack message length: " + bytes.length + " bytes");
        System.out.println("GSON toJson: " + gsonToJson + "ms");
        System.out.println("GSON fromJson: " + gsonFromJson + "ms");
        System.out.println("GSON message length: " + json.getBytes().length + " bytes");
    }

    @Test
    public void compareUsingThreeNumbers() {
        ThreeNumbers threeNumbers = new ThreeNumbers(42, 21312, 4129848);
        byte[] bytes = new ThreeNumbersBackpacker().toBytes(threeNumbers);
        String json = new Gson().toJson(threeNumbers);

        long backpackToBytes = 0;
        for (int i = 0; i < LOOPS; i++) {
            long start = System.currentTimeMillis();
            new ThreeNumbersBackpacker().toBytes(threeNumbers);
            backpackToBytes += (System.currentTimeMillis() - start);
        }

        long backpackFromBytes = 0;
        for (int i = 0; i < LOOPS; i++) {
            long start = System.currentTimeMillis();
            new ThreeNumbersBackpacker().fromBytes(bytes);
            backpackFromBytes += (System.currentTimeMillis() - start);
        }

        long gsonToJson = 0;
        for (int i = 0; i < LOOPS; i++) {
            long start = System.currentTimeMillis();
            new Gson().toJson(threeNumbers);
            gsonToJson += (System.currentTimeMillis() - start);
        }

        long gsonFromJson = 0;
        for (int i = 0; i < LOOPS; i++) {
            long start = System.currentTimeMillis();
            new Gson().fromJson(json, Person.class);
            gsonFromJson += (System.currentTimeMillis() - start);
        }

        System.out.println("Totals:");
        System.out.println("Backpack toBytes: " + backpackToBytes + "ms");
        System.out.println("Backpack fromBytes: " + backpackFromBytes + "ms");
        System.out.println("Backpack message length: " + bytes.length + " bytes");
        System.out.println("GSON toJson: " + gsonToJson + "ms");
        System.out.println("GSON fromJson: " + gsonFromJson + "ms");
        System.out.println("GSON message length: " + json.getBytes().length + " bytes");
    }

    @Test
    public void compareUsingAWikipediaArticle() {
        WikipediaArticle wikipediaArticle = new WikipediaArticle(
                "Addo Elephant National Park is a diverse wildlife conservation park situated close to Port Elizabeth in South Africa and is one of the country's 19 national parks. It currently ranks third in size after Kruger National Park and the Kgalagadi Transfrontier Park." +
                        "The original section of the park was founded in 1931,[1] in part due to the efforts of Sydney Skaife,[2] in order to provide a sanctuary for the eleven remaining elephants in the area. The park has proved to be very successful and currently houses more than 600 elephants and a large number of other mammals.\n" +
                        "The original park has subsequently been expanded to include the Woody Cape Nature Reserve that extends from the Sundays River mouth towards Alexandria and a marine reserve, which includes St. Croix Island and Bird Island, both important breeding habitat for gannets and penguins, not to mention a large variety of other marine life. Bird Island is home to the world's largest breeding colony of gannets - about 120,000 birds - and also hosts the second largest breeding colony of African penguins, the largest breeding colony being St. Croix island. These marine assets form part of the plan to expand the 1,640 km² Addo National Elephant Park into the 3,600 km² Greater Addo Elephant National Park.",
                "Parc Nacional dels elefants d'Addo és un parc de conservació de vida silvestre diversa situat a prop de Port Elizabeth a Sud-àfrica i és un dels 19 parcs nacionals del país. Actualment, ocupa el tercer lloc en grandària després de Parc Nacional Kruger i el Parc Transfronterer de Kgalagadi.\n" +
                        "La secció original del parc va ser fundat el 1931, en part a causa dels esforços de Sydney Skaife, amb la finalitat de proporcionar un santuari per als onze elefants que quedaven a la zona. El parc ha demostrat ser un gran èxit i en l'actualitat acull a més de 600 elefants i un gran nombre d'altres mamífers.\n" +
                        "El parc original s'ha ampliat posteriorment per incloure la Reserva Natural de Cap de Woody que s'estén des de la desembocadura del riu Sundays cap a Alexandria i una reserva marina, que inclou l'illa de St. Croix i l'Illa dels Ocells, important hàbitat de reproducció pels mascarells i els pingüins, per no parlar d'una gran varietat d'altres espècies marines.\n",
                32141
        );
        byte[] bytes = new WikipediaArticleBackpacker().toBytes(wikipediaArticle);
        String json = new Gson().toJson(wikipediaArticle);

        long backpackToBytes = 0;
        for (int i = 0; i < LOOPS; i++) {
            long start = System.currentTimeMillis();
            new WikipediaArticleBackpacker().toBytes(wikipediaArticle);
            backpackToBytes += (System.currentTimeMillis() - start);
        }

        long backpackFromBytes = 0;
        for (int i = 0; i < LOOPS; i++) {
            long start = System.currentTimeMillis();
            new WikipediaArticleBackpacker().fromBytes(bytes);
            backpackFromBytes += (System.currentTimeMillis() - start);
        }

        long gsonToJson = 0;
        for (int i = 0; i < LOOPS; i++) {
            long start = System.currentTimeMillis();
            new Gson().toJson(wikipediaArticle);
            gsonToJson += (System.currentTimeMillis() - start);
        }

        long gsonFromJson = 0;
        for (int i = 0; i < LOOPS; i++) {
            long start = System.currentTimeMillis();
            new Gson().fromJson(json, Person.class);
            gsonFromJson += (System.currentTimeMillis() - start);
        }

        System.out.println("Totals:");
        System.out.println("Backpack toBytes: " + backpackToBytes + "ms");
        System.out.println("Backpack fromBytes: " + backpackFromBytes + "ms");
        System.out.println("Backpack message length: " + bytes.length + " bytes");
        System.out.println("GSON toJson: " + gsonToJson + "ms");
        System.out.println("GSON fromJson: " + gsonFromJson + "ms");
        System.out.println("GSON message length: " + json.getBytes().length + " bytes");
    }

}
