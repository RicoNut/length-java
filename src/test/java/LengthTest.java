import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LengthTest {

    @Test
    public void should_1_inch_equals_1_inch() {
        Length result = new Length(1, UnitConstant.INCH).convertAs(UnitConstant.INCH);

        assertThat(result.getVal(), is(1.0));
        assertThat(result.getUinnt(), is(UnitConstant.INCH));
    }

    @Test
    public void should_2_feet_equals_2_feet() {
        Length result = new Length(2, UnitConstant.FOOT).convertAs(UnitConstant.FOOT);

        assertThat(result.getVal(), is(2.0));
        assertThat(result.getUinnt(), is(UnitConstant.FOOT));
    }

    @Test
    public void should_1_yard_equals_1_yard() {
        Length result = new Length(1, UnitConstant.YARD).convertAs(UnitConstant.YARD);

        assertThat(result.getVal(), is(1.0));
        assertThat(result.getUinnt(), is(UnitConstant.YARD));
    }

    @Test
    public void should_1_foot_equals_12_inches() {
        Length result = new Length(1, UnitConstant.FOOT).convertAs(UnitConstant.INCH);

        assertThat(result.getVal(), is(12.0));
        assertThat(result.getUinnt(), is(UnitConstant.INCH));
    }

    @Test
    public void should_3_foot_equals_1_yard() {
        Length result = new Length(3, UnitConstant.FOOT).convertAs(UnitConstant.YARD);

        assertThat(result.getVal(), is(1.0));
        assertThat(result.getUinnt(), is(UnitConstant.YARD));
    }

    @Test
    public void should_1_yard_equals_3_feet() {
        Length result = new Length(1, UnitConstant.YARD).convertAs(UnitConstant.FOOT);

        assertThat(result.getVal(), is(3.0));
        assertThat(result.getUinnt(), is(UnitConstant.FOOT));
    }

    @Test
    public void should_1_yard_equals_36_inches() {
        Length result = new Length(1, UnitConstant.YARD).convertAs(UnitConstant.INCH);

        assertThat(result.getVal(), is(36.0));
        assertThat(result.getUinnt(), is(UnitConstant.INCH));
    }

    @Test
    public void should_2_yards_equals_72_inches() {
        Length result = new Length(2, UnitConstant.YARD).convertAs(UnitConstant.INCH);

        assertThat(result.getVal(), is(72.0));
        assertThat(result.getUinnt(), is(UnitConstant.INCH));
    }

    @Test
    public void should_12_inches_equals_1_foot() {
        Length result = new Length(12, UnitConstant.INCH).convertAs(UnitConstant.FOOT);

        assertThat(result.getVal(), is(1.0));
        assertThat(result.getUinnt(), is(UnitConstant.FOOT));
    }

    @Test
    public void should_36_inches_equals_1_yard() {
        Length result = new Length(36, UnitConstant.INCH).convertAs(UnitConstant.YARD);

        assertThat(result.getVal(), is(1.0));
        assertThat(result.getUinnt(), is(UnitConstant.YARD));
    }

    @Test
    public void should_18_inches_equals_half_yard() {
        Length result = new Length(18, UnitConstant.INCH).convertAs(UnitConstant.YARD);

        assertThat(result.getVal(), is(0.5));
        assertThat(result.getUinnt(), is(UnitConstant.YARD));
    }
}
