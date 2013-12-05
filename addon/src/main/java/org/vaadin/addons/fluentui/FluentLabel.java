package org.vaadin.addons.fluentui;


// CHECKSTYLE:OFF generated class
import java.util.Locale;
import javax.annotation.Generated;
import com.vaadin.data.Property;
import com.vaadin.data.util.converter.Converter;
import com.vaadin.event.ShortcutListener;
import com.vaadin.server.ErrorHandler;
import com.vaadin.server.ErrorMessage;
import com.vaadin.server.Resource;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.Label;

@Generated(value = "de.holisticon.toolbox.fluent.generator.FluentApiGenerator", date = "09.07.2013 13:44:32")
public final class FluentLabel {

    /**
     * delegate
     */
    private final Label label;

    /**
     * Hide constructor, use static factory methods.
     */
    private FluentLabel(final Label label) {
        this.label = label;
    }

    /**
     * @return
     *         the created instance
     */
    public final Label get() {
        return label;
    }

    public static FluentLabel label() {
        return new FluentLabel(new Label());
    }

    public static FluentLabel label(final String string0) {
        return new FluentLabel(new Label(string0));
    }

    public static FluentLabel label(final Property<?> property0) {
        return new FluentLabel(new Label(property0));
    }

    public static FluentLabel label(final String string0, final ContentMode contentMode1) {
        return new FluentLabel(new Label(string0, contentMode1));
    }

    public static FluentLabel label(final Property<?> property0, final ContentMode contentMode1) {
        return new FluentLabel(new Label(property0, contentMode1));
    }

    public FluentLabel width(final String width) {
        label.setWidth(width);
        return this;
    }

    public FluentLabel enabled(final boolean enabled) {
        label.setEnabled(enabled);
        return this;
    }

    /**
     * @return
     *         #enabled(true)
     */
    public FluentLabel enabled() {
        return this.enabled(true);
    }

    public FluentLabel addValueChangeListener(final Property.ValueChangeListener... valueChangeListeners) {
        for (final Property.ValueChangeListener valueChangeListener : valueChangeListeners) {
            label.addValueChangeListener(valueChangeListener);
        }
        return this;
    }

    public FluentLabel locale(final Locale locale) {
        label.setLocale(locale);
        return this;
    }

    public FluentLabel errorHandler(final ErrorHandler errorHandler) {
        label.setErrorHandler(errorHandler);
        return this;
    }

    public FluentLabel data(final Object data) {
        label.setData(data);
        return this;
    }

    public FluentLabel value(final String value) {
        label.setValue(value);
        return this;
    }

    public FluentLabel componentError(final ErrorMessage componentError) {
        label.setComponentError(componentError);
        return this;
    }

    public FluentLabel primaryStyleName(final String primaryStyleName) {
        label.setPrimaryStyleName(primaryStyleName);
        return this;
    }

    public FluentLabel addShortcutListener(final ShortcutListener... shortcutListeners) {
        for (final ShortcutListener shortcutListener : shortcutListeners) {
            label.addShortcutListener(shortcutListener);
        }
        return this;
    }

    public FluentLabel icon(final Resource icon) {
        label.setIcon(icon);
        return this;
    }

    public FluentLabel height(final String height) {
        label.setHeight(height);
        return this;
    }

    public FluentLabel addListener(final com.vaadin.ui.Component.Listener... listeners) {
        for (final com.vaadin.ui.Component.Listener listener : listeners) {
            label.addListener(listener);
        }
        return this;
    }

    public FluentLabel addAttachListener(final com.vaadin.server.ClientConnector.AttachListener... attachListeners) {
        for (final com.vaadin.server.ClientConnector.AttachListener attachListener : attachListeners) {
            label.addAttachListener(attachListener);
        }
        return this;
    }

    public FluentLabel description(final String description) {
        label.setDescription(description);
        return this;
    }

    public FluentLabel converter(final Converter<String, ?> converter) {
        label.setConverter(converter);
        return this;
    }

    public FluentLabel visible(final boolean visible) {
        label.setVisible(visible);
        return this;
    }

    /**
     * @return
     *         #visible(true)
     */
    public FluentLabel visible() {
        return this.visible(true);
    }

    public FluentLabel addStyleName(final String... styleNames) {
        for (final String styleName : styleNames) {
            label.addStyleName(styleName);
        }
        return this;
    }

    public FluentLabel contentMode(final ContentMode contentMode) {
        label.setContentMode(contentMode);
        return this;
    }

    public FluentLabel immediate(final boolean immediate) {
        label.setImmediate(immediate);
        return this;
    }

    /**
     * @return
     *         #immediate(true)
     */
    public FluentLabel immediate() {
        return this.immediate(true);
    }

    public FluentLabel readOnly(final boolean readOnly) {
        label.setReadOnly(readOnly);
        return this;
    }

    /**
     * @return
     *         #readOnly(true)
     */
    public FluentLabel readOnly() {
        return this.readOnly(true);
    }

    public FluentLabel addDetachListener(final com.vaadin.server.ClientConnector.DetachListener... detachListeners) {
        for (final com.vaadin.server.ClientConnector.DetachListener detachListener : detachListeners) {
            label.addDetachListener(detachListener);
        }
        return this;
    }

    public FluentLabel caption(final String caption) {
        label.setCaption(caption);
        return this;
    }

    public FluentLabel styleName(final String styleName) {
        label.setStyleName(styleName);
        return this;
    }

}
