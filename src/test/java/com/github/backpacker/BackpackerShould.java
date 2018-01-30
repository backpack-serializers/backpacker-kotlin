package com.github.backpacker;

import com.github.backpacker.Backpacker;
import com.github.backpacker.PersonBackpacker;
import com.github.backpacker.Person;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

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
}
