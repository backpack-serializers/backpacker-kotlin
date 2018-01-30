package com.github.backpacker;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BackpackerShould {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    @Test
    public void deserializeSameValuesThanSerialize() throws ParseException {
        Person anna = new Person("Anna", sdf.parse("21/07/1988"), 20);

        byte[] annaInBytes = new PersonBackpacker().toBytes(anna);

        Person annaBackpackedAndUnpacked = new PersonBackpacker().fromBytes(annaInBytes);

        assertEquals(anna.getName(), annaBackpackedAndUnpacked.getName());
        assertEquals(anna.getBirthday(), annaBackpackedAndUnpacked.getBirthday());
        assertEquals(anna.getFingers(), annaBackpackedAndUnpacked.getFingers());
    }

    @Test
    public void knowHowToDealWithLists() throws ParseException {
        Person anna = new Person("Anna", sdf.parse("21/07/1988"), 20);
        Person roc = new Person("Roc", sdf.parse("23/04/1986"), 21);

        List<Person> persons = new ArrayList<>();
        persons.add(anna);
        persons.add(roc);

        byte[] listInBytes = new PersonBackpacker().toBytesList(persons);

        List<Person> personsInObject = new PersonBackpacker().fromBytesList(listInBytes);

        assertEquals(
                anna.getName(),
                personsInObject.get(0).getName()
        );
        assertEquals(
                roc.getName(),
                personsInObject.get(1).getName()
        );
    }
}
