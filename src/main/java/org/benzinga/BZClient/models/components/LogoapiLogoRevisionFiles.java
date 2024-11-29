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


public class LogoapiLogoRevisionFiles {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("logo_dark")
    private Optional<String> logoDark;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("logo_light")
    private Optional<String> logoLight;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("logo_vector_dark")
    private Optional<String> logoVectorDark;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("logo_vector_light")
    private Optional<String> logoVectorLight;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mark_composite_dark")
    private Optional<String> markCompositeDark;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mark_composite_light")
    private Optional<String> markCompositeLight;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mark_dark")
    private Optional<String> markDark;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mark_light")
    private Optional<String> markLight;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mark_vector_composite_dark")
    private Optional<String> markVectorCompositeDark;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mark_vector_composite_light")
    private Optional<String> markVectorCompositeLight;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mark_vector_dark")
    private Optional<String> markVectorDark;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mark_vector_light")
    private Optional<String> markVectorLight;

    @JsonCreator
    public LogoapiLogoRevisionFiles(
            @JsonProperty("logo_dark") Optional<String> logoDark,
            @JsonProperty("logo_light") Optional<String> logoLight,
            @JsonProperty("logo_vector_dark") Optional<String> logoVectorDark,
            @JsonProperty("logo_vector_light") Optional<String> logoVectorLight,
            @JsonProperty("mark_composite_dark") Optional<String> markCompositeDark,
            @JsonProperty("mark_composite_light") Optional<String> markCompositeLight,
            @JsonProperty("mark_dark") Optional<String> markDark,
            @JsonProperty("mark_light") Optional<String> markLight,
            @JsonProperty("mark_vector_composite_dark") Optional<String> markVectorCompositeDark,
            @JsonProperty("mark_vector_composite_light") Optional<String> markVectorCompositeLight,
            @JsonProperty("mark_vector_dark") Optional<String> markVectorDark,
            @JsonProperty("mark_vector_light") Optional<String> markVectorLight) {
        Utils.checkNotNull(logoDark, "logoDark");
        Utils.checkNotNull(logoLight, "logoLight");
        Utils.checkNotNull(logoVectorDark, "logoVectorDark");
        Utils.checkNotNull(logoVectorLight, "logoVectorLight");
        Utils.checkNotNull(markCompositeDark, "markCompositeDark");
        Utils.checkNotNull(markCompositeLight, "markCompositeLight");
        Utils.checkNotNull(markDark, "markDark");
        Utils.checkNotNull(markLight, "markLight");
        Utils.checkNotNull(markVectorCompositeDark, "markVectorCompositeDark");
        Utils.checkNotNull(markVectorCompositeLight, "markVectorCompositeLight");
        Utils.checkNotNull(markVectorDark, "markVectorDark");
        Utils.checkNotNull(markVectorLight, "markVectorLight");
        this.logoDark = logoDark;
        this.logoLight = logoLight;
        this.logoVectorDark = logoVectorDark;
        this.logoVectorLight = logoVectorLight;
        this.markCompositeDark = markCompositeDark;
        this.markCompositeLight = markCompositeLight;
        this.markDark = markDark;
        this.markLight = markLight;
        this.markVectorCompositeDark = markVectorCompositeDark;
        this.markVectorCompositeLight = markVectorCompositeLight;
        this.markVectorDark = markVectorDark;
        this.markVectorLight = markVectorLight;
    }
    
    public LogoapiLogoRevisionFiles() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> logoDark() {
        return logoDark;
    }

    @JsonIgnore
    public Optional<String> logoLight() {
        return logoLight;
    }

    @JsonIgnore
    public Optional<String> logoVectorDark() {
        return logoVectorDark;
    }

    @JsonIgnore
    public Optional<String> logoVectorLight() {
        return logoVectorLight;
    }

    @JsonIgnore
    public Optional<String> markCompositeDark() {
        return markCompositeDark;
    }

    @JsonIgnore
    public Optional<String> markCompositeLight() {
        return markCompositeLight;
    }

    @JsonIgnore
    public Optional<String> markDark() {
        return markDark;
    }

    @JsonIgnore
    public Optional<String> markLight() {
        return markLight;
    }

    @JsonIgnore
    public Optional<String> markVectorCompositeDark() {
        return markVectorCompositeDark;
    }

    @JsonIgnore
    public Optional<String> markVectorCompositeLight() {
        return markVectorCompositeLight;
    }

    @JsonIgnore
    public Optional<String> markVectorDark() {
        return markVectorDark;
    }

