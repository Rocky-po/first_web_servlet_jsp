package entities;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

@NamedStoredProcedureQueries(
        @NamedStoredProcedureQuery(
                name = "CallProspectCardQueries",
                procedureName = "TERN_ANALYTICS.USER_INTERFACE.f_get_prospect_card",
                resultClasses = {TernAnalytics.class},
                parameters = {
//                        cursor parameter?
                        @StoredProcedureParameter(name = "p_id_prospect_in", type = Integer.class, mode = ParameterMode.IN),
                        @StoredProcedureParameter(name = "p_session_in", type = String.class, mode = ParameterMode.IN),
                        @StoredProcedureParameter(name = "p_error", type = String.class, mode = ParameterMode.OUT)
                }
        )
)
@Entity
public class TernAnalytics implements Serializable {

    @Id
    @Column(name = "PROSPECT_ID")
    private BigDecimal prospectId;

    @Column(name = "PROSPECT_CREATE_DATE")
    private Timestamp prospectCreateDate;

    @Column(name = "PROSPECT_UPDATE_DATE")
    private Timestamp prospectUpdateTime;

    @Column(name = "PROSPECT_TYPE")
    private String prospectType;

    @Column(name = "NAME_FULL")
    private String nameFull;

    @Column(name = "NAME_SHORT")
    private String nameShort;

    @Column(name = "NAME_CLEAR")
    private String nameClear;

    @Column(name = "NAME_SIMPLE")
    private String nameSimple;

    @Column(name = "NAME_STD_PART")
    private String nameStdPart;

    @Column(name = "NAME_OLD")
    private String nameOld;

    @Column(name = "ADDRESS_REGION_CODE")
    private String addressRegionCode;

    @Column(name = "ADDRESS_FULL_NAME")
    private String addressFullName;

    @Column(name = "ADDRESS_FULL_NAME_IN_VIEW")
    private String addressFullNameInView;

    @Column(name = "STOP_DATE")
    private Timestamp stopDate;

    @Column(name = "STOP_CODE")
    private String stopCode;

    @Column(name = "STOP_NAME")
    private String stopName;

    @Column(name = "STOP_REG_CODE")
    private String stopRegCode;

    @Column(name = "STOP_REG_NAME")
    private String stopRegName;

    @Column(name = "SHARE_OOO_VALUE_RUB")
    private BigDecimal shareOooValueRub;

    @Column(name = "SHARE_OOO_PERCENT")
    private BigDecimal shareOooPercent;

    @Column(name = "AUTH_CAP_NAME")
    private String authCapName;

    @Column(name = "AUTH_CAP_VALUE_RUB")
    private BigDecimal authCapValueRub;

    @Column(name = "AUTH_CAP_DEC_VALUE")
    private BigDecimal authCapDecValue;

    @Column(name = "AUTH_CAP_DEC_DATE")
    private Timestamp authCapDecDate;

    @Column(name = "STD_CHARTER_ACT_TYPE")
    private String stdCharterActType;

    @Column(name = "STD_CHARTER_ACT_DATE")
    private Timestamp stdCharterActDate;

    @Column(name = "STD_CHARTER_ORG")
    private String stdCharterOrg;

    @Column(name = "STD_CHARTER_ACT_NAME")
    private String stdCharterActName;

    @Column(name = "STD_CHARTER_ACT_NUM")
    private String stdCharterActNum;

    @Column(name = "STD_CHARTER_ACT_ATTACH_NUM")
    private String stdCharterActAttachNum;

    @Column(name = "REG_HOLDER_OGRN")
    private String regHolderOgrn;

    @Column(name = "REG_HOLDER_INN")
    private String regHolderInn;

    @Column(name = "REG_HOLDER_NAME_FULL")
    private String regHolderNameFull;

    @Column(name = "TAX_REC_DATE")
    private Timestamp taxRecDate;

    @Column(name = "TAX_REC_INN")
    private String taxRecInn;

    @Column(name = "OGRN")
    private String ogrn;

    @Column(name = "OGRN_DATE")
    private Timestamp ogrnDate;

    @Column(name = "INN")
    private String inn;

    @Column(name = "KPP")
    private String kpp;

