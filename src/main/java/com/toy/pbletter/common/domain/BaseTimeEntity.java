package com.toy.pbletter.common.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseTimeEntity
{
    @CreatedDate
    @JsonIgnore
    @Column(updatable = false)
    protected LocalDateTime createDate;

    @LastModifiedDate
    @JsonIgnore
    protected LocalDateTime updateDate;
}