    @JsonIgnore
    public Optional<String> markVectorLight() {
        return markVectorLight;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public LogoapiLogoRevisionFiles withLogoDark(String logoDark) {
        Utils.checkNotNull(logoDark, "logoDark");
        this.logoDark = Optional.ofNullable(logoDark);
        return this;
    }

    public LogoapiLogoRevisionFiles withLogoDark(Optional<String> logoDark) {
        Utils.checkNotNull(logoDark, "logoDark");
        this.logoDark = logoDark;
        return this;
    }

    public LogoapiLogoRevisionFiles withLogoLight(String logoLight) {
        Utils.checkNotNull(logoLight, "logoLight");
        this.logoLight = Optional.ofNullable(logoLight);
        return this;
    }

    public LogoapiLogoRevisionFiles withLogoLight(Optional<String> logoLight) {
        Utils.checkNotNull(logoLight, "logoLight");
        this.logoLight = logoLight;
        return this;
    }

    public LogoapiLogoRevisionFiles withLogoVectorDark(String logoVectorDark) {
        Utils.checkNotNull(logoVectorDark, "logoVectorDark");
        this.logoVectorDark = Optional.ofNullable(logoVectorDark);
        return this;
    }

    public LogoapiLogoRevisionFiles withLogoVectorDark(Optional<String> logoVectorDark) {
        Utils.checkNotNull(logoVectorDark, "logoVectorDark");
        this.logoVectorDark = logoVectorDark;
        return this;
    }

    public LogoapiLogoRevisionFiles withLogoVectorLight(String logoVectorLight) {
        Utils.checkNotNull(logoVectorLight, "logoVectorLight");
        this.logoVectorLight = Optional.ofNullable(logoVectorLight);
        return this;
    }

    public LogoapiLogoRevisionFiles withLogoVectorLight(Optional<String> logoVectorLight) {
        Utils.checkNotNull(logoVectorLight, "logoVectorLight");
        this.logoVectorLight = logoVectorLight;
        return this;
    }

    public LogoapiLogoRevisionFiles withMarkCompositeDark(String markCompositeDark) {
        Utils.checkNotNull(markCompositeDark, "markCompositeDark");
        this.markCompositeDark = Optional.ofNullable(markCompositeDark);
        return this;
    }

    public LogoapiLogoRevisionFiles withMarkCompositeDark(Optional<String> markCompositeDark) {
        Utils.checkNotNull(markCompositeDark, "markCompositeDark");
        this.markCompositeDark = markCompositeDark;
        return this;
    }

    public LogoapiLogoRevisionFiles withMarkCompositeLight(String markCompositeLight) {
        Utils.checkNotNull(markCompositeLight, "markCompositeLight");
        this.markCompositeLight = Optional.ofNullable(markCompositeLight);
        return this;
    }

    public LogoapiLogoRevisionFiles withMarkCompositeLight(Optional<String> markCompositeLight) {
        Utils.checkNotNull(markCompositeLight, "markCompositeLight");
        this.markCompositeLight = markCompositeLight;
        return this;
    }

    public LogoapiLogoRevisionFiles withMarkDark(String markDark) {
        Utils.checkNotNull(markDark, "markDark");
        this.markDark = Optional.ofNullable(markDark);
        return this;
    }

    public LogoapiLogoRevisionFiles withMarkDark(Optional<String> markDark) {
        Utils.checkNotNull(markDark, "markDark");
        this.markDark = markDark;
        return this;
    }

    public LogoapiLogoRevisionFiles withMarkLight(String markLight) {
        Utils.checkNotNull(markLight, "markLight");
        this.markLight = Optional.ofNullable(markLight);
        return this;
    }

    public LogoapiLogoRevisionFiles withMarkLight(Optional<String> markLight) {
        Utils.checkNotNull(markLight, "markLight");
        this.markLight = markLight;
        return this;
    }

    public LogoapiLogoRevisionFiles withMarkVectorCompositeDark(String markVectorCompositeDark) {
        Utils.checkNotNull(markVectorCompositeDark, "markVectorCompositeDark");
        this.markVectorCompositeDark = Optional.ofNullable(markVectorCompositeDark);
        return this;
    }

    public LogoapiLogoRevisionFiles withMarkVectorCompositeDark(Optional<String> markVectorCompositeDark) {
        Utils.checkNotNull(markVectorCompositeDark, "markVectorCompositeDark");
        this.markVectorCompositeDark = markVectorCompositeDark;
        return this;
    }

    public LogoapiLogoRevisionFiles withMarkVectorCompositeLight(String markVectorCompositeLight) {
        Utils.checkNotNull(markVectorCompositeLight, "markVectorCompositeLight");
        this.markVectorCompositeLight = Optional.ofNullable(markVectorCompositeLight);
        return this;
    }

    public LogoapiLogoRevisionFiles withMarkVectorCompositeLight(Optional<String> markVectorCompositeLight) {
        Utils.checkNotNull(markVectorCompositeLight, "markVectorCompositeLight");
        this.markVectorCompositeLight = markVectorCompositeLight;
        return this;
    }

    public LogoapiLogoRevisionFiles withMarkVectorDark(String markVectorDark) {
        Utils.checkNotNull(markVectorDark, "markVectorDark");
        this.markVectorDark = Optional.ofNullable(markVectorDark);
        return this;
    }

    public LogoapiLogoRevisionFiles withMarkVectorDark(Optional<String> markVectorDark) {
        Utils.checkNotNull(markVectorDark, "markVectorDark");
        this.markVectorDark = markVectorDark;
        return this;
    }

    public LogoapiLogoRevisionFiles withMarkVectorLight(String markVectorLight) {
        Utils.checkNotNull(markVectorLight, "markVectorLight");
        this.markVectorLight = Optional.ofNullable(markVectorLight);
        return this;
    }

    public LogoapiLogoRevisionFiles withMarkVectorLight(Optional<String> markVectorLight) {
        Utils.checkNotNull(markVectorLight, "markVectorLight");
        this.markVectorLight = markVectorLight;
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
        LogoapiLogoRevisionFiles other = (LogoapiLogoRevisionFiles) o;
        return 
            Objects.deepEquals(this.logoDark, other.logoDark) &&
            Objects.deepEquals(this.logoLight, other.logoLight) &&
            Objects.deepEquals(this.logoVectorDark, other.logoVectorDark) &&
            Objects.deepEquals(this.logoVectorLight, other.logoVectorLight) &&
            Objects.deepEquals(this.markCompositeDark, other.markCompositeDark) &&
            Objects.deepEquals(this.markCompositeLight, other.markCompositeLight) &&
            Objects.deepEquals(this.markDark, other.markDark) &&
            Objects.deepEquals(this.markLight, other.markLight) &&
            Objects.deepEquals(this.markVectorCompositeDark, other.markVectorCompositeDark) &&
            Objects.deepEquals(this.markVectorCompositeLight, other.markVectorCompositeLight) &&
            Objects.deepEquals(this.markVectorDark, other.markVectorDark) &&
            Objects.deepEquals(this.markVectorLight, other.markVectorLight);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            logoDark,
            logoLight,
            logoVectorDark,
            logoVectorLight,
            markCompositeDark,
            markCompositeLight,
            markDark,
            markLight,
            markVectorCompositeDark,
            markVectorCompositeLight,
            markVectorDark,
            markVectorLight);
    }
    
