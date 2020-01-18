import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LengthTest {
    @Test
    public void should_1_inch_equals_1_inch() {
        Length result = new Length(1, "inch").convertAs("inch");

        assertThat(result.getVal(), is(1.0));
        assertThat(result.getUinnt(), is("inch"));
    }

    @Test
    public void should_2_feet_equals_2_feet() {
        Length result = new Length(2, "f").convertAs("f");

        assertThat(result.getVal(), is(2.0));
        assertThat(result.getUinnt(), is("f"));
    }

    @Test
    public void should_1_yard_equals_1_yard() {
        Length result = new Length(1, "yard").convertAs("yard");

        assertThat(result.getVal(), is(1.0));
        assertThat(result.getUinnt(), is("yard"));
    }

    @Test
    public void should_1_foot_equals_12_inches() {
        Length result = new Length(1, "f").convertAs("inch");

        assertThat(result.getVal(), is(12.0));
        assertThat(result.getUinnt(), is("inch"));
    }

    @Test
    public void should_3_foot_equals_1_yard() {
        Length result = new Length(3, "f").convertAs("yard");

        assertThat(result.getVal(), is(1.0));
        assertThat(result.getUinnt(), is("yard"));
    }

    @Test
    public void should_1_yard_equals_3_feet() {
        Length result = new Length(1, "yard").convertAs("f");

        assertThat(result.getVal(), is(3.0));
        assertThat(result.getUinnt(), is("f"));
    }

    @Test
    public void should_1_yard_equals_36_inches() {
        Length result = new Length(1, "yard").convertAs("inch");

        assertThat(result.getVal(), is(36.0));
        assertThat(result.getUinnt(), is("inch"));
    }

    @Test
    public void should_2_yards_equals_72_inches() {
        Length result = new Length(2, "yard").convertAs("inch");

        assertThat(result.getVal(), is(72.0));
        assertThat(result.getUinnt(), is("inch"));
    }

    @Test
    public void should_12_inches_equals_1_foot() {
        Length result = new Length(12, "inch").convertAs("f");

        assertThat(result.getVal(), is(1.0));
        assertThat(result.getUinnt(), is("f"));
    }

    @Test
    public void should_36_inches_equals_1_yard() {
        Length result = new Length(36, "inch").convertAs("yard");

        assertThat(result.getVal(), is(1.0));
        assertThat(result.getUinnt(), is("yard"));
    }

    @Test
    public void should_18_inches_equals_half_yard() {
        Length result = new Length(18, "inch").convertAs("yard");

        assertThat(result.getVal(), is(0.5));
        assertThat(result.getUinnt(), is("yard"));
    }
}
