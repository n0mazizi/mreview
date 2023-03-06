//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.zerock.mreview.entity;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@MappedSuperclass
@EntityListeners({AuditingEntityListener.class})
abstract class BaseEntity {
    @CreatedDate
    @Column(
            name = "regdate",
            updatable = false
    )
    private LocalDateTime regDate;
    @LastModifiedDate
    @Column(
            name = "moddate"
    )
    private LocalDateTime modDate;

    BaseEntity() {
    }

    public LocalDateTime getRegDate() {
        return this.regDate;
    }

    public LocalDateTime getModDate() {
        return this.modDate;
    }
}