    @Override
    public String toString() {
        return Utils.toString(LogoapiLogoRevisionFiles.class,
                "logoDark", logoDark,
                "logoLight", logoLight,
                "logoVectorDark", logoVectorDark,
                "logoVectorLight", logoVectorLight,
                "markCompositeDark", markCompositeDark,
                "markCompositeLight", markCompositeLight,
                "markDark", markDark,
                "markLight", markLight,
                "markVectorCompositeDark", markVectorCompositeDark,
                "markVectorCompositeLight", markVectorCompositeLight,
                "markVectorDark", markVectorDark,
                "markVectorLight", markVectorLight);
    }
    
    public final static class Builder {
 
        private Optional<String> logoDark = Optional.empty();
 
        private Optional<String> logoLight = Optional.empty();
 
        private Optional<String> logoVectorDark = Optional.empty();
 
        private Optional<String> logoVectorLight = Optional.empty();
 
        private Optional<String> markCompositeDark = Optional.empty();
 
        private Optional<String> markCompositeLight = Optional.empty();
 
        private Optional<String> markDark = Optional.empty();
 
        private Optional<String> markLight = Optional.empty();
 
        private Optional<String> markVectorCompositeDark = Optional.empty();
 
        private Optional<String> markVectorCompositeLight = Optional.empty();
 
        private Optional<String> markVectorDark = Optional.empty();
 
        private Optional<String> markVectorLight = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder logoDark(String logoDark) {
            Utils.checkNotNull(logoDark, "logoDark");
            this.logoDark = Optional.ofNullable(logoDark);
            return this;
        }

        public Builder logoDark(Optional<String> logoDark) {
            Utils.checkNotNull(logoDark, "logoDark");
            this.logoDark = logoDark;
            return this;
        }

        public Builder logoLight(String logoLight) {
            Utils.checkNotNull(logoLight, "logoLight");
            this.logoLight = Optional.ofNullable(logoLight);
            return this;
        }

        public Builder logoLight(Optional<String> logoLight) {
            Utils.checkNotNull(logoLight, "logoLight");
            this.logoLight = logoLight;
            return this;
        }

