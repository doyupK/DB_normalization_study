package com.supercarmarket.dev.domain;

import com.supercarmarket.dev.domain.enumData.PartnerInquiryCategoryEnum;
import com.supercarmarket.dev.domain.enumData.PartnerInquiryStatusEnum;
import lombok.*;

import javax.persistence.*;
@Builder
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
public class PartnerInquiry extends TimeStamped{
    @Id
    @GeneratedValue
    Long seq;

    @ManyToOne
    User user;

    String title;
    String contents;
    String attachmentUrl;
    PartnerInquiryStatusEnum partnerInquiryStatusEnum;
    PartnerInquiryCategoryEnum partnerInquiryCategoryEnum;

}
