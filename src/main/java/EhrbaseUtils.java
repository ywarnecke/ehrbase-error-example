import com.nedap.archie.rm.composition.Composition;
import de.uni_muenster.imi.medic.openehr.ehrbase.errortestcomposition.ErrorTestComposition;
import de.uni_muenster.imi.medic.openehr.ehrbase.errortestcomposition.definition.LaboratoryTestResultAnyEventChoice;
import de.uni_muenster.imi.medic.openehr.ehrbase.errortestcomposition.definition.LaboratoryTestResultAnyEventPointEvent;
import de.uni_muenster.imi.medic.openehr.ehrbase.errortestcomposition.definition.LaboratoryTestResultObservation;
import de.uni_muenster.imi.medic.openehr.ehrbase.errortestcomposition.definition.SpecimenCluster;
import org.ehrbase.client.classgenerator.interfaces.CompositionEntity;
import org.ehrbase.client.flattener.Unflattener;
import org.ehrbase.webtemplate.templateprovider.FileBasedTemplateProvider;

import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class EhrbaseUtils {

    private final FileBasedTemplateProvider templateProvider = new FileBasedTemplateProvider(
            Path.of(System.getProperty(
            "user.dir") + "/src/main/resources")
    );


    public void runUnflatten(CompositionEntity composition){
        //Error should be invoked
        Composition unflattenedComposition = (Composition) new Unflattener(templateProvider)
                .unflatten(composition);
    }


    public ErrorTestComposition createTestComposition() {
        ErrorTestComposition composition = new ErrorTestComposition();

        LaboratoryTestResultObservation labTest = new LaboratoryTestResultObservation();

        LaboratoryTestResultAnyEventPointEvent anyEvent = new LaboratoryTestResultAnyEventPointEvent();
        anyEvent.setTestNameValue("Testname");

        SpecimenCluster specimen = new SpecimenCluster();

        specimen.setCollectionDateTimeValue(LocalDateTime.now());

        anyEvent.setSpecimen(specimen);

        List<LaboratoryTestResultAnyEventChoice> anyEventList = new ArrayList<LaboratoryTestResultAnyEventChoice>();
        anyEventList.add(anyEvent);

        labTest.setAnyEvent(anyEventList);
        composition.setLaboratoryTestResult(labTest);

        return composition;
    }



}
