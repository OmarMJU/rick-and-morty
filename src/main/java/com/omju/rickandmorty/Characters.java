package com.omju.rickandmorty;

import java.util.Arrays;
import java.util.Objects;

public class Characters {
    private String id;
    private String name;
    private String status;
    private String species;
    private String type;
    private String gender;
    private String[] origin;
    private String[] location;
    private String image;
    private String[] episode;
    private String url;
    private String created;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String[] getOrigin() {
        return origin;
    }

    public void setOrigin(String[] origin) {
        this.origin = origin;
    }

    public String[] getLocation() {
        return location;
    }

    public void setLocation(String[] location) {
        this.location = location;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String[] getEpisode() {
        return episode;
    }

    public void setEpisode(String[] episode) {
        this.episode = episode;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    @Override
    public String toString() {
        return "Characters{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", species='" + species + '\'' +
                ", type='" + type + '\'' +
                ", gender='" + gender + '\'' +
                ", origin=" + Arrays.toString(origin) +
                ", location=" + Arrays.toString(location) +
                ", image='" + image + '\'' +
                ", episode=" + Arrays.toString(episode) +
                ", url='" + url + '\'' +
                ", created='" + created + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Characters that = (Characters) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(status, that.status) && Objects.equals(species, that.species) && Objects.equals(type, that.type) && Objects.equals(gender, that.gender) && Arrays.equals(origin, that.origin) && Arrays.equals(location, that.location) && Objects.equals(image, that.image) && Arrays.equals(episode, that.episode) && Objects.equals(url, that.url) && Objects.equals(created, that.created);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, name, status, species, type, gender, image, url, created);
        result = 31 * result + Arrays.hashCode(origin);
        result = 31 * result + Arrays.hashCode(location);
        result = 31 * result + Arrays.hashCode(episode);
        return result;
    }
}
