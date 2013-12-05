package org.vaadin.addons.fluentui;


// CHECKSTYLE:OFF generated class

import java.util.Locale;
import javax.annotation.Generated;
import com.vaadin.data.Property;
import com.vaadin.data.Validator;
import com.vaadin.data.util.converter.Converter;
import com.vaadin.event.ShortcutListener;
import com.vaadin.server.ErrorHandler;
import com.vaadin.server.ErrorMessage;
import com.vaadin.server.Resource;
import com.vaadin.ui.TextArea;

@Generated(value = "de.holisticon.toolbox.fluent.generator.FluentApiGenerator", date = "09.07.2013 13:39:01")
public final class FluentTextArea {

    /**
     * delegate
     */
    private final TextArea textArea;

    /**
     * Hide constructor, use static factory methods.
     */
    private FluentTextArea(final TextArea textArea) {
        this.textArea = textArea;
        nullRepresentation("");
    }

    /**
     * @return
     *         the created instance
     */
    public final TextArea get() {
        return textArea;
    }

    public static FluentTextArea textArea(final String caption) {
        return new FluentTextArea(new TextArea(caption));
    }

    public static FluentTextArea textArea() {
        return new FluentTextArea(new TextArea());
    }

    public static FluentTextArea textArea(final Property<?> property0) {
        return new FluentTextArea(new TextArea(property0));
    }

    public static FluentTextArea textArea(final String caption, final Property<?> property1) {
        return new FluentTextArea(new TextArea(caption, property1));
    }

    public static FluentTextArea textArea(final String caption, final String string1) {
        return new FluentTextArea(new TextArea(caption, string1));
    }

    public FluentTextArea width(final String width) {
        textArea.setWidth(width);
        return this;
    }

    public FluentTextArea enabled(final boolean enabled) {
        textArea.setEnabled(enabled);
        return this;
    }

    /**
     * @return
     *         #enabled(true)
     */
    public FluentTextArea enabled() {
        return this.enabled(true);
    }

    public FluentTextArea invalidCommitted(final boolean invalidCommitted) {
        textArea.setInvalidCommitted(invalidCommitted);
        return this;
    }

    /**
     * @return
     *         #invalidCommitted(true)
     */
    public FluentTextArea invalidCommitted() {
        return this.invalidCommitted(true);
    }

    public FluentTextArea addValueChangeListener(final Property.ValueChangeListener... valueChangeListeners) {
        for (final Property.ValueChangeListener valueChangeListener : valueChangeListeners) {
            textArea.addValueChangeListener(valueChangeListener);
        }
        return this;
    }

    public FluentTextArea locale(final Locale locale) {
        textArea.setLocale(locale);
        return this;
    }

    public FluentTextArea tabIndex(final int tabIndex) {
        textArea.setTabIndex(tabIndex);
        return this;
    }

    public FluentTextArea addReadOnlyStatusChangeListener(final Property.ReadOnlyStatusChangeListener... readOnlyStatusChangeListeners) {
        for (final Property.ReadOnlyStatusChangeListener readOnlyStatusChangeListener : readOnlyStatusChangeListeners) {
            textArea.addReadOnlyStatusChangeListener(readOnlyStatusChangeListener);
        }
        return this;
    }

    public FluentTextArea errorHandler(final ErrorHandler errorHandler) {
        textArea.setErrorHandler(errorHandler);
        return this;
    }

    public FluentTextArea addValidator(final Validator... validators) {
        for (final Validator validator : validators) {
            textArea.addValidator(validator);
        }
        return this;
    }

    public FluentTextArea data(final Object data) {
        textArea.setData(data);
        return this;
    }

    public FluentTextArea cursorPosition(final int cursorPosition) {
        textArea.setCursorPosition(cursorPosition);
        return this;
    }

    public FluentTextArea componentError(final ErrorMessage componentError) {
        textArea.setComponentError(componentError);
        return this;
    }

    public FluentTextArea value(final String value) {
        textArea.setValue(value);
        return this;
    }

    public FluentTextArea convertedValue(final Object convertedValue) {
        textArea.setConvertedValue(convertedValue);
        return this;
    }

    public FluentTextArea primaryStyleName(final String primaryStyleName) {
        textArea.setPrimaryStyleName(primaryStyleName);
        return this;
    }

    public FluentTextArea addShortcutListener(final ShortcutListener... shortcutListeners) {
        for (final ShortcutListener shortcutListener : shortcutListeners) {
            textArea.addShortcutListener(shortcutListener);
        }
        return this;
    }

    public FluentTextArea icon(final Resource icon) {
        textArea.setIcon(icon);
        return this;
    }

    public FluentTextArea height(final String height) {
        textArea.setHeight(height);
        return this;
    }

    public FluentTextArea addListener(final com.vaadin.ui.Component.Listener... listeners) {
        for (final com.vaadin.ui.Component.Listener listener : listeners) {
            textArea.addListener(listener);
        }
        return this;
    }

    public FluentTextArea textChangeEventMode(final com.vaadin.ui.AbstractTextField.TextChangeEventMode textChangeEventMode) {
        textArea.setTextChangeEventMode(textChangeEventMode);
        return this;
    }

    public FluentTextArea textChangeTimeout(final int textChangeTimeout) {
        textArea.setTextChangeTimeout(textChangeTimeout);
        return this;
    }

