package com.bohniman.eftapi.util;

/**
 * AppSettings
 */
public class AppSettings {

    // ========================================================================
    // # Pagination limit for SP suspect list view
    // ========================================================================
    public static final Integer SP_SUSPECT_LIMIT = 100;
    public static final Integer OC_SUSPECT_LIMIT = 100;
    public static final Integer FT_CASE_LIMIT = 100;
    public static final Integer SP_CASE_LIMIT = 100;
    public static final Integer HC_CASE_LIMIT = 100;
    public static final Integer SP_APPREHEND_REQUEST_LIMIT = 100;
    public static final Integer SPD_ESCORT_PARTY_REQUEST_LIMIT = 100;

    // ========================================================================
    // # Pagination limit for OC suspect list view
    // ========================================================================
    public static final Integer OC_APPREHEND_REQUEST_LIMIT = 100;
    public static final Integer OC_APPREHENDED_FOREIGNERS_LIMIT = 100;
    public static final Integer OC_ABSCONDING_FOREIGNERS_LIMIT = 100;
    public static final Integer OC_TRIAL_NOTICE_LIMIT = 100;

    // ========================================================================
    // # Pagination limit for Notificaion limit
    // ========================================================================
    public static final Integer NOTIFICATION_LIMIT = 100;

    // ========================================================================
    // # Master record isActive String
    // ========================================================================
    public static final String RECORD_ACTIVE = "Y";
    public static final String RECORD_INACTIVE = "N";
    // ========================================================================
    // # Communication type strings
    // ========================================================================
    public static final String COMMUNICATION_INVESTIGATION = "Investigation";
    public static final Boolean SP_CASE_REGISTER_IF_ALL_COMMUNICATION_CLOSED = true;

    // ========================================================================
    // # Communication status strings
    // ========================================================================
    public static final String COMMUNICATION_OPEN = "Open";
    public static final String COMMUNICATION_CLOSED = "Closed";

    // ========================================================================
    // # Notice viewed status strings
    // ========================================================================
    public static final Boolean NOTICE_VIEWED = true;
    public static final Boolean NOTICE_NOT_VIEWED = false;

    // ========================================================================
    // # Current status strings
    // ========================================================================
    public static final String CURRENT_STATUS_ACTIVE = "Active";
    public static final String CURRENT_STATUS_INACTIVE = "Inactive";
    public static final String CURRENT_STATUS_DELETED = "Deleted";

    // ========================================================================
    // # User role strings
    // ========================================================================
    public static final String ROLE_ADMIN = "Admin";
    public static final String ROLE_SPD = "SPD";
    public static final String ROLE_FT = "FT";
    public static final String ROLE_OC = "OC";
    public static final String ROLE_IO = "IO";
    public static final String ROLE_HC = "HC";

    // ========================================================================
    // # Unique Id Name
    // ========================================================================
    public static final String ID_POLICE_CASE_NO = "POLICE_CASE_NO";
    public static final String ID_FT_CASE_NO = "FT_CASE_NO";

    // ========================================================================
    // # FT case status string
    // ========================================================================
    public static final String FT_CASE_RETURNED = "RETURNED";
    public static final String FT_CASE_REFERRED = "REFERRED";
    public static final String FT_CASE_PENDING = "PENDING";
    public static final String FT_CASE_DISPOSED = "DISPOSED";
    public static final String FT_CASE_CLOSED = "CLOSED";
    public static final String FT_CASE_DETAINED = "DETAINED";

    // ========================================================================
    // # Police case status string
    // ========================================================================
    public static final String POLICE_FRESH_CASE = "FRESH CASE";
    public static final String POLICE_INVESTIGATION_REQUESTED_BY_SP = "INVESTIGATION REQUESTED BY SP";
    public static final String POLICE_INVESTIGATION_COMPLETED_BY_IO = "INVESTIGATION COMPLETED BY IO";
    public static final String POLICE_SP_CASE_REGISTERED = "CASE REFERRED TO FT";
    public static final String POLICE_CASE_RETURNED_BY_FT = "CASE RETURNED BY FT";
    public static final String POLICE_FURTHER_INVESTIGATION_REQUESTED_BY_SP = "FURTHER INVESTIGATION REQUESTED BY SP";
    public static final String POLICE_FURTHER_INVESTIGATION_COMPLETED_BY_IO = "FURTHER INVESTIGATION COMPLETED BY IO";
    public static final String POLICE_SP_CASE_REFORWARDED = "CASE REFORWARDED TO FT";
    public static final String POLICE_FT_CASE_REGISTERED = "CASE REGISTERED BY FT";
    public static final String POLICE_CASE_CLOSED_BY_SP = "CASE CLOSED BY SP";

    // ========================================================================
    // # Timeline action strings
    // ========================================================================
    public static final String TIMELINE_SP_INVESTIGATION_NEW_REQUEST = "New investigation requested by SP to IO.";
    public static final String TIMELINE_SP_FURTHER_INVESTIGATION_REQUEST = "Further investigation requested by SP to IO.";
    public static final String TIMELINE_SP_INVESTIGATION_COMMENT = "New investigation comment by SP to IO.";
    public static final String TIMELINE_IO_INVESTIGATION_REPLY = "Investigation reply comment by IO to SP.";
    public static final String TIMELINE_SP_INVESTIGATION_REPLY = "Investigation reply comment by SP to FT.";
    public static final String TIMELINE_SP_CASE_REGISTER = "Suspect case referred to FT by SP.";
    public static final String TIMELINE_SP_CASE_CLOSE = "Suspect case closed by SP.";
    public static final String TIMELINE_FT_INVESTIGATION_NEW_REQUEST = "New investigation requested by FT to SP.";
    public static final String TIMELINE_SP_INVESTIGATION_FORWARD = "Investigation request from FT forwarded to IO by SP";
    public static final String TIMELINE_FT_CASE_NO_GENERATED = "Reffered suspect case registered by FT";
    public static final String TIMELINE_SP_APPREHEND_REQUEST = "Suspect Apprehend Requested from SP to OC";
    public static final String TIMELINE_OC_APPREHEND_UPDATED = "Suspect Apprehend Requested updated by OC";
    public static final String TIMELINE_SP_APPREHEND_ESCORT = "Escort details provided by SP";
    public static final String TIMELINE_SP_MEDICAL_CHECKUP = "Medical Checkup Details provided by SP";
    public static final String TIMELINE_SP_REQUEST_ESCORT = "Escort details provided by SP";

