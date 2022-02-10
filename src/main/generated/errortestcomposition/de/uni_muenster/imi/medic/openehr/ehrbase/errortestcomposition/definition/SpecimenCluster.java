package de.uni_muenster.imi.medic.openehr.ehrbase.errortestcomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import java.lang.Boolean;
import java.time.temporal.TemporalAccessor;
import java.util.List;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Entity
@Archetype("openEHR-EHR-CLUSTER.specimen.v1")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2022-02-10T10:37:59.914168+01:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.6.0"
)
public class SpecimenCluster implements LocatableEntity {
  /**
   * Path: ErrorTest/Laboratory test result/Any event/Specimen/Date/time received
   * Description: The date and time that the sample was received at the laboratory.
   */
  @Path("/items[at0034]/value|value")
  private TemporalAccessor dateTimeReceivedValue;

  /**
   * Path: ErrorTest/Laboratory test result/Any event/Tree/Specimen/Date/time received/null_flavour
   */
  @Path("/items[at0034]/null_flavour|defining_code")
  private NullFlavour dateTimeReceivedNullFlavourDefiningCode;

  /**
   * Path: ErrorTest/Laboratory test result/Any event/Specimen/Physical properties
   * Description: Physical dimensions, mass or non-measurable properties of the specimen.
   * Comment: For example: Volume, mass, circumference, colour, smell, turbidity. This element can be used to specify the properties of the specimen to be collected, in the context of an INSTRUCTION archetype, or the properties of the specimen which was collected, in the context of an ACTION or OBSERVATION archetype. For example, an INSTRUCTION may request the collection of 20 ml of blood, while the corresponding ACTION records that only 15 ml was collected.
   */
  @Path("/items[at0027]")
  private List<Cluster> physicalProperties;

  /**
   * Path: ErrorTest/Laboratory test result/Any event/Specimen/Structured source site
   * Description: A structured description of the area of the body from where the specimen is collected.
   * Comment: Utilise the more detailed archetypes to describe structured or more complex anatomical sites, or to support recording the source site at run-time by the application. If the body site has been fully identified in the 'Source site' data element, this SLOT becomes redundant.
   */
  @Path("/items[at0013]")
  private List<Cluster> structuredSourceSite;

  /**
   * Path: ErrorTest/Laboratory test result/Any event/Specimen/Collection date/time
   * Description: The date and time that collection has been ordered to take place or has taken place.
   */
  @Path("/items[at0015]/value|value")
  private TemporalAccessor collectionDateTimeValue;

  /**
   * Path: ErrorTest/Laboratory test result/Any event/Specimen/Collection date/time/lower
   */
  @Path("/items[at0015]/value/lower|value")
  private TemporalAccessor lowerValue;

  /**
   * Path: ErrorTest/Laboratory test result/Any event/Specimen/Collection date/time/upper
   */
  @Path("/items[at0015]/value/upper|value")
  private TemporalAccessor upperValue;

  /**
   * Path: ErrorTest/Laboratory test result/Any event/Specimen/Collection date/time/lower_included
   */
  @Path("/items[at0015]/value/lower_included")
  private Boolean lowerIncluded;

  /**
   * Path: ErrorTest/Laboratory test result/Any event/Specimen/Collection date/time/upper_included
   */
  @Path("/items[at0015]/value/upper_included")
  private Boolean upperIncluded;

  /**
   * Path: ErrorTest/Laboratory test result/Any event/Tree/Specimen/Collection date/time/null_flavour
   */
  @Path("/items[at0015]/null_flavour|defining_code")
  private NullFlavour collectionDateTimeNullFlavourDefiningCode;

  /**
   * Path: ErrorTest/Laboratory test result/Any event/Specimen/Specimen collector details
   * Description: The person or organisation responsible for collecting the specimen.
   */
  @Path("/items[at0071]")
  private List<Cluster> specimenCollectorDetails;

  /**
   * Path: ErrorTest/Laboratory test result/Any event/Specimen/Additional collection details
   * Description: Addtional details related to specific collection methods.
   * Comment: For example details about needle biopsies in prostate cancer, where both the request and reporting about the specimen are detailed and specific.
   */
  @Path("/items[at0083]")
  private List<Cluster> additionalCollectionDetails;

  /**
   * Path: ErrorTest/Laboratory test result/Any event/Specimen/Container details
   * Description: Details about containers used.
   */
  @Path("/items[at0085]")
  private List<Cluster> containerDetails;

  /**
   * Path: ErrorTest/Laboratory test result/Any event/Specimen/Processing details
   * Description: Structured details about preparation or processing of the specimen.
   * Comment: For example: Staining or fixation.
   */
  @Path("/items[at0068]")
  private List<Cluster> processingDetails;