    @Column(name = "OPF_SPR_NAME")
    private String opfSprName;

    @Column(name = "OPF_CODE")
    private String opfCode;

    @Column(name = "OPF_TYPE_NAME")
    private String opfTypeName;

    @Column(name = "REG_ORG_NAME")
    private String regOrgName;

    @Column(name = "REG_ORG_ADDRESS")
    private String regOrgAddress;

    @Column(name = "REG_PF_DATE")
    private Timestamp regPfDate;

    @Column(name = "REG_PF_NUMBER")
    private String regPfNumber;

    @Column(name = "REG_PF_CODE")
    private String regPfCode;

    @Column(name = "REG_PF_NAME")
    private String regPfName;

    @Column(name = "REG_FSS_DATE")
    private Timestamp regFssDate;

    @Column(name = "REG_FSS_NUMBER")
    private String regFssNumber;

    @Column(name = "REG_FSS_CODE")
    private String regFssCode;

    @Column(name = "REG_FSS_NAME")
    private String regFssName;

    @Column(name = "SANCTION_LIST")
    private String sanctionList;

    @Column(name = "STATUS_COMPANY")
    private String statusCompany;

    @Column(name = "STATUS_COMPANY_FLAG")
    private String statusCompanyFlag;

    @Column(name = "STATUS_COMPANY_V2")
    private String statusCompanyV2;

    @Column(name = "STATUS_COMPANY_FLAG_V2")
    private String statusCompanyFlagV2;

    @Column(name = "ESTABLISHING_METHOD_NAME")
    private String establishingMethodName;

    @Column(name = "ESTABLISHING_METHOD_DATE")
    private Timestamp establishingMethodDate;

    @Column(name = "ESTABLISHING_CODE_B_2002")
    private String establishingCodeB2002;

    @Column(name = "ESTABLISHED_DEPARTMENT_B_2002")
    private String establishedDepartmentB2002;

    // TODO: 05.09.2019 repetition error in DB
    @Column(name = "STATUS_COMPANY")
    private String statusCompany2;

    // TODO: 05.09.2019 repetition error in DB
    @Column(name = "STATUS_COMPANY_FLAG")
    private String statusCompanyFlag2;

    @Column(name = "MSP")
    private String msp;

    @Column(name = "CHECK_PACKET_LIST")
    private String checkPacketList;

    @Column(name = "MONITORING")
    private String monitoring;

    @Column(name = "CHECK_PACKET_STATUS")
    private String checkPacketStatus;

    @Column(name = "CHECK_PACKET_LIST_ID")
    private BigDecimal checkPacketListId;

    @Column(name = "CHECK_PACKET_DATA_ID")
    private BigDecimal checkPacketDataId;

    @Column(name = "FNS_DEBT")
    private Timestamp fnsDebt;

    @Column(name = "FNS_REPORTING")
    private Timestamp fnsReporting;

    @Column(name = "BAD_BOYS")
    private String badBoys;

    @Column(name = "IS_BANK")
    private String isBank;

    @Column(name = "BANK_REG_NUMBER")
    private String bankRegNumber;

    @Column(name = "EGRUL_MASS_ADDRESS")
    private String egrulMassAddress;

    @Column(name = "EGRUL_MASS_ADDRESS_COUNT")
    private BigDecimal egrulMassAddressCount;

    // TODO: 05.09.2019 repetition error in DB
    @Column(name = "SANCTION_LIST")
    private String sanctionList2;

    // TODO: 05.09.2019 repetition error in DB
    @Column(name = "EGRUL_MASS_ADDRESS")
    private String egrulMassAddress2;

    // TODO: 05.09.2019 repetition error in DB
    @Column(name = "EGRUL_MASS_ADDRESS_COUNT")
    private BigDecimal egrulMassAddressCount2;

    @Column(name = "IS_INSURANCE")
    private String isInsurance;

    @Column(name = "INVALID_ADDR_DECISION_DATE")
    private Timestamp invalidAddrDecisionDate;

    @Column(name = "INVALID_ADDR_COURT_NAME")
    private String invalidAddrCourtName;