    // ========================================================================
    // # Timeline action settings for FT
    // ========================================================================
    public static final String TIMELINE_FT_CASE_REGISTER = "Suspect case has been registered by FT.";
    public static final String TIMELINE_FT_CASE_RETURNED = "Suspect case has been returned by FT.";
    public static final String TIMELINE_FT_CASE_NEW_TRIAL = "Suspect case new trial created";
    public static final String TIMELINE_FT_CASE_UPDATE_TRIAL = "Suspect case trial updated";
    public static final String TIMELINE_SP_CASE_REFORWARDED = "Suspect Case reforwarded to FT";

    public static final String TIMELINE_FT_TRIAL_NOTICE_UPLOADED = "Trial notice uploaded by FT";
    public static final String TIMELINE_FT_TRIAL_OPINION_ADDED = "Trial opinion added by FT";
    public static final String TIMELINE_FT_FINAL_OPINION_ADDED = "Final opinion added by FT";

    // ========================================================================
    // # Timeline action settings for OC
    // ========================================================================
    public static final String TIMELINE_OC_TRIAL_NOTICE_SERVED = "Trial notice served by OC";

    // ========================================================================
    // # Timeline action settings for HC
    // ========================================================================
    public static final String TIMELINE_HC_DETAINEE_RECEIVED = "Detainee received by HC";

    // ========================================================================
    // # Apprehend Status
    // ========================================================================
    public static final String APPREHEND_OC_ABSCONDED = "ABSCONDED";
    public static final String APPREHEND_OC_APPREHENDED = "APPREHENDED";
    public static final String APPREHEND_SP_REQUESTED = "REQUESTED";

    public static final String APPREHEND_MEDICAL_PENDING = "PENDING";
    public static final String APPREHEND_MEDICAL_COMPLETED = "COMPLETED";
    public static final String APPREHEND_ESCORT_PENDING = "PENDING";
    public static final String APPREHEND_ESCORT_COMPLETED = "ASSIGNED";

    // ========================================================================
    // # Detainee Movement Type
    // ========================================================================
    public static final String ESCORT_REQUESTED = "ESCORT_REQUESTED";
    public static final String ESCORT_APPREHEND = "ESCORT_APPREHEND";

    // ========================================================================
    // # Detainee Movement Request Status
    // ========================================================================
    public static final String REQUEST_APPROVED = "APPROVED";
    public static final String APPROVAL_PENDING = "PENDING";
    public static final String REQUEST_CANCELLED = "CANCELLED";

    // ========================================================================
    // # Medical Checkup Type
    // ========================================================================
    public static final String CHECKUP_INITIAL = "INITIAL";
    public static final String CHECKUP_PERIODIC = "PERIODIC";

    // ========================================================================
    // # Master Ft trial status
    // ========================================================================
    public static final String FT_TRIAL_INITIATED = "INITIATED";
    public static final String FT_TRIAL_NOTICE_FORWARDED = "NOTICE-FORWARDED";
    public static final String FT_TRIAL_OPINION_ADDED = "OPINION-ADDED";

    // ========================================================================
    // # Notice serving status
    // ========================================================================
    public static final String FT_NOTICE_NOTSERVED = "NOT-SERVED";
    public static final String FT_NOTICE_SERVED = "SERVED";

    // ========================================================================
    // # Doc type String
    // ========================================================================
    public static final String DOC_FT_NOTICE = "DOC_FT_NOTICE";
    public static final String DOC_FT_TRIAL_OPINION = "DOC_FT_TRIAL_OPINION";
    public static final String DOC_FT_FINAL_OPINION = "DOC_FT_FINAL_OPINION";
    public static final String DOC_SPD_MEDICAL = "DOC_SPD_MEDICAL";
    public static final String DOC_HC_PERIODIC_MEDICAL = "DOC_HC_PERIODIC_MEDICAL";
    public static final String DOC_HC_MEDICAL_TREATMENT = "DOC_HC_MEDICAL_TREATMENT";

    // ========================================================================
    // # Hoolding center detainee status
    // ========================================================================
    public static final String HC_MOVEMENT_INITIATED = "MOVEMENT_INITIATED";
    public static final String HC_DETAINED = "DETAINED";

    public static final String HC_INITIAL_CHECKUP_TYPE = "INITIAL";
    public static final String HC_PERIODIC_CHECKUP_TYPE = "PERIODIC";

    // ========================================================================
    // # Ft suspect type in final opinion
    // ========================================================================
    public static final String FT_SUSPECT_TYPE_ON_CONTEST = "ON CONTEST";
    public static final String FT_SUSPECT_TYPE_EX_PARTE = "EX PARTE";
    public static final String FT_SUSPECT_TYPE_OTHERS = "OTHERS";

    // ========================================================================
    // # Ft final opinion
    // ========================================================================
    public static final String FT_SUSPECT_NOT_FOREIGNER = "NOT FOREIGNER";
    public static final String FT_SUSPECT_FOREIGNER = "FOREIGNER";
    public static final String FT_SUSPECT_EX_PARTE = "EX PARTE";
}