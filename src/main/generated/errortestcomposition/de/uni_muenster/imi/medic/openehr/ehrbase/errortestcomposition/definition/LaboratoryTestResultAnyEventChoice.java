package de.uni_muenster.imi.medic.openehr.ehrbase.errortestcomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import java.util.List;
import javax.annotation.processing.Generated;

import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2022-02-10T10:37:59.923038+01:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.6.0"
)
public interface LaboratoryTestResultAnyEventChoice {
  NullFlavour getTestNameNullFlavourDefiningCode();

  void setTestNameNullFlavourDefiningCode(NullFlavour testNameNullFlavourDefiningCode);

  List<Cluster> getMultimediaRepresentation();

  void setMultimediaRepresentation(List<Cluster> multimediaRepresentation);

  List<Cluster> getTestResult();

  void setTestResult(List<Cluster> testResult);

  List<Cluster> getStructuredTestDiagnosis();

  void setStructuredTestDiagnosis(List<Cluster> structuredTestDiagnosis);

  SpecimenCluster getSpecimen();

  void setSpecimen(SpecimenCluster specimen);

  String getTestNameValue();

  void setTestNameValue(String testNameValue);

  TemporalAccessor getTimeValue();

  void setTimeValue(TemporalAccessor timeValue);

  List<Cluster> getStructuredConfoundingFactors();

  void setStructuredConfoundingFactors(List<Cluster> structuredConfoundingFactors);

  FeederAudit getFeederAudit();

  void setFeederAudit(FeederAudit feederAudit);
}
