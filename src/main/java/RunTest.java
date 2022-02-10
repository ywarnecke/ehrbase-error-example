import org.ehrbase.client.classgenerator.interfaces.CompositionEntity;

public class RunTest {

    public static void main(String args[]) {

        EhrbaseUtils ehrbase = new EhrbaseUtils();

        CompositionEntity testComposition = ehrbase.createTestComposition();

        ehrbase.runUnflatten(testComposition);

    }
}