    @Column(name = "INVALID_ADDR_DECISION_NUMBER")
    private String invalidAddrDecisionNumber;

    public BigDecimal getProspectId() {
        return prospectId;
    }

    public void setProspectId(BigDecimal prospectId) {
        this.prospectId = prospectId;
    }

    public Timestamp getProspectCreateDate() {
        return prospectCreateDate;
    }

    public void setProspectCreateDate(Timestamp prospectCreateDate) {
        this.prospectCreateDate = prospectCreateDate;
    }

    public Timestamp getProspectUpdateTime() {
        return prospectUpdateTime;
    }

    public void setProspectUpdateTime(Timestamp prospectUpdateTime) {
        this.prospectUpdateTime = prospectUpdateTime;
    }

    public String getProspectType() {
        return prospectType;
    }

    public void setProspectType(String prospectType) {
        this.prospectType = prospectType;
    }

    public String getNameFull() {
        return nameFull;
    }

    public void setNameFull(String nameFull) {
        this.nameFull = nameFull;
    }

    public String getNameShort() {
        return nameShort;
    }

    public void setNameShort(String nameShort) {
        this.nameShort = nameShort;
    }

    public String getNameClear() {
        return nameClear;
    }

    public void setNameClear(String nameClear) {
        this.nameClear = nameClear;
    }

    public String getNameSimple() {
        return nameSimple;
    }

    public void setNameSimple(String nameSimple) {
        this.nameSimple = nameSimple;
    }

    public String getNameStdPart() {
        return nameStdPart;
    }

    public void setNameStdPart(String nameStdPart) {
        this.nameStdPart = nameStdPart;
    }

    public String getNameOld() {
        return nameOld;
    }

    public void setNameOld(String nameOld) {
        this.nameOld = nameOld;
    }

    public String getAddressRegionCode() {
        return addressRegionCode;
    }

    public void setAddressRegionCode(String addressRegionCode) {
        this.addressRegionCode = addressRegionCode;
    }

    public String getAddressFullName() {
        return addressFullName;
    }

    public void setAddressFullName(String addressFullName) {
        this.addressFullName = addressFullName;
    }

    public String getAddressFullNameInView() {
        return addressFullNameInView;
    }

    public void setAddressFullNameInView(String addressFullNameInView) {
        this.addressFullNameInView = addressFullNameInView;
    }

    public Timestamp getStopDate() {
        return stopDate;
    }

    public void setStopDate(Timestamp stopDate) {
        this.stopDate = stopDate;
    }

    public String getStopCode() {
        return stopCode;
    }

    public void setStopCode(String stopCode) {
        this.stopCode = stopCode;
    }

    public String getStopName() {
        return stopName;
    }

    public void setStopName(String stopName) {
        this.stopName = stopName;
    }

    public String getStopRegCode() {
        return stopRegCode;
    }

    public void setStopRegCode(String stopRegCode) {
        this.stopRegCode = stopRegCode;
    }

    public String getStopRegName() {
        return stopRegName;
    }

    public void setStopRegName(String stopRegName) {
        this.stopRegName = stopRegName;
    }

    public BigDecimal getShareOooValueRub() {
        return shareOooValueRub;
    }

    public void setShareOooValueRub(BigDecimal shareOooValueRub) {
        this.shareOooValueRub = shareOooValueRub;
    }

    public BigDecimal getShareOooPercent() {
        return shareOooPercent;
    }

    public void setShareOooPercent(BigDecimal shareOooPercent) {
        this.shareOooPercent = shareOooPercent;
    }

    public String getAuthCapName() {
        return authCapName;
    }

    public void setAuthCapName(String authCapName) {
        this.authCapName = authCapName;
    }

    public BigDecimal getAuthCapValueRub() {
        return authCapValueRub;
    }

    public void setAuthCapValueRub(BigDecimal authCapValueRub) {
        this.authCapValueRub = authCapValueRub;
    }

    public BigDecimal getAuthCapDecValue() {
        return authCapDecValue;
    }

    public void setAuthCapDecValue(BigDecimal authCapDecValue) {
        this.authCapDecValue = authCapDecValue;
    }

    public Timestamp getAuthCapDecDate() {
        return authCapDecDate;
    }

