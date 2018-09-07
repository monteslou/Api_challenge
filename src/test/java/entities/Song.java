package entities;

/**
 * Autogenerated by Avro
 * <p>
 * DO NOT EDIT DIRECTLY
 */

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Song extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
    public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser()
            .parse("{\"type\":\"record\",\"name\":\"Song\",\"namespace\":\"io.confluent.examples.streams.avro\",\"fields\":[{\"name\":\"id\",\"type\":\"long\"},{\"name\":\"album\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"artist\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"genre\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}");

    public static org.apache.avro.Schema getClassSchema() {
        return SCHEMA$;
    }

    @Deprecated
    public long id;
    @Deprecated
    public java.lang.String album;
    @Deprecated
    public java.lang.String artist;
    @Deprecated
    public java.lang.String name;
    @Deprecated
    public java.lang.String genre;

    /**
     * Default constructor.  Note that this does not initialize fields
     * to their default values from the schema.  If that is desired then
     * one should use <code>newBuilder()</code>.
     */
    public Song() {
    }

    /**
     * All-args constructor.
     */
    public Song(java.lang.Long id, java.lang.String album, java.lang.String artist, java.lang.String name, java.lang.String genre) {
        this.id = id;
        this.album = album;
        this.artist = artist;
        this.name = name;
        this.genre = genre;
    }

    public org.apache.avro.Schema getSchema() {
        return SCHEMA$;
    }

    // Used by DatumWriter.  Applications should not call.
    public java.lang.Object get(int field$) {
        switch (field$) {
            case 0:
                return id;
            case 1:
                return album;
            case 2:
                return artist;
            case 3:
                return name;
            case 4:
                return genre;
            default:
                throw new org.apache.avro.AvroRuntimeException("Bad index");
        }
    }

    // Used by DatumReader.  Applications should not call.
    @SuppressWarnings(value = "unchecked")
    public void put(int field$, java.lang.Object value$) {
        switch (field$) {
            case 0:
                id = (java.lang.Long) value$;
                break;
            case 1:
                album = (java.lang.String) value$;
                break;
            case 2:
                artist = (java.lang.String) value$;
                break;
            case 3:
                name = (java.lang.String) value$;
                break;
            case 4:
                genre = (java.lang.String) value$;
                break;
            default:
                throw new org.apache.avro.AvroRuntimeException("Bad index");
        }
    }

    /**
     * Gets the value of the 'id' field.
     */
    public java.lang.Long getId() {
        return id;
    }

    /**
     * Sets the value of the 'id' field.
     *
     * @param value the value to set.
     */
    public void setId(java.lang.Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the 'album' field.
     */
    public java.lang.String getAlbum() {
        return album;
    }

    /**
     * Sets the value of the 'album' field.
     *
     * @param value the value to set.
     */
    public void setAlbum(java.lang.String value) {
        this.album = value;
    }

    /**
     * Gets the value of the 'artist' field.
     */
    public java.lang.String getArtist() {
        return artist;
    }

    /**
     * Sets the value of the 'artist' field.
     *
     * @param value the value to set.
     */
    public void setArtist(java.lang.String value) {
        this.artist = value;
    }

    /**
     * Gets the value of the 'name' field.
     */
    public java.lang.String getName() {
        return name;
    }

    /**
     * Sets the value of the 'name' field.
     *
     * @param value the value to set.
     */
    public void setName(java.lang.String value) {
        this.name = value;
    }

    /**
     * Gets the value of the 'genre' field.
     */
    public java.lang.String getGenre() {
        return genre;
    }

    /**
     * Sets the value of the 'genre' field.
     *
     * @param value the value to set.
     */
    public void setGenre(java.lang.String value) {
        this.genre = value;
    }

    /**
     * Creates a new Song RecordBuilder
     */
    public static entities.Song.Builder newBuilder() {
        return new entities.Song.Builder();
    }

    /**
     * Creates a new Song RecordBuilder by copying an existing Builder
     */
    public static entities.Song.Builder newBuilder(entities.Song.Builder other) {
        return new entities.Song.Builder(other);
    }

    /**
     * Creates a new Song RecordBuilder by copying an existing Song instance
     */
    public static entities.Song.Builder newBuilder(entities.Song other) {
        return new entities.Song.Builder(other);
    }

    /**
     * RecordBuilder for Song instances.
     */
    public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Song>
            implements org.apache.avro.data.RecordBuilder<Song> {

        private long id;
        private java.lang.String album;
        private java.lang.String artist;
        private java.lang.String name;
        private java.lang.String genre;

        /**
         * Creates a new Builder
         */
        private Builder() {
            super(entities.Song.SCHEMA$);
        }

        /**
         * Creates a Builder by copying an existing Builder
         */
        private Builder(entities.Song.Builder other) {
            super(other);
            if (isValidValue(fields()[0], other.id)) {
                this.id = data().deepCopy(fields()[0].schema(), other.id);
                fieldSetFlags()[0] = true;
            }
            if (isValidValue(fields()[1], other.album)) {
                this.album = data().deepCopy(fields()[1].schema(), other.album);
                fieldSetFlags()[1] = true;
            }
            if (isValidValue(fields()[2], other.artist)) {
                this.artist = data().deepCopy(fields()[2].schema(), other.artist);
                fieldSetFlags()[2] = true;
            }
            if (isValidValue(fields()[3], other.name)) {
                this.name = data().deepCopy(fields()[3].schema(), other.name);
                fieldSetFlags()[3] = true;
            }
            if (isValidValue(fields()[4], other.genre)) {
                this.genre = data().deepCopy(fields()[4].schema(), other.genre);
                fieldSetFlags()[4] = true;
            }
        }

        /**
         * Creates a Builder by copying an existing Song instance
         */
        private Builder(entities.Song other) {
            super(entities.Song.SCHEMA$);
            if (isValidValue(fields()[0], other.id)) {
                this.id = data().deepCopy(fields()[0].schema(), other.id);
                fieldSetFlags()[0] = true;
            }
            if (isValidValue(fields()[1], other.album)) {
                this.album = data().deepCopy(fields()[1].schema(), other.album);
                fieldSetFlags()[1] = true;
            }
            if (isValidValue(fields()[2], other.artist)) {
                this.artist = data().deepCopy(fields()[2].schema(), other.artist);
                fieldSetFlags()[2] = true;
            }
            if (isValidValue(fields()[3], other.name)) {
                this.name = data().deepCopy(fields()[3].schema(), other.name);
                fieldSetFlags()[3] = true;
            }
            if (isValidValue(fields()[4], other.genre)) {
                this.genre = data().deepCopy(fields()[4].schema(), other.genre);
                fieldSetFlags()[4] = true;
            }
        }

        /**
         * Gets the value of the 'id' field
         */
        public java.lang.Long getId() {
            return id;
        }

        /**
         * Sets the value of the 'id' field
         */
        public entities.Song.Builder setId(long value) {
            validate(fields()[0], value);
            this.id = value;
            fieldSetFlags()[0] = true;
            return this;
        }

        /**
         * Checks whether the 'id' field has been set
         */
        public boolean hasId() {
            return fieldSetFlags()[0];
        }

        /**
         * Clears the value of the 'id' field
         */
        public entities.Song.Builder clearId() {
            fieldSetFlags()[0] = false;
            return this;
        }

        /**
         * Gets the value of the 'album' field
         */
        public java.lang.String getAlbum() {
            return album;
        }

        /**
         * Sets the value of the 'album' field
         */
        public entities.Song.Builder setAlbum(java.lang.String value) {
            validate(fields()[1], value);
            this.album = value;
            fieldSetFlags()[1] = true;
            return this;
        }

        /**
         * Checks whether the 'album' field has been set
         */
        public boolean hasAlbum() {
            return fieldSetFlags()[1];
        }

        /**
         * Clears the value of the 'album' field
         */
        public entities.Song.Builder clearAlbum() {
            album = null;
            fieldSetFlags()[1] = false;
            return this;
        }

        /**
         * Gets the value of the 'artist' field
         */
        public java.lang.String getArtist() {
            return artist;
        }

        /**
         * Sets the value of the 'artist' field
         */
        public entities.Song.Builder setArtist(java.lang.String value) {
            validate(fields()[2], value);
            this.artist = value;
            fieldSetFlags()[2] = true;
            return this;
        }

        /**
         * Checks whether the 'artist' field has been set
         */
        public boolean hasArtist() {
            return fieldSetFlags()[2];
        }

        /**
         * Clears the value of the 'artist' field
         */
        public entities.Song.Builder clearArtist() {
            artist = null;
            fieldSetFlags()[2] = false;
            return this;
        }

        /**
         * Gets the value of the 'name' field
         */
        public java.lang.String getName() {
            return name;
        }

        /**
         * Sets the value of the 'name' field
         */
        public entities.Song.Builder setName(java.lang.String value) {
            validate(fields()[3], value);
            this.name = value;
            fieldSetFlags()[3] = true;
            return this;
        }

        /**
         * Checks whether the 'name' field has been set
         */
        public boolean hasName() {
            return fieldSetFlags()[3];
        }

        /**
         * Clears the value of the 'name' field
         */
        public entities.Song.Builder clearName() {
            name = null;
            fieldSetFlags()[3] = false;
            return this;
        }

        /**
         * Gets the value of the 'genre' field
         */
        public java.lang.String getGenre() {
            return genre;
        }

        /**
         * Sets the value of the 'genre' field
         */
        public entities.Song.Builder setGenre(java.lang.String value) {
            validate(fields()[4], value);
            this.genre = value;
            fieldSetFlags()[4] = true;
            return this;
        }

        /**
         * Checks whether the 'genre' field has been set
         */
        public boolean hasGenre() {
            return fieldSetFlags()[4];
        }

        /**
         * Clears the value of the 'genre' field
         */
        public entities.Song.Builder clearGenre() {
            genre = null;
            fieldSetFlags()[4] = false;
            return this;
        }

        @Override
        public Song build() {
            try {
                Song record = new Song();
                record.id = fieldSetFlags()[0] ? this.id : (java.lang.Long) defaultValue(fields()[0]);
                record.album = fieldSetFlags()[1] ? this.album : (java.lang.String) defaultValue(fields()[1]);
                record.artist = fieldSetFlags()[2] ? this.artist : (java.lang.String) defaultValue(fields()[2]);
                record.name = fieldSetFlags()[3] ? this.name : (java.lang.String) defaultValue(fields()[3]);
                record.genre = fieldSetFlags()[4] ? this.genre : (java.lang.String) defaultValue(fields()[4]);
                return record;
            } catch (Exception e) {
                throw new org.apache.avro.AvroRuntimeException(e);
            }
        }
    }
}
