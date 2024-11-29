/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.benzinga.BZClient.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import org.benzinga.BZClient.utils.Utils;


public class LogoapiLogoColors {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("background_dark")
    private Optional<String> backgroundDark;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("background_light")
    private Optional<String> backgroundLight;

    @JsonCreator
    public LogoapiLogoColors(
            @JsonProperty("background_dark") Optional<String> backgroundDark,
            @JsonProperty("background_light") Optional<String> backgroundLight) {
        Utils.checkNotNull(backgroundDark, "backgroundDark");
        Utils.checkNotNull(backgroundLight, "backgroundLight");
        this.backgroundDark = backgroundDark;
        this.backgroundLight = backgroundLight;
    }
    
    public LogoapiLogoColors() {
        this(Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> backgroundDark() {
        return backgroundDark;
    }

    @JsonIgnore
    public Optional<String> backgroundLight() {
        return backgroundLight;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public LogoapiLogoColors withBackgroundDark(String backgroundDark) {
        Utils.checkNotNull(backgroundDark, "backgroundDark");
        this.backgroundDark = Optional.ofNullable(backgroundDark);
        return this;
    }

    public LogoapiLogoColors withBackgroundDark(Optional<String> backgroundDark) {
        Utils.checkNotNull(backgroundDark, "backgroundDark");
        this.backgroundDark = backgroundDark;
        return this;
    }

    public LogoapiLogoColors withBackgroundLight(String backgroundLight) {
        Utils.checkNotNull(backgroundLight, "backgroundLight");
        this.backgroundLight = Optional.ofNullable(backgroundLight);
        return this;
    }

    public LogoapiLogoColors withBackgroundLight(Optional<String> backgroundLight) {
        Utils.checkNotNull(backgroundLight, "backgroundLight");
        this.backgroundLight = backgroundLight;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LogoapiLogoColors other = (LogoapiLogoColors) o;
        return 
            Objects.deepEquals(this.backgroundDark, other.backgroundDark) &&
            Objects.deepEquals(this.backgroundLight, other.backgroundLight);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            backgroundDark,
            backgroundLight);
    }
    
    @Override
    public String toString() {
        return Utils.toString(LogoapiLogoColors.class,
                "backgroundDark", backgroundDark,
                "backgroundLight", backgroundLight);
    }
    
    public final static class Builder {
 
        private Optional<String> backgroundDark = Optional.empty();
 
        private Optional<String> backgroundLight = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder backgroundDark(String backgroundDark) {
            Utils.checkNotNull(backgroundDark, "backgroundDark");
            this.backgroundDark = Optional.ofNullable(backgroundDark);
            return this;
        }

        public Builder backgroundDark(Optional<String> backgroundDark) {
            Utils.checkNotNull(backgroundDark, "backgroundDark");
            this.backgroundDark = backgroundDark;
            return this;
        }

        public Builder backgroundLight(String backgroundLight) {
            Utils.checkNotNull(backgroundLight, "backgroundLight");
            this.backgroundLight = Optional.ofNullable(backgroundLight);
            return this;
        }

        public Builder backgroundLight(Optional<String> backgroundLight) {
            Utils.checkNotNull(backgroundLight, "backgroundLight");
            this.backgroundLight = backgroundLight;
            return this;
        }
        
        public LogoapiLogoColors build() {
            return new LogoapiLogoColors(
                backgroundDark,
                backgroundLight);
        }
    }
}

