package com.supercarmarket_test.dev.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import java.time.LocalDateTime;


@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Table(name="create_datetime")
public abstract class TimeStamped {


    @CreatedDate
    private LocalDateTime create_datetime;

    @LastModifiedDate
    private LocalDateTime modified_datetime;

}