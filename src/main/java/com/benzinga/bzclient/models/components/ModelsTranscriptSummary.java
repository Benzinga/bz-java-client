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
import java.lang.Boolean;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class ModelsTranscriptSummary {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("call_id")
    private Optional<String> callId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created")
    private Optional<Long> created;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("date")
    private Optional<String> date;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reviewed")
    private Optional<Boolean> reviewed;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("security")
    private Optional<? extends ModelsSecurity> security;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start_time")
    private Optional<String> startTime;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("summaries")
    private Optional<? extends List<ModelsSummary>> summaries;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("summary_full")
    private Optional<String> summaryFull;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    private Optional<String> title;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("transcript_full")
    private Optional<String> transcriptFull;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("transcript_timestamped")
    private Optional<? extends List<ModelsTranscriptTimestamp>> transcriptTimestamped;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated")
    private Optional<Long> updated;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("user_id")
    private Optional<Long> userId;

    @JsonCreator
    public ModelsTranscriptSummary(
            @JsonProperty("call_id") Optional<String> callId,
            @JsonProperty("created") Optional<Long> created,
            @JsonProperty("date") Optional<String> date,
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("reviewed") Optional<Boolean> reviewed,
            @JsonProperty("security") Optional<? extends ModelsSecurity> security,
            @JsonProperty("start_time") Optional<String> startTime,
            @JsonProperty("summaries") Optional<? extends List<ModelsSummary>> summaries,
            @JsonProperty("summary_full") Optional<String> summaryFull,
            @JsonProperty("title") Optional<String> title,
            @JsonProperty("transcript_full") Optional<String> transcriptFull,
            @JsonProperty("transcript_timestamped") Optional<? extends List<ModelsTranscriptTimestamp>> transcriptTimestamped,
            @JsonProperty("updated") Optional<Long> updated,
            @JsonProperty("user_id") Optional<Long> userId) {
        Utils.checkNotNull(callId, "callId");
        Utils.checkNotNull(created, "created");
        Utils.checkNotNull(date, "date");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(reviewed, "reviewed");
        Utils.checkNotNull(security, "security");
        Utils.checkNotNull(startTime, "startTime");
        Utils.checkNotNull(summaries, "summaries");
        Utils.checkNotNull(summaryFull, "summaryFull");
        Utils.checkNotNull(title, "title");
        Utils.checkNotNull(transcriptFull, "transcriptFull");
        Utils.checkNotNull(transcriptTimestamped, "transcriptTimestamped");
        Utils.checkNotNull(updated, "updated");
        Utils.checkNotNull(userId, "userId");
        this.callId = callId;
        this.created = created;
        this.date = date;
        this.id = id;
        this.reviewed = reviewed;
        this.security = security;
        this.startTime = startTime;
        this.summaries = summaries;
        this.summaryFull = summaryFull;
        this.title = title;
        this.transcriptFull = transcriptFull;
        this.transcriptTimestamped = transcriptTimestamped;
        this.updated = updated;
        this.userId = userId;
    }
    
    public ModelsTranscriptSummary() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> callId() {
        return callId;
    }

    @JsonIgnore
    public Optional<Long> created() {
        return created;
    }

    @JsonIgnore
    public Optional<String> date() {
        return date;
    }

    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    @JsonIgnore
    public Optional<Boolean> reviewed() {
        return reviewed;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ModelsSecurity> security() {
        return (Optional<ModelsSecurity>) security;
    }

    @JsonIgnore
    public Optional<String> startTime() {
        return startTime;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<ModelsSummary>> summaries() {
        return (Optional<List<ModelsSummary>>) summaries;
    }

    @JsonIgnore
    public Optional<String> summaryFull() {
        return summaryFull;
    }

    @JsonIgnore
    public Optional<String> title() {
        return title;
    }

    @JsonIgnore
    public Optional<String> transcriptFull() {
        return transcriptFull;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<ModelsTranscriptTimestamp>> transcriptTimestamped() {
        return (Optional<List<ModelsTranscriptTimestamp>>) transcriptTimestamped;
    }

    @JsonIgnore
    public Optional<Long> updated() {
        return updated;
    }

    @JsonIgnore
    public Optional<Long> userId() {
        return userId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ModelsTranscriptSummary withCallId(String callId) {
        Utils.checkNotNull(callId, "callId");
        this.callId = Optional.ofNullable(callId);
        return this;
    }

    public ModelsTranscriptSummary withCallId(Optional<String> callId) {
        Utils.checkNotNull(callId, "callId");
        this.callId = callId;
        return this;
    }

    public ModelsTranscriptSummary withCreated(long created) {
        Utils.checkNotNull(created, "created");
        this.created = Optional.ofNullable(created);
        return this;
    }

    public ModelsTranscriptSummary withCreated(Optional<Long> created) {
        Utils.checkNotNull(created, "created");
        this.created = created;
        return this;
    }

    public ModelsTranscriptSummary withDate(String date) {
        Utils.checkNotNull(date, "date");
        this.date = Optional.ofNullable(date);
        return this;
    }

    public ModelsTranscriptSummary withDate(Optional<String> date) {
        Utils.checkNotNull(date, "date");
        this.date = date;
        return this;
    }

    public ModelsTranscriptSummary withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public ModelsTranscriptSummary withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public ModelsTranscriptSummary withReviewed(boolean reviewed) {
        Utils.checkNotNull(reviewed, "reviewed");
        this.reviewed = Optional.ofNullable(reviewed);
        return this;
    }

    public ModelsTranscriptSummary withReviewed(Optional<Boolean> reviewed) {
        Utils.checkNotNull(reviewed, "reviewed");
        this.reviewed = reviewed;
        return this;
    }

    public ModelsTranscriptSummary withSecurity(ModelsSecurity security) {
        Utils.checkNotNull(security, "security");
        this.security = Optional.ofNullable(security);
        return this;
    }

    public ModelsTranscriptSummary withSecurity(Optional<? extends ModelsSecurity> security) {
        Utils.checkNotNull(security, "security");
        this.security = security;
        return this;
    }

    public ModelsTranscriptSummary withStartTime(String startTime) {
        Utils.checkNotNull(startTime, "startTime");
        this.startTime = Optional.ofNullable(startTime);
        return this;
    }

    public ModelsTranscriptSummary withStartTime(Optional<String> startTime) {
        Utils.checkNotNull(startTime, "startTime");
        this.startTime = startTime;
        return this;
    }

    public ModelsTranscriptSummary withSummaries(List<ModelsSummary> summaries) {
        Utils.checkNotNull(summaries, "summaries");
        this.summaries = Optional.ofNullable(summaries);
        return this;
    }

    public ModelsTranscriptSummary withSummaries(Optional<? extends List<ModelsSummary>> summaries) {
        Utils.checkNotNull(summaries, "summaries");
        this.summaries = summaries;
        return this;
    }

    public ModelsTranscriptSummary withSummaryFull(String summaryFull) {
        Utils.checkNotNull(summaryFull, "summaryFull");
        this.summaryFull = Optional.ofNullable(summaryFull);
        return this;
    }

    public ModelsTranscriptSummary withSummaryFull(Optional<String> summaryFull) {
        Utils.checkNotNull(summaryFull, "summaryFull");
        this.summaryFull = summaryFull;
        return this;
    }

    public ModelsTranscriptSummary withTitle(String title) {
        Utils.checkNotNull(title, "title");
        this.title = Optional.ofNullable(title);
        return this;
    }

    public ModelsTranscriptSummary withTitle(Optional<String> title) {
        Utils.checkNotNull(title, "title");
        this.title = title;
        return this;
    }

    public ModelsTranscriptSummary withTranscriptFull(String transcriptFull) {
        Utils.checkNotNull(transcriptFull, "transcriptFull");
        this.transcriptFull = Optional.ofNullable(transcriptFull);
        return this;
    }

    public ModelsTranscriptSummary withTranscriptFull(Optional<String> transcriptFull) {
        Utils.checkNotNull(transcriptFull, "transcriptFull");
        this.transcriptFull = transcriptFull;
        return this;
    }

    public ModelsTranscriptSummary withTranscriptTimestamped(List<ModelsTranscriptTimestamp> transcriptTimestamped) {
        Utils.checkNotNull(transcriptTimestamped, "transcriptTimestamped");
        this.transcriptTimestamped = Optional.ofNullable(transcriptTimestamped);
        return this;
    }

    public ModelsTranscriptSummary withTranscriptTimestamped(Optional<? extends List<ModelsTranscriptTimestamp>> transcriptTimestamped) {
        Utils.checkNotNull(transcriptTimestamped, "transcriptTimestamped");
        this.transcriptTimestamped = transcriptTimestamped;
        return this;
    }

    public ModelsTranscriptSummary withUpdated(long updated) {
        Utils.checkNotNull(updated, "updated");
        this.updated = Optional.ofNullable(updated);
        return this;
    }

    public ModelsTranscriptSummary withUpdated(Optional<Long> updated) {
        Utils.checkNotNull(updated, "updated");
        this.updated = updated;
        return this;
    }

    public ModelsTranscriptSummary withUserId(long userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = Optional.ofNullable(userId);
        return this;
    }

    public ModelsTranscriptSummary withUserId(Optional<Long> userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = userId;
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
        ModelsTranscriptSummary other = (ModelsTranscriptSummary) o;
        return 
            Objects.deepEquals(this.callId, other.callId) &&
            Objects.deepEquals(this.created, other.created) &&
            Objects.deepEquals(this.date, other.date) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.reviewed, other.reviewed) &&
            Objects.deepEquals(this.security, other.security) &&
            Objects.deepEquals(this.startTime, other.startTime) &&
            Objects.deepEquals(this.summaries, other.summaries) &&
            Objects.deepEquals(this.summaryFull, other.summaryFull) &&
            Objects.deepEquals(this.title, other.title) &&
            Objects.deepEquals(this.transcriptFull, other.transcriptFull) &&
            Objects.deepEquals(this.transcriptTimestamped, other.transcriptTimestamped) &&
            Objects.deepEquals(this.updated, other.updated) &&
            Objects.deepEquals(this.userId, other.userId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            callId,
            created,
            date,
            id,
            reviewed,
            security,
            startTime,
            summaries,
            summaryFull,
            title,
            transcriptFull,
            transcriptTimestamped,
            updated,
            userId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ModelsTranscriptSummary.class,
                "callId", callId,
                "created", created,
                "date", date,
                "id", id,
                "reviewed", reviewed,
                "security", security,
                "startTime", startTime,
                "summaries", summaries,
                "summaryFull", summaryFull,
                "title", title,
                "transcriptFull", transcriptFull,
                "transcriptTimestamped", transcriptTimestamped,
                "updated", updated,
                "userId", userId);
    }
    
    public final static class Builder {
 
        private Optional<String> callId = Optional.empty();
 
        private Optional<Long> created = Optional.empty();
 
        private Optional<String> date = Optional.empty();
 
        private Optional<String> id = Optional.empty();
 
        private Optional<Boolean> reviewed = Optional.empty();
 
        private Optional<? extends ModelsSecurity> security = Optional.empty();
 
        private Optional<String> startTime = Optional.empty();
 
        private Optional<? extends List<ModelsSummary>> summaries = Optional.empty();
 
        private Optional<String> summaryFull = Optional.empty();
 
        private Optional<String> title = Optional.empty();
 
        private Optional<String> transcriptFull = Optional.empty();
 
        private Optional<? extends List<ModelsTranscriptTimestamp>> transcriptTimestamped = Optional.empty();
 
        private Optional<Long> updated = Optional.empty();
 
        private Optional<Long> userId = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder callId(String callId) {
            Utils.checkNotNull(callId, "callId");
            this.callId = Optional.ofNullable(callId);
            return this;
        }

        public Builder callId(Optional<String> callId) {
            Utils.checkNotNull(callId, "callId");
            this.callId = callId;
            return this;
        }

        public Builder created(long created) {
            Utils.checkNotNull(created, "created");
            this.created = Optional.ofNullable(created);
            return this;
        }

        public Builder created(Optional<Long> created) {
            Utils.checkNotNull(created, "created");
            this.created = created;
            return this;
        }

        public Builder date(String date) {
            Utils.checkNotNull(date, "date");
            this.date = Optional.ofNullable(date);
            return this;
        }

        public Builder date(Optional<String> date) {
            Utils.checkNotNull(date, "date");
            this.date = date;
            return this;
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        public Builder id(Optional<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder reviewed(boolean reviewed) {
            Utils.checkNotNull(reviewed, "reviewed");
            this.reviewed = Optional.ofNullable(reviewed);
            return this;
        }

        public Builder reviewed(Optional<Boolean> reviewed) {
            Utils.checkNotNull(reviewed, "reviewed");
            this.reviewed = reviewed;
            return this;
        }

        public Builder security(ModelsSecurity security) {
            Utils.checkNotNull(security, "security");
            this.security = Optional.ofNullable(security);
            return this;
        }

        public Builder security(Optional<? extends ModelsSecurity> security) {
            Utils.checkNotNull(security, "security");
            this.security = security;
            return this;
        }

        public Builder startTime(String startTime) {
            Utils.checkNotNull(startTime, "startTime");
            this.startTime = Optional.ofNullable(startTime);
            return this;
        }

        public Builder startTime(Optional<String> startTime) {
            Utils.checkNotNull(startTime, "startTime");
            this.startTime = startTime;
            return this;
        }

        public Builder summaries(List<ModelsSummary> summaries) {
            Utils.checkNotNull(summaries, "summaries");
            this.summaries = Optional.ofNullable(summaries);
            return this;
        }

        public Builder summaries(Optional<? extends List<ModelsSummary>> summaries) {
            Utils.checkNotNull(summaries, "summaries");
            this.summaries = summaries;
            return this;
        }

        public Builder summaryFull(String summaryFull) {
            Utils.checkNotNull(summaryFull, "summaryFull");
            this.summaryFull = Optional.ofNullable(summaryFull);
            return this;
        }

        public Builder summaryFull(Optional<String> summaryFull) {
            Utils.checkNotNull(summaryFull, "summaryFull");
            this.summaryFull = summaryFull;
            return this;
        }

        public Builder title(String title) {
            Utils.checkNotNull(title, "title");
            this.title = Optional.ofNullable(title);
            return this;
        }

        public Builder title(Optional<String> title) {
            Utils.checkNotNull(title, "title");
            this.title = title;
            return this;
        }

        public Builder transcriptFull(String transcriptFull) {
            Utils.checkNotNull(transcriptFull, "transcriptFull");
            this.transcriptFull = Optional.ofNullable(transcriptFull);
            return this;
        }

        public Builder transcriptFull(Optional<String> transcriptFull) {
            Utils.checkNotNull(transcriptFull, "transcriptFull");
            this.transcriptFull = transcriptFull;
            return this;
        }

        public Builder transcriptTimestamped(List<ModelsTranscriptTimestamp> transcriptTimestamped) {
            Utils.checkNotNull(transcriptTimestamped, "transcriptTimestamped");
            this.transcriptTimestamped = Optional.ofNullable(transcriptTimestamped);
            return this;
        }

        public Builder transcriptTimestamped(Optional<? extends List<ModelsTranscriptTimestamp>> transcriptTimestamped) {
            Utils.checkNotNull(transcriptTimestamped, "transcriptTimestamped");
            this.transcriptTimestamped = transcriptTimestamped;
            return this;
        }

        public Builder updated(long updated) {
            Utils.checkNotNull(updated, "updated");
            this.updated = Optional.ofNullable(updated);
            return this;
        }

        public Builder updated(Optional<Long> updated) {
            Utils.checkNotNull(updated, "updated");
            this.updated = updated;
            return this;
        }

        public Builder userId(long userId) {
            Utils.checkNotNull(userId, "userId");
            this.userId = Optional.ofNullable(userId);
            return this;
        }

        public Builder userId(Optional<Long> userId) {
            Utils.checkNotNull(userId, "userId");
            this.userId = userId;
            return this;
        }
        
        public ModelsTranscriptSummary build() {
            return new ModelsTranscriptSummary(
                callId,
                created,
                date,
                id,
                reviewed,
                security,
                startTime,
                summaries,
                summaryFull,
                title,
                transcriptFull,
                transcriptTimestamped,
                updated,
                userId);
        }
    }
}