        public Builder logoVectorDark(String logoVectorDark) {
            Utils.checkNotNull(logoVectorDark, "logoVectorDark");
            this.logoVectorDark = Optional.ofNullable(logoVectorDark);
            return this;
        }

        public Builder logoVectorDark(Optional<String> logoVectorDark) {
            Utils.checkNotNull(logoVectorDark, "logoVectorDark");
            this.logoVectorDark = logoVectorDark;
            return this;
        }

        public Builder logoVectorLight(String logoVectorLight) {
            Utils.checkNotNull(logoVectorLight, "logoVectorLight");
            this.logoVectorLight = Optional.ofNullable(logoVectorLight);
            return this;
        }

        public Builder logoVectorLight(Optional<String> logoVectorLight) {
            Utils.checkNotNull(logoVectorLight, "logoVectorLight");
            this.logoVectorLight = logoVectorLight;
            return this;
        }

        public Builder markCompositeDark(String markCompositeDark) {
            Utils.checkNotNull(markCompositeDark, "markCompositeDark");
            this.markCompositeDark = Optional.ofNullable(markCompositeDark);
            return this;
        }

        public Builder markCompositeDark(Optional<String> markCompositeDark) {
            Utils.checkNotNull(markCompositeDark, "markCompositeDark");
            this.markCompositeDark = markCompositeDark;
            return this;
        }

        public Builder markCompositeLight(String markCompositeLight) {
            Utils.checkNotNull(markCompositeLight, "markCompositeLight");
            this.markCompositeLight = Optional.ofNullable(markCompositeLight);
            return this;
        }

        public Builder markCompositeLight(Optional<String> markCompositeLight) {
            Utils.checkNotNull(markCompositeLight, "markCompositeLight");
            this.markCompositeLight = markCompositeLight;
            return this;
        }

        public Builder markDark(String markDark) {
            Utils.checkNotNull(markDark, "markDark");
            this.markDark = Optional.ofNullable(markDark);
            return this;
        }

        public Builder markDark(Optional<String> markDark) {
            Utils.checkNotNull(markDark, "markDark");
            this.markDark = markDark;
            return this;
        }

        public Builder markLight(String markLight) {
            Utils.checkNotNull(markLight, "markLight");
            this.markLight = Optional.ofNullable(markLight);
            return this;
        }

        public Builder markLight(Optional<String> markLight) {
            Utils.checkNotNull(markLight, "markLight");
            this.markLight = markLight;
            return this;
        }

        public Builder markVectorCompositeDark(String markVectorCompositeDark) {
            Utils.checkNotNull(markVectorCompositeDark, "markVectorCompositeDark");
            this.markVectorCompositeDark = Optional.ofNullable(markVectorCompositeDark);
            return this;
        }

        public Builder markVectorCompositeDark(Optional<String> markVectorCompositeDark) {
            Utils.checkNotNull(markVectorCompositeDark, "markVectorCompositeDark");
            this.markVectorCompositeDark = markVectorCompositeDark;
            return this;
        }

        public Builder markVectorCompositeLight(String markVectorCompositeLight) {
            Utils.checkNotNull(markVectorCompositeLight, "markVectorCompositeLight");
            this.markVectorCompositeLight = Optional.ofNullable(markVectorCompositeLight);
            return this;
        }

        public Builder markVectorCompositeLight(Optional<String> markVectorCompositeLight) {
            Utils.checkNotNull(markVectorCompositeLight, "markVectorCompositeLight");
            this.markVectorCompositeLight = markVectorCompositeLight;
            return this;
        }

        public Builder markVectorDark(String markVectorDark) {
            Utils.checkNotNull(markVectorDark, "markVectorDark");
            this.markVectorDark = Optional.ofNullable(markVectorDark);
            return this;
        }

        public Builder markVectorDark(Optional<String> markVectorDark) {
            Utils.checkNotNull(markVectorDark, "markVectorDark");
            this.markVectorDark = markVectorDark;
            return this;
        }

        public Builder markVectorLight(String markVectorLight) {
            Utils.checkNotNull(markVectorLight, "markVectorLight");
            this.markVectorLight = Optional.ofNullable(markVectorLight);
            return this;
        }

        public Builder markVectorLight(Optional<String> markVectorLight) {
            Utils.checkNotNull(markVectorLight, "markVectorLight");
            this.markVectorLight = markVectorLight;
            return this;
        }
        
        public LogoapiLogoRevisionFiles build() {
            return new LogoapiLogoRevisionFiles(
                logoDark,
                logoLight,
                logoVectorDark,
                logoVectorLight,
                markCompositeDark,
                markCompositeLight,
                markDark,
                markLight,
                markVectorCompositeDark,
                markVectorCompositeLight,
                markVectorDark,
                markVectorLight);
        }
    }
}