    public void setAuthCapDecDate(Timestamp authCapDecDate) {
        this.authCapDecDate = authCapDecDate;
    }

    public String getStdCharterActType() {
        return stdCharterActType;
    }

    public void setStdCharterActType(String stdCharterActType) {
        this.stdCharterActType = stdCharterActType;
    }

    public Timestamp getStdCharterActDate() {
        return stdCharterActDate;
    }

    public void setStdCharterActDate(Timestamp stdCharterActDate) {
        this.stdCharterActDate = stdCharterActDate;
    }

    public String getStdCharterOrg() {
        return stdCharterOrg;
    }

    public void setStdCharterOrg(String stdCharterOrg) {
        this.stdCharterOrg = stdCharterOrg;
    }

    public String getStdCharterActName() {
        return stdCharterActName;
    }

    public void setStdCharterActName(String stdCharterActName) {
        this.stdCharterActName = stdCharterActName;
    }

    public String getStdCharterActNum() {
        return stdCharterActNum;
    }

    public void setStdCharterActNum(String stdCharterActNum) {
        this.stdCharterActNum = stdCharterActNum;
    }

    public String getStdCharterActAttachNum() {
        return stdCharterActAttachNum;
    }

    public void setStdCharterActAttachNum(String stdCharterActAttachNum) {
        this.stdCharterActAttachNum = stdCharterActAttachNum;
    }

    public String getRegHolderOgrn() {
        return regHolderOgrn;
    }

    public void setRegHolderOgrn(String regHolderOgrn) {
        this.regHolderOgrn = regHolderOgrn;
    }

    public String getRegHolderInn() {
        return regHolderInn;
    }

    public void setRegHolderInn(String regHolderInn) {
        this.regHolderInn = regHolderInn;
    }

    public String getRegHolderNameFull() {
        return regHolderNameFull;
    }

    public void setRegHolderNameFull(String regHolderNameFull) {
        this.regHolderNameFull = regHolderNameFull;
    }

    public Timestamp getTaxRecDate() {
        return taxRecDate;
    }

    public void setTaxRecDate(Timestamp taxRecDate) {
        this.taxRecDate = taxRecDate;
    }

    public String getTaxRecInn() {
        return taxRecInn;
    }

    public void setTaxRecInn(String taxRecInn) {
        this.taxRecInn = taxRecInn;
    }

    public String getOgrn() {
        return ogrn;
    }

    public void setOgrn(String ogrn) {
        this.ogrn = ogrn;
    }

    public Timestamp getOgrnDate() {
        return ogrnDate;
    }