  /**
   * Path: ErrorTest/Laboratory test result/Any event/Specimen/Transport details
   * Description: Structured details about transport of the specimen.
   */
  @Path("/items[at0093]")
  private List<Cluster> transportDetails;

  /**
   * Path: ErrorTest/Laboratory test result/Any event/Specimen/Digital representation
   * Description: Structured details about a digital representation of the specimen.
   * Comment: For example the scanned image of a histopathology slide.
   */
  @Path("/items[at0096]")
  private List<Cluster> digitalRepresentation;

  /**
   * Path: ErrorTest/Laboratory test result/Any event/Specimen/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setDateTimeReceivedValue(TemporalAccessor dateTimeReceivedValue) {
     this.dateTimeReceivedValue = dateTimeReceivedValue;
  }

  public TemporalAccessor getDateTimeReceivedValue() {
     return this.dateTimeReceivedValue ;
  }

  public void setDateTimeReceivedNullFlavourDefiningCode(
      NullFlavour dateTimeReceivedNullFlavourDefiningCode) {
     this.dateTimeReceivedNullFlavourDefiningCode = dateTimeReceivedNullFlavourDefiningCode;
  }

  public NullFlavour getDateTimeReceivedNullFlavourDefiningCode() {
     return this.dateTimeReceivedNullFlavourDefiningCode ;
  }

  public void setPhysicalProperties(List<Cluster> physicalProperties) {
     this.physicalProperties = physicalProperties;
  }

  public List<Cluster> getPhysicalProperties() {
     return this.physicalProperties ;
  }

  public void setStructuredSourceSite(List<Cluster> structuredSourceSite) {
     this.structuredSourceSite = structuredSourceSite;
  }

  public List<Cluster> getStructuredSourceSite() {
     return this.structuredSourceSite ;
  }

  public void setCollectionDateTimeValue(TemporalAccessor collectionDateTimeValue) {
     this.collectionDateTimeValue = collectionDateTimeValue;
  }

  public TemporalAccessor getCollectionDateTimeValue() {
     return this.collectionDateTimeValue ;
  }

  public void setLowerValue(TemporalAccessor lowerValue) {
     this.lowerValue = lowerValue;
  }

  public TemporalAccessor getLowerValue() {
     return this.lowerValue ;
  }

  public void setUpperValue(TemporalAccessor upperValue) {
     this.upperValue = upperValue;
  }

  public TemporalAccessor getUpperValue() {
     return this.upperValue ;
  }

  public void setLowerIncluded(Boolean lowerIncluded) {
     this.lowerIncluded = lowerIncluded;
  }

  public Boolean isLowerIncluded() {
     return this.lowerIncluded ;
  }

  public void setUpperIncluded(Boolean upperIncluded) {
     this.upperIncluded = upperIncluded;
  }

  public Boolean isUpperIncluded() {
     return this.upperIncluded ;
  }

  public void setCollectionDateTimeNullFlavourDefiningCode(
      NullFlavour collectionDateTimeNullFlavourDefiningCode) {
     this.collectionDateTimeNullFlavourDefiningCode = collectionDateTimeNullFlavourDefiningCode;
  }

  public NullFlavour getCollectionDateTimeNullFlavourDefiningCode() {
     return this.collectionDateTimeNullFlavourDefiningCode ;
  }

  public void setSpecimenCollectorDetails(List<Cluster> specimenCollectorDetails) {
     this.specimenCollectorDetails = specimenCollectorDetails;
  }

  public List<Cluster> getSpecimenCollectorDetails() {
     return this.specimenCollectorDetails ;
  }

  public void setAdditionalCollectionDetails(List<Cluster> additionalCollectionDetails) {
     this.additionalCollectionDetails = additionalCollectionDetails;
  }

  public List<Cluster> getAdditionalCollectionDetails() {
     return this.additionalCollectionDetails ;
  }

  public void setContainerDetails(List<Cluster> containerDetails) {
     this.containerDetails = containerDetails;
  }

  public List<Cluster> getContainerDetails() {
     return this.containerDetails ;
  }

  public void setProcessingDetails(List<Cluster> processingDetails) {
     this.processingDetails = processingDetails;
  }

  public List<Cluster> getProcessingDetails() {
     return this.processingDetails ;
  }

  public void setTransportDetails(List<Cluster> transportDetails) {
     this.transportDetails = transportDetails;
  }

  public List<Cluster> getTransportDetails() {
     return this.transportDetails ;
  }

  public void setDigitalRepresentation(List<Cluster> digitalRepresentation) {
     this.digitalRepresentation = digitalRepresentation;
  }

  public List<Cluster> getDigitalRepresentation() {
     return this.digitalRepresentation ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }
}
