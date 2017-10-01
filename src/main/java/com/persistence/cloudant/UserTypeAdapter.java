package com.persistence.cloudant;

import com.credit_card.user.User;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

public class UserTypeAdapter extends TypeAdapter<User>{

    private static final String TYPE = "user";

    /**
     * Writes one JSON value (an array, object, string, number, boolean or null)
     * for {@code value}.
     *
     * @param out
     * @param value the Java object to write. May be null.
     */
    @Override
    public void write(JsonWriter out, User value) throws IOException {
        /* No credit cards are persisted within a user document.
		 * They exist as separate credit card documents within cloudant. */

        out.beginObject();
        out.name("objectId").value(value.getUserName());

        out.name("type").value(TYPE);

		/* As this is a versioned object it requires  a userData field even though the store
		    contains no metadata. So for now its just an empty JSON object. */
        out.name("userData");
        out.beginObject();
        // empty object.
        out.endObject();

        out.endObject();
    }

    /**
     * Reads one JSON value (an array, object, string, number, boolean or null)
     * and converts it to a Java object. Returns the converted object.
     *
     * @param in
     * @return the converted Java object. May be null.
     */
    @Override
    public User read(JsonReader in) throws IOException {
        return null;
    }
}