    public void setOgrnDate(Timestamp ogrnDate) {
        this.ogrnDate = ogrnDate;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getKpp() {
        return kpp;
    }

    public void setKpp(String kpp) {
        this.kpp = kpp;
    }

    public String getOpfSprName() {
        return opfSprName;
    }

    public void setOpfSprName(String opfSprName) {
        this.opfSprName = opfSprName;
    }

    public String getOpfCode() {
        return opfCode;
    }

    public void setOpfCode(String opfCode) {
        this.opfCode = opfCode;
    }

    public String getOpfTypeName() {
        return opfTypeName;
    }

    public void setOpfTypeName(String opfTypeName) {
        this.opfTypeName = opfTypeName;
    }

    public String getRegOrgName() {
        return regOrgName;
    }

    public void setRegOrgName(String regOrgName) {
        this.regOrgName = regOrgName;
    }

    public String getRegOrgAddress() {
        return regOrgAddress;
    }

    public void setRegOrgAddress(String regOrgAddress) {
        this.regOrgAddress = regOrgAddress;
    }

    public Timestamp getRegPfDate() {
        return regPfDate;
    }

    public void setRegPfDate(Timestamp regPfDate) {
        this.regPfDate = regPfDate;
    }

    public String getRegPfNumber() {
        return regPfNumber;
    }

    public void setRegPfNumber(String regPfNumber) {
        this.regPfNumber = regPfNumber;
    }

    public String getRegPfCode() {
        return regPfCode;
    }

    public void setRegPfCode(String regPfCode) {
        this.regPfCode = regPfCode;
    }

    public String getRegPfName() {
        return regPfName;
    }

    public void setRegPfName(String regPfName) {
        this.regPfName = regPfName;
    }

    public Timestamp getRegFssDate() {
        return regFssDate;
    }

    public void setRegFssDate(Timestamp regFssDate) {
        this.regFssDate = regFssDate;
    }

    public String getRegFssNumber() {
        return regFssNumber;
    }

    public void setRegFssNumber(String regFssNumber) {
        this.regFssNumber = regFssNumber;
    }

    public String getRegFssCode() {
        return regFssCode;
    }

    public void setRegFssCode(String regFssCode) {
        this.regFssCode = regFssCode;
    }

    public String getRegFssName() {
        return regFssName;
    }

    public void setRegFssName(String regFssName) {
        this.regFssName = regFssName;
    }

    public String getSanctionList() {
        return sanctionList;
    }

    public void setSanctionList(String sanctionList) {
        this.sanctionList = sanctionList;
    }

    public String getStatusCompany() {
        return statusCompany;
    }

    public void setStatusCompany(String statusCompany) {
        this.statusCompany = statusCompany;
    }

    public String getStatusCompanyFlag() {
        return statusCompanyFlag;
    }

    public void setStatusCompanyFlag(String statusCompanyFlag) {
        this.statusCompanyFlag = statusCompanyFlag;
    }

    public String getStatusCompanyV2() {
        return statusCompanyV2;
    }

    public void setStatusCompanyV2(String statusCompanyV2) {
        this.statusCompanyV2 = statusCompanyV2;
    }

    public String getStatusCompanyFlagV2() {
        return statusCompanyFlagV2;
    }

    public void setStatusCompanyFlagV2(String statusCompanyFlagV2) {
        this.statusCompanyFlagV2 = statusCompanyFlagV2;
    }

    public String getEstablishingMethodName() {
        return establishingMethodName;
    }

    public void setEstablishingMethodName(String establishingMethodName) {
        this.establishingMethodName = establishingMethodName;
    }

    public Timestamp getEstablishingMethodDate() {
        return establishingMethodDate;
    }

    public void setEstablishingMethodDate(Timestamp establishingMethodDate) {
        this.establishingMethodDate = establishingMethodDate;
    }

    public String getEstablishingCodeB2002() {
        return establishingCodeB2002;
    }

    public void setEstablishingCodeB2002(String establishingCodeB2002) {
        this.establishingCodeB2002 = establishingCodeB2002;
    }

    public String getEstablishedDepartmentB2002() {
        return establishedDepartmentB2002;
    }

    public void setEstablishedDepartmentB2002(String establishedDepartmentB2002) {
        this.establishedDepartmentB2002 = establishedDepartmentB2002;
    }

    public String getStatusCompany2() {
        return statusCompany2;
    }

    public void setStatusCompany2(String statusCompany2) {
        this.statusCompany2 = statusCompany2;
    }

    public String getStatusCompanyFlag2() {
        return statusCompanyFlag2;
    }

    public void setStatusCompanyFlag2(String statusCompanyFlag2) {
        this.statusCompanyFlag2 = statusCompanyFlag2;
    }

    public String getMsp() {
        return msp;
    }

    public void setMsp(String msp) {
        this.msp = msp;
    }

    public String getCheckPacketList() {
        return checkPacketList;
    }

    public void setCheckPacketList(String checkPacketList) {
        this.checkPacketList = checkPacketList;
    }

    public String getMonitoring() {
        return monitoring;
    }

    public void setMonitoring(String monitoring) {
        this.monitoring = monitoring;
    }

    public String getCheckPacketStatus() {
        return checkPacketStatus;
    }

    public void setCheckPacketStatus(String checkPacketStatus) {
        this.checkPacketStatus = checkPacketStatus;
    }

    public BigDecimal getCheckPacketListId() {
        return checkPacketListId;
    }

    public void setCheckPacketListId(BigDecimal checkPacketListId) {
        this.checkPacketListId = checkPacketListId;
    }

    public BigDecimal getCheckPacketDataId() {
        return checkPacketDataId;
    }

    public void setCheckPacketDataId(BigDecimal checkPacketDataId) {
        this.checkPacketDataId = checkPacketDataId;
    }

    public Timestamp getFnsDebt() {
        return fnsDebt;
    }

    public void setFnsDebt(Timestamp fnsDebt) {
        this.fnsDebt = fnsDebt;
    }

    public Timestamp getFnsReporting() {
        return fnsReporting;
    }

    public void setFnsReporting(Timestamp fnsReporting) {
        this.fnsReporting = fnsReporting;
    }

    public String getBadBoys() {
        return badBoys;
    }

    public void setBadBoys(String badBoys) {
        this.badBoys = badBoys;
    }

    public String getIsBank() {
        return isBank;
    }

    public void setIsBank(String isBank) {
        this.isBank = isBank;
    }

    public String getBankRegNumber() {
        return bankRegNumber;
    }

    public void setBankRegNumber(String bankRegNumber) {
        this.bankRegNumber = bankRegNumber;
    }

    public String getEgrulMassAddress() {
        return egrulMassAddress;
    }

    public void setEgrulMassAddress(String egrulMassAddress) {
        this.egrulMassAddress = egrulMassAddress;
    }

    public BigDecimal getEgrulMassAddressCount() {
        return egrulMassAddressCount;
    }

    public void setEgrulMassAddressCount(BigDecimal egrulMassAddressCount) {
        this.egrulMassAddressCount = egrulMassAddressCount;
    }

    public String getSanctionList2() {
        return sanctionList2;
    }

    public void setSanctionList2(String sanctionList2) {
        this.sanctionList2 = sanctionList2;
    }

    public String getEgrulMassAddress2() {
        return egrulMassAddress2;
    }

    public void setEgrulMassAddress2(String egrulMassAddress2) {
        this.egrulMassAddress2 = egrulMassAddress2;
    }

    public BigDecimal getEgrulMassAddressCount2() {
        return egrulMassAddressCount2;
    }

    public void setEgrulMassAddressCount2(BigDecimal egrulMassAddressCount2) {
        this.egrulMassAddressCount2 = egrulMassAddressCount2;
    }

    public String getIsInsurance() {
        return isInsurance;
    }

    public void setIsInsurance(String isInsurance) {
        this.isInsurance = isInsurance;
    }

    public Timestamp getInvalidAddrDecisionDate() {
        return invalidAddrDecisionDate;
    }

    public void setInvalidAddrDecisionDate(Timestamp invalidAddrDecisionDate) {
        this.invalidAddrDecisionDate = invalidAddrDecisionDate;
    }

    public String getInvalidAddrCourtName() {
        return invalidAddrCourtName;
    }

    public void setInvalidAddrCourtName(String invalidAddrCourtName) {
        this.invalidAddrCourtName = invalidAddrCourtName;
    }

    public String getInvalidAddrDecisionNumber() {
        return invalidAddrDecisionNumber;
    }

    public void setInvalidAddrDecisionNumber(String invalidAddrDecisionNumber) {
        this.invalidAddrDecisionNumber = invalidAddrDecisionNumber;
    }

    @Override
    public String toString() {
        return "TernAnalytics{" +
                "prospectId=" + prospectId +
                ", prospectCreateDate=" + prospectCreateDate +
                ", prospectUpdateTime=" + prospectUpdateTime +
                ", prospectType='" + prospectType + '\'' +
                ", nameFull='" + nameFull + '\'' +
                ", nameShort='" + nameShort + '\'' +
                ", nameClear='" + nameClear + '\'' +
                ", nameSimple='" + nameSimple + '\'' +
                ", nameStdPart='" + nameStdPart + '\'' +
                ", nameOld='" + nameOld + '\'' +
                ", addressRegionCode='" + addressRegionCode + '\'' +
                ", addressFullName='" + addressFullName + '\'' +
                ", addressFullNameInView='" + addressFullNameInView + '\'' +
                ", stopDate=" + stopDate +
                ", stopCode='" + stopCode + '\'' +
                ", stopName='" + stopName + '\'' +
                ", stopRegCode='" + stopRegCode + '\'' +
                ", stopRegName='" + stopRegName + '\'' +
                ", shareOooValueRub=" + shareOooValueRub +
                ", shareOooPercent=" + shareOooPercent +
                ", authCapName='" + authCapName + '\'' +
                ", authCapValueRub=" + authCapValueRub +
                ", authCapDecValue=" + authCapDecValue +
                ", authCapDecDate=" + authCapDecDate +
                ", stdCharterActType='" + stdCharterActType + '\'' +
                ", stdCharterActDate=" + stdCharterActDate +
                ", stdCharterOrg='" + stdCharterOrg + '\'' +
                ", stdCharterActName='" + stdCharterActName + '\'' +
                ", stdCharterActNum='" + stdCharterActNum + '\'' +
                ", stdCharterActAttachNum='" + stdCharterActAttachNum + '\'' +
                ", regHolderOgrn='" + regHolderOgrn + '\'' +
                ", regHolderInn='" + regHolderInn + '\'' +
                ", regHolderNameFull='" + regHolderNameFull + '\'' +
                ", taxRecDate=" + taxRecDate +
                ", taxRecInn='" + taxRecInn + '\'' +
                ", ogrn='" + ogrn + '\'' +
                ", ogrnDate=" + ogrnDate +
                ", inn='" + inn + '\'' +
                ", kpp='" + kpp + '\'' +
                ", opfSprName='" + opfSprName + '\'' +
                ", opfCode='" + opfCode + '\'' +
                ", opfTypeName='" + opfTypeName + '\'' +
                ", regOrgName='" + regOrgName + '\'' +
                ", regOrgAddress='" + regOrgAddress + '\'' +
                ", regPfDate=" + regPfDate +
                ", regPfNumber='" + regPfNumber + '\'' +
                ", regPfCode='" + regPfCode + '\'' +
                ", regPfName='" + regPfName + '\'' +
                ", regFssDate=" + regFssDate +
                ", regFssNumber='" + regFssNumber + '\'' +
                ", regFssCode='" + regFssCode + '\'' +
                ", regFssName='" + regFssName + '\'' +
                ", sanctionList='" + sanctionList + '\'' +
                ", statusCompany='" + statusCompany + '\'' +
                ", statusCompanyFlag='" + statusCompanyFlag + '\'' +
                ", statusCompanyV2='" + statusCompanyV2 + '\'' +
                ", statusCompanyFlagV2='" + statusCompanyFlagV2 + '\'' +
                ", establishingMethodName='" + establishingMethodName + '\'' +
                ", establishingMethodDate=" + establishingMethodDate +
                ", establishingCodeB2002='" + establishingCodeB2002 + '\'' +
                ", establishedDepartmentB2002='" + establishedDepartmentB2002 + '\'' +
                ", statusCompany2='" + statusCompany2 + '\'' +
                ", statusCompanyFlag2='" + statusCompanyFlag2 + '\'' +
                ", msp='" + msp + '\'' +
                ", checkPacketList='" + checkPacketList + '\'' +
                ", monitoring='" + monitoring + '\'' +
                ", checkPacketStatus='" + checkPacketStatus + '\'' +
                ", checkPacketListId=" + checkPacketListId +
                ", checkPacketDataId=" + checkPacketDataId +
                ", fnsDebt=" + fnsDebt +
                ", fnsReporting=" + fnsReporting +
                ", badBoys='" + badBoys + '\'' +
                ", isBank='" + isBank + '\'' +
                ", bankRegNumber='" + bankRegNumber + '\'' +
                ", egrulMassAddress='" + egrulMassAddress + '\'' +
                ", egrulMassAddressCount=" + egrulMassAddressCount +
                ", sanctionList2='" + sanctionList2 + '\'' +
                ", egrulMassAddress2='" + egrulMassAddress2 + '\'' +
                ", egrulMassAddressCount2=" + egrulMassAddressCount2 +
                ", isInsurance='" + isInsurance + '\'' +
                ", invalidAddrDecisionDate=" + invalidAddrDecisionDate +
                ", invalidAddrCourtName='" + invalidAddrCourtName + '\'' +
                ", invalidAddrDecisionNumber='" + invalidAddrDecisionNumber + '\'' +
                '}';
    }
}
