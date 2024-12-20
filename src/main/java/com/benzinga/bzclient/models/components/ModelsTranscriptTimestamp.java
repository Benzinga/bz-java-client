/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.benzinga.bzclient.models.components;


import com.benzinga.bzclient.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class ModelsTranscriptTimestamp {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("time")
    private Optional<Double> time;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("transcript")
    private Optional<String> transcript;

    @JsonCreator
    public ModelsTranscriptTimestamp(
            @JsonProperty("time") Optional<Double> time,
            @JsonProperty("transcript") Optional<String> transcript) {
        Utils.checkNotNull(time, "time");
        Utils.checkNotNull(transcript, "transcript");
        this.time = time;
        this.transcript = transcript;
    }
    
    public ModelsTranscriptTimestamp() {
        this(Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<Double> time() {
        return time;
    }

    @JsonIgnore
    public Optional<String> transcript() {
        return transcript;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ModelsTranscriptTimestamp withTime(double time) {
        Utils.checkNotNull(time, "time");
        this.time = Optional.ofNullable(time);
        return this;
    }

    public ModelsTranscriptTimestamp withTime(Optional<Double> time) {
        Utils.checkNotNull(time, "time");
        this.time = time;
        return this;
    }

    public ModelsTranscriptTimestamp withTranscript(String transcript) {
        Utils.checkNotNull(transcript, "transcript");
        this.transcript = Optional.ofNullable(transcript);
        return this;
    }

    public ModelsTranscriptTimestamp withTranscript(Optional<String> transcript) {
        Utils.checkNotNull(transcript, "transcript");
        this.transcript = transcript;
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
        ModelsTranscriptTimestamp other = (ModelsTranscriptTimestamp) o;
        return 
            Objects.deepEquals(this.time, other.time) &&
            Objects.deepEquals(this.transcript, other.transcript);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            time,
            transcript);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ModelsTranscriptTimestamp.class,
                "time", time,
                "transcript", transcript);
    }
    
    public final static class Builder {
 
        private Optional<Double> time = Optional.empty();
 
        private Optional<String> transcript = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder time(double time) {
            Utils.checkNotNull(time, "time");
            this.time = Optional.ofNullable(time);
            return this;
        }

        public Builder time(Optional<Double> time) {
            Utils.checkNotNull(time, "time");
            this.time = time;
            return this;
        }

        public Builder transcript(String transcript) {
            Utils.checkNotNull(transcript, "transcript");
            this.transcript = Optional.ofNullable(transcript);
            return this;
        }

        public Builder transcript(Optional<String> transcript) {
            Utils.checkNotNull(transcript, "transcript");
            this.transcript = transcript;
            return this;
        }
        
        public ModelsTranscriptTimestamp build() {
            return new ModelsTranscriptTimestamp(
                time,
                transcript);
        }
    }
}

