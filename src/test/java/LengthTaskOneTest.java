import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LengthTaskOneTest {
    @Test
    public void should_1_inch_equals_1_inch() {
        Length_TaskOne result = new Length_TaskOne(1, "inch").as("inch");

        assertThat(result.getVal(), is(1.0));
        assertThat(result.getUinnt(), is("inch"));
    }

    @Test
    public void should_2_feet_equals_2_feet() {
        Length_TaskOne result = new Length_TaskOne(2, "f").as("f");

        assertThat(result.getVal(), is(2.0));
        assertThat(result.getUinnt(), is("f"));
    }

    @Test
    public void should_1_yard_equals_1_yard() {
        Length_TaskOne result = new Length_TaskOne(1, "yard").as("yard");

        assertThat(result.getVal(), is(1.0));
        assertThat(result.getUinnt(), is("yard"));
    }

    @Test
    public void should_1_foot_equals_12_inches() {
        Length_TaskOne result = new Length_TaskOne(1, "f").as("inch");

        assertThat(result.getVal(), is(12.0));
        assertThat(result.getUinnt(), is("inch"));
    }

    @Test
    public void should_3_foot_equals_1_yard() {
        Length_TaskOne result = new Length_TaskOne(3, "f").as("yard");

        assertThat(result.getVal(), is(1.0));
        assertThat(result.getUinnt(), is("yard"));
    }

    @Test
    public void should_1_yard_equals_3_feet() {
        Length_TaskOne result = new Length_TaskOne(1, "yard").as("f");

        assertThat(result.getVal(), is(3.0));
        assertThat(result.getUinnt(), is("f"));
    }

    @Test
    public void should_1_yard_equals_36_inches() {
        Length_TaskOne result = new Length_TaskOne(1, "yard").as("inch");

        assertThat(result.getVal(), is(36.0));
        assertThat(result.getUinnt(), is("inch"));
    }

    @Test
    public void should_2_yards_equals_72_inches() {
        Length_TaskOne result = new Length_TaskOne(2, "yard").as("inch");

        assertThat(result.getVal(), is(72.0));
        assertThat(result.getUinnt(), is("inch"));
    }

    @Test
    public void should_12_inches_equals_1_foot() {
        Length_TaskOne result = new Length_TaskOne(12, "inch").as("f");

        assertThat(result.getVal(), is(1.0));
        assertThat(result.getUinnt(), is("f"));
    }

    @Test
    public void should_36_inches_equals_1_yard() {
        Length_TaskOne result = new Length_TaskOne(36, "inch").as("yard");

        assertThat(result.getVal(), is(1.0));
        assertThat(result.getUinnt(), is("yard"));
    }

    @Test
    public void should_18_inches_equals_half_yard() {
        Length_TaskOne result = new Length_TaskOne(18, "inch").as("yard");

        assertThat(result.getVal(), is(0.5));
        assertThat(result.getUinnt(), is("yard"));
    }
}
