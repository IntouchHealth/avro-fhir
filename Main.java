import java.io.*;
import com.google.fhir.stu3.proto.*;
import org.apache.avro.Schema;
import org.apache.avro.protobuf.ProtobufData;
import com.google.common.base.*;

public class Main {
    public static void main(java.lang.String[] args) {
        java.lang.String classes[] = new java.lang.String[] {
                "Account",
                "ActivityDefinition",
                "AllergyIntolerance",
                "AdverseEvent",
                "Appointment",
                "AppointmentResponse",
                "AuditEvent",
                "Basic",
                "Binary",
                "BodySite",
                "Bundle",
                "CapabilityStatement",
                "CarePlan",
                "CareTeam",
                "ChargeItem",
                "Claim",
                "ClaimResponse",
                "ClinicalImpression",
                "CodeSystem",
                "Communication",
                "CommunicationRequest",
                "CompartmentDefinition",
                "Composition",
                "ConceptMap",
                "Condition",
                "Consent",
                "Contract",
                "Coverage",
                "DataElement",
                "DetectedIssue",
                "Device",
                "DeviceComponent",
                "DeviceMetric",
                "DeviceRequest",
                "DeviceUseStatement",
                "DiagnosticReport",
                "DocumentManifest",
                "DocumentReference",
                "EligibilityRequest",
                "EligibilityResponse",
                "Encounter",
                "Endpoint",
                "EnrollmentRequest",
                "EnrollmentResponse",
                "EpisodeOfCare",
                "ExpansionProfile",
                "ExplanationOfBenefit",
                "FamilyMemberHistory",
                "Flag",
                "Goal",
                "GraphDefinition",
                "Group",
                "GuidanceResponse",
                "HealthcareService",
                "ImagingManifest",
                "ImagingStudy",
                "Immunization",
                "ImmunizationRecommendation",
                "ImplementationGuide",
                "Library",
                "Linkage",
                "List",
                "Location",
                "Measure",
                "MeasureReport",
                "Media",
                "Medication",
                "MedicationAdministration",
                "MedicationDispense",
                "MedicationRequest",
                "MedicationStatement",
                "MessageDefinition",
                "MessageHeader",
                "NamingSystem",
                "NutritionOrder",
                "Observation",
                "OperationDefinition",
                "OperationOutcome",
                "Organization",
                "Parameters",
                "Patient",
                "PaymentNotice",
                "PaymentReconciliation",
                "Person",
                "PlanDefinition",
                "Practitioner",
                "PractitionerRole",
                "Procedure",
                "ProcedureRequest",
                "ProcessRequest",
                "ProcessResponse",
                "Provenance",
                "Questionnaire",
                "QuestionnaireResponse",
                "ReferralRequest",
                "RelatedPerson",
                "RequestGroup",
                "ResearchStudy",
                "ResearchSubject",
                "RiskAssessment",
                "Schedule",
                "SearchParameter",
                "Sequence",
                "ServiceDefinition",
                "Slot",
                "Specimen",
                "StructureDefinition",
                "StructureMap",
                "Subscription",
                "Substance",
                "SupplyDelivery",
                "SupplyRequest",
                "Task",
                "TestScript",
                "TestReport",
                "ValueSet",
                "VisionPrescription"
        };

        for (int i = 0; i < classes.length; i++) {
            try {
                System.out.println("Trying " + classes[i]);
                java.lang.String className = "com.google.fhir.stu3.proto." + classes[i];
                java.lang.String snake = CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, classes[i]);
                java.lang.String fileName = "/Users/blake/IdeaProjects/fhirapp/schemas/" + snake + ".avsc";
                Class ClassRef = Class.forName(className);
                Schema schema = ProtobufData.get().getSchema(ClassRef);
                PrintWriter writer = new PrintWriter(fileName);
                writer.println(schema.toString());
                writer.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Done!");
    }
}