    public FluentTextArea nullSettingAllowed(final boolean nullSettingAllowed) {
        textArea.setNullSettingAllowed(nullSettingAllowed);
        return this;
    }

    /**
     * @return
     *         #nullSettingAllowed(true)
     */
    public FluentTextArea nullSettingAllowed() {
        return this.nullSettingAllowed(true);
    }

    public FluentTextArea nullRepresentation(final String nullRepresentation) {
        textArea.setNullRepresentation(nullRepresentation);
        return this;
    }

    public FluentTextArea rows(final int rows) {
        textArea.setRows(rows);
        return this;
    }

    public FluentTextArea addAttachListener(final com.vaadin.server.ClientConnector.AttachListener... attachListeners) {
        for (final com.vaadin.server.ClientConnector.AttachListener attachListener : attachListeners) {
            textArea.addAttachListener(attachListener);
        }
        return this;
    }

    public FluentTextArea invalidAllowed(final boolean invalidAllowed) {
        textArea.setInvalidAllowed(invalidAllowed);
        return this;
    }

    /**
     * @return
     *         #invalidAllowed(true)
     */
    public FluentTextArea invalidAllowed() {
        return this.invalidAllowed(true);
    }

    public FluentTextArea description(final String description) {
        textArea.setDescription(description);
        return this;
    }

    public FluentTextArea conversionError(final String conversionError) {
        textArea.setConversionError(conversionError);
        return this;
    }

    public FluentTextArea validationVisible(final boolean validationVisible) {
        textArea.setValidationVisible(validationVisible);
        return this;
    }

    /**
     * @return
     *         #validationVisible(true)
     */
    public FluentTextArea validationVisible() {
        return this.validationVisible(true);
    }

    public FluentTextArea readOnly(final boolean readOnly) {
        textArea.setReadOnly(readOnly);
        return this;
    }

    /**
     * @return
     *         #readOnly(true)
     */
    public FluentTextArea readOnly() {
        return this.readOnly(true);
    }

    public FluentTextArea converter(final Converter<String, ?> converter) {
        textArea.setConverter(converter);
        return this;
    }

    public FluentTextArea visible(final boolean visible) {
        textArea.setVisible(visible);
        return this;
    }

    /**
     * @return
     *         #visible(true)
     */
    public FluentTextArea visible() {
        return this.visible(true);
    }

    public FluentTextArea inputPrompt(final String inputPrompt) {
        textArea.setInputPrompt(inputPrompt);
        return this;
    }

    public FluentTextArea addFocusListener(final com.vaadin.event.FieldEvents.FocusListener... focusListeners) {
        for (final com.vaadin.event.FieldEvents.FocusListener focusListener : focusListeners) {
            textArea.addFocusListener(focusListener);
        }
        return this;
    }

    public FluentTextArea columns(final int columns) {
        textArea.setColumns(columns);
        return this;
    }

    public FluentTextArea addStyleName(final String... styleNames) {
        for (final String styleName : styleNames) {
            textArea.addStyleName(styleName);
        }
        return this;
    }

    public FluentTextArea maxLength(final int maxLength) {
        textArea.setMaxLength(maxLength);
        return this;
    }

    public FluentTextArea immediate(final boolean immediate) {
        textArea.setImmediate(immediate);
        return this;
    }

    /**
     * @return
     *         #immediate(true)
     */
    public FluentTextArea immediate() {
        return this.immediate(true);
    }

    public FluentTextArea addBlurListener(final com.vaadin.event.FieldEvents.BlurListener... blurListeners) {
        for (final com.vaadin.event.FieldEvents.BlurListener blurListener : blurListeners) {
            textArea.addBlurListener(blurListener);
        }
        return this;
    }

    public FluentTextArea wordwrap(final boolean wordwrap) {
        textArea.setWordwrap(wordwrap);
        return this;
    }

    /**
     * @return
     *         #wordwrap(true)
     */
    public FluentTextArea wordwrap() {
        return this.wordwrap(true);
    }

    public FluentTextArea addDetachListener(final com.vaadin.server.ClientConnector.DetachListener... detachListeners) {
        for (final com.vaadin.server.ClientConnector.DetachListener detachListener : detachListeners) {
            textArea.addDetachListener(detachListener);
        }
        return this;
    }

    public FluentTextArea requiredError(final String requiredError) {
        textArea.setRequiredError(requiredError);
        required(requiredError != null);
        return this;
    }

    public FluentTextArea buffered(final boolean buffered) {
        textArea.setBuffered(buffered);
        return this;
    }

    /**
     * @return
     *         #buffered(true)
     */
    public FluentTextArea buffered() {
        return this.buffered(true);
    }

    public FluentTextArea caption(final String caption) {
        textArea.setCaption(caption);
        return this;
    }

    public FluentTextArea styleName(final String styleName) {
        textArea.setStyleName(styleName);
        return this;
    }

    public FluentTextArea required(final boolean required) {
        textArea.setRequired(required);
        return this;
    }

    /**
     * @return
     *         #required(true)
     */
    public FluentTextArea required() {
        return this.required(true);
    }

    public FluentTextArea addTextChangeListener(final com.vaadin.event.FieldEvents.TextChangeListener... textChangeListeners) {
        for (final com.vaadin.event.FieldEvents.TextChangeListener textChangeListener : textChangeListeners) {
            textArea.addTextChangeListener(textChangeListener);
        }
        return this;
    }

}
