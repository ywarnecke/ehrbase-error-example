package de.uni_muenster.imi.medic.openehr.ehrbase.errortestcomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import java.lang.Boolean;
import java.time.temporal.TemporalAccessor;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

public class SpecimenClusterContainment extends Containment {
  public SelectAqlField<SpecimenCluster> SPECIMEN_CLUSTER = new AqlFieldImp<SpecimenCluster>(SpecimenCluster.class, "", "SpecimenCluster", SpecimenCluster.class, this);

  public SelectAqlField<TemporalAccessor> DATE_TIME_RECEIVED_VALUE = new AqlFieldImp<TemporalAccessor>(SpecimenCluster.class, "/items[at0034]/value|value", "dateTimeReceivedValue", TemporalAccessor.class, this);

  public SelectAqlField<NullFlavour> DATE_TIME_RECEIVED_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(SpecimenCluster.class, "/items[at0034]/null_flavour|defining_code", "dateTimeReceivedNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<Cluster> PHYSICAL_PROPERTIES = new ListAqlFieldImp<Cluster>(SpecimenCluster.class, "/items[at0027]", "physicalProperties", Cluster.class, this);

  public ListSelectAqlField<Cluster> STRUCTURED_SOURCE_SITE = new ListAqlFieldImp<Cluster>(SpecimenCluster.class, "/items[at0013]", "structuredSourceSite", Cluster.class, this);

  public SelectAqlField<TemporalAccessor> COLLECTION_DATE_TIME_VALUE = new AqlFieldImp<TemporalAccessor>(SpecimenCluster.class, "/items[at0015]/value|value", "collectionDateTimeValue", TemporalAccessor.class, this);

  public SelectAqlField<TemporalAccessor> LOWER_VALUE = new AqlFieldImp<TemporalAccessor>(SpecimenCluster.class, "/items[at0015]/value/lower|value", "lowerValue", TemporalAccessor.class, this);

  public SelectAqlField<TemporalAccessor> UPPER_VALUE = new AqlFieldImp<TemporalAccessor>(SpecimenCluster.class, "/items[at0015]/value/upper|value", "upperValue", TemporalAccessor.class, this);

  public SelectAqlField<Boolean> LOWER_INCLUDED = new AqlFieldImp<Boolean>(SpecimenCluster.class, "/items[at0015]/value/lower_included", "lowerIncluded", Boolean.class, this);

  public SelectAqlField<Boolean> UPPER_INCLUDED = new AqlFieldImp<Boolean>(SpecimenCluster.class, "/items[at0015]/value/upper_included", "upperIncluded", Boolean.class, this);

  public SelectAqlField<NullFlavour> COLLECTION_DATE_TIME_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(SpecimenCluster.class, "/items[at0015]/null_flavour|defining_code", "collectionDateTimeNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<Cluster> SPECIMEN_COLLECTOR_DETAILS = new ListAqlFieldImp<Cluster>(SpecimenCluster.class, "/items[at0071]", "specimenCollectorDetails", Cluster.class, this);

  public ListSelectAqlField<Cluster> ADDITIONAL_COLLECTION_DETAILS = new ListAqlFieldImp<Cluster>(SpecimenCluster.class, "/items[at0083]", "additionalCollectionDetails", Cluster.class, this);

  public ListSelectAqlField<Cluster> CONTAINER_DETAILS = new ListAqlFieldImp<Cluster>(SpecimenCluster.class, "/items[at0085]", "containerDetails", Cluster.class, this);

  public ListSelectAqlField<Cluster> PROCESSING_DETAILS = new ListAqlFieldImp<Cluster>(SpecimenCluster.class, "/items[at0068]", "processingDetails", Cluster.class, this);

  public ListSelectAqlField<Cluster> TRANSPORT_DETAILS = new ListAqlFieldImp<Cluster>(SpecimenCluster.class, "/items[at0093]", "transportDetails", Cluster.class, this);

  public ListSelectAqlField<Cluster> DIGITAL_REPRESENTATION = new ListAqlFieldImp<Cluster>(SpecimenCluster.class, "/items[at0096]", "digitalRepresentation", Cluster.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(SpecimenCluster.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  private SpecimenClusterContainment() {
    super("openEHR-EHR-CLUSTER.specimen.v1");
  }

  public static SpecimenClusterContainment getInstance() {
    return new SpecimenClusterContainment();
  }
}
