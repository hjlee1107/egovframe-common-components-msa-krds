package egovframework.com.uss.olp.qri.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Immutable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity(name="qriQustnrRespondInfo")
@Getter
@Setter
@Table(name="COMTNQUSTNRRESPONDINFO")
@Immutable
public class QustnrRespondInfo {

    /** 설문응답자아이디 */
    @EmbeddedId
    private QustnrRespondInfoId qustnrRespondInfoId;

    /** 성별코드 */
    @Column(name="SEXDSTN_CODE")
    private String sexdstnCode;

    /** 직업유형코드 */
    @Column(name="OCCP_TY_CODE")
    private String occpTyCode;

    /** 응답자명 */
    @Column(name="RESPOND_NM")
    private String respondNm;

    /** 생년월일 */
    @Column(name="BRTHDY")
    private String brthdy;

    /** 첫번째전화번호 */
    @Column(name="AREA_NO")
    private String areaNo;

    /** 두번째전화번호 */
    @Column(name="MIDDLE_TELNO")
    private String middleTelno;

    /** 마지막전화번호 */
    @Column(name="END_TELNO")
    private String endTelno;

    /** 최초등록시점 */
    @Column(name="FRST_REGIST_PNTTM")
    private LocalDateTime frstRegistPnttm;

    /** 최초등록자아이디 */
    @Column(name="FRST_REGISTER_ID")
    private String frstRegisterId;

    /** 최종수정시점 */
    @Column(name="LAST_UPDT_PNTTM")
    private LocalDateTime lastUpdtPnttm;

    /** 최종수정시점아이디  */
    @Column(name="LAST_UPDUSR_ID")
    private String lastUpdusrId;

}
