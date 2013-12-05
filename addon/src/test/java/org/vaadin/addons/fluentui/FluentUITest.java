package org.vaadin.addons.fluentui;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.vaadin.ui.Label;

public class FluentUITest {

    @Test
    public void demonstrateUsage() {
        final Label l1 = new Label();
        l1.setCaption("foo");
        l1.setWidth("100%");
        l1.setHeight("100%");

        final Label l2 = FluentUI.label("foo").width("100%").height("100%").get();

        assertThat(l1.getWidth(), is(l2.getWidth()));
    }

}
