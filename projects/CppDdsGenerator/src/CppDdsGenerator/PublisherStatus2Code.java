package CppDdsGenerator;

import ddsMetamodel.PublisherStatus;

public class PublisherStatus2Code {
	public String getMethodDefinition(PublisherStatus aStatus) {
		String methodDef = "";
		switch (aStatus) {
		case LIVELINESS_LOST_STATUS:
			methodDef = "virtual void on_liveliness_lost(AnyDataWriter &writer, LivelinessLostStatus &status)";
			break;
		case OFFERED_DEADLINE_MISSED_STATUS:
			methodDef = "virtual void on_offered_deadline_missed(AnyDataWriter &writer, OfferedDeadlineMissedStatus &status)";
			break;
		case OFFERED_INCOMPATIBLE_QOS_STATUS:
			methodDef = "virtual void on_offered_incompatible_qos(AnyDataWriter &writer, OfferedIncompatibleQosStatus &status)";
			break;
		case PUBLICATION_MATCHED_STATUS:
			methodDef = "virtual void on_publication_matched(AnyDataWriter &writer, PublicationMatchedStatus &status)";
			break;
		default:
			break;
		}
		return methodDef;
	}
	
	public String getStatusMask(PublisherStatus aStatus) {
		String mask = "";
		switch (aStatus) {
		case LIVELINESS_LOST_STATUS:
			mask = "liveliness_lost()";
			break;
		case OFFERED_DEADLINE_MISSED_STATUS:
			mask = "offered_deadline_missed()";
			break;
		case OFFERED_INCOMPATIBLE_QOS_STATUS:
			mask = "offered_incompatible_qos()";
			break;
		case PUBLICATION_MATCHED_STATUS:
			mask = "publication_matched()";
			break;
		default:
			break;
		}
		return mask;
	}
}
