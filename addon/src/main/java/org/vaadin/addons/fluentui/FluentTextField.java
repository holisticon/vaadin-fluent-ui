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
import com.vaadin.ui.TextField;

@Generated(value = "de.holisticon.toolbox.fluent.generator.FluentApiGenerator", date = "09.07.2013 13:28:19")
public final class FluentTextField {

    /**
     * delegate
     */
    private final TextField textField;

    /**
     * Hide constructor, use static factory methods.
     */
    private FluentTextField(final TextField textField) {
        this.textField = textField;
        nullRepresentation("");
    }

    /**
     * @return
     *         the created instance
     */
    public final TextField get() {
        return textField;
    }

    public static FluentTextField textField() {
        return new FluentTextField(new TextField());
    }

    public static FluentTextField textField(final String string0) {
        return new FluentTextField(new TextField(string0));
    }

    public static FluentTextField textField(final Property<?> property0) {
        return new FluentTextField(new TextField(property0));
    }

    public static FluentTextField textField(final String string0, final Property<?> property1) {
        return new FluentTextField(new TextField(string0, property1));
    }

    public static FluentTextField textField(final String string0, final String string1) {
        return new FluentTextField(new TextField(string0, string1));
    }

    public FluentTextField width(final String width) {
        textField.setWidth(width);
        return this;
    }

    public FluentTextField enabled(final boolean enabled) {
        textField.setEnabled(enabled);
        return this;
    }

    /**
     * @return
     *         #enabled(true)
     */
    public FluentTextField enabled() {
        return this.enabled(true);
    }

    public FluentTextField invalidCommitted(final boolean invalidCommitted) {
        textField.setInvalidCommitted(invalidCommitted);
        return this;
    }

    /**
     * @return
     *         #invalidCommitted(true)
     */
    public FluentTextField invalidCommitted() {
        return this.invalidCommitted(true);
    }

    public FluentTextField addValueChangeListener(final Property.ValueChangeListener... valueChangeListeners) {
        for (final Property.ValueChangeListener valueChangeListener : valueChangeListeners) {
            textField.addValueChangeListener(valueChangeListener);
        }
        return this;
    }

    public FluentTextField locale(final Locale locale) {
        textField.setLocale(locale);
        return this;
    }

    public FluentTextField tabIndex(final int tabIndex) {
        textField.setTabIndex(tabIndex);
        return this;
    }

    public FluentTextField addReadOnlyStatusChangeListener(final Property.ReadOnlyStatusChangeListener... readOnlyStatusChangeListeners) {
        for (final Property.ReadOnlyStatusChangeListener readOnlyStatusChangeListener : readOnlyStatusChangeListeners) {
            textField.addReadOnlyStatusChangeListener(readOnlyStatusChangeListener);
        }
        return this;
    }

    public FluentTextField errorHandler(final ErrorHandler errorHandler) {
        textField.setErrorHandler(errorHandler);
        return this;
    }

    public FluentTextField addValidator(final Validator... validators) {
        for (final Validator validator : validators) {
            textField.addValidator(validator);
        }
        return this;
    }

    public FluentTextField data(final Object data) {
        textField.setData(data);
        return this;
    }

    public FluentTextField cursorPosition(final int cursorPosition) {
        textField.setCursorPosition(cursorPosition);
        return this;
    }

    public FluentTextField componentError(final ErrorMessage componentError) {
        textField.setComponentError(componentError);
        return this;
    }

    public FluentTextField value(final String value) {
        textField.setValue(value);
        return this;
    }

    public FluentTextField convertedValue(final Object convertedValue) {
        textField.setConvertedValue(convertedValue);
        return this;
    }

    public FluentTextField primaryStyleName(final String primaryStyleName) {
        textField.setPrimaryStyleName(primaryStyleName);
        return this;
    }

    public FluentTextField addShortcutListener(final ShortcutListener... shortcutListeners) {
        for (final ShortcutListener shortcutListener : shortcutListeners) {
            textField.addShortcutListener(shortcutListener);
        }
        return this;
    }

    public FluentTextField icon(final Resource icon) {
        textField.setIcon(icon);
        return this;
    }

    public FluentTextField height(final String height) {
        textField.setHeight(height);
        return this;
    }

    public FluentTextField addListener(final com.vaadin.ui.Component.Listener... listeners) {
        for (final com.vaadin.ui.Component.Listener listener : listeners) {
            textField.addListener(listener);
        }
        return this;
    }

    public FluentTextField textChangeEventMode(final com.vaadin.ui.AbstractTextField.TextChangeEventMode textChangeEventMode) {
        textField.setTextChangeEventMode(textChangeEventMode);
        return this;
    }

    public FluentTextField textChangeTimeout(final int textChangeTimeout) {
        textField.setTextChangeTimeout(textChangeTimeout);
        return this;
    }

    public FluentTextField nullSettingAllowed(final boolean nullSettingAllowed) {
        textField.setNullSettingAllowed(nullSettingAllowed);
        return this;
    }

    /**
     * @return
     *         #nullSettingAllowed(true)
     */
    public FluentTextField nullSettingAllowed() {
        return this.nullSettingAllowed(true);
    }

    public FluentTextField nullRepresentation(final String nullRepresentation) {
        textField.setNullRepresentation(nullRepresentation);
        return this;
    }

    public FluentTextField addAttachListener(final com.vaadin.server.ClientConnector.AttachListener... attachListeners) {
        for (final com.vaadin.server.ClientConnector.AttachListener attachListener : attachListeners) {
            textField.addAttachListener(attachListener);
        }
        return this;
    }

    public FluentTextField invalidAllowed(final boolean invalidAllowed) {
        textField.setInvalidAllowed(invalidAllowed);
        return this;
    }

    /**
     * @return
     *         #invalidAllowed(true)
     */
    public FluentTextField invalidAllowed() {
        return this.invalidAllowed(true);
    }

    public FluentTextField description(final String description) {
        textField.setDescription(description);
        return this;
    }

    public FluentTextField conversionError(final String conversionError) {
        textField.setConversionError(conversionError);
        return this;
    }

    public FluentTextField validationVisible(final boolean validationVisible) {
        textField.setValidationVisible(validationVisible);
        return this;
    }

    /**
     * @return
     *         #validationVisible(true)
     */
    public FluentTextField validationVisible() {
        return this.validationVisible(true);
    }

    public FluentTextField readOnly(final boolean readOnly) {
        textField.setReadOnly(readOnly);
        return this;
    }

    /**
     * @return
     *         #readOnly(true)
     */
    public FluentTextField readOnly() {
        return this.readOnly(true);
    }

    public FluentTextField converter(final Converter<String, ?> converter) {
        textField.setConverter(converter);
        return this;
    }

    public FluentTextField visible(final boolean visible) {
        textField.setVisible(visible);
        return this;
    }

    /**
     * @return
     *         #visible(true)
     */
    public FluentTextField visible() {
        return this.visible(true);
    }

    public FluentTextField inputPrompt(final String inputPrompt) {
        textField.setInputPrompt(inputPrompt);
        return this;
    }

    public FluentTextField addFocusListener(final com.vaadin.event.FieldEvents.FocusListener... focusListeners) {
        for (final com.vaadin.event.FieldEvents.FocusListener focusListener : focusListeners) {
            textField.addFocusListener(focusListener);
        }
        return this;
    }

    public FluentTextField columns(final int columns) {
        textField.setColumns(columns);
        return this;
    }

    public FluentTextField addStyleName(final String... styleNames) {
        for (final String styleName : styleNames) {
            textField.addStyleName(styleName);
        }
        return this;
    }

    public FluentTextField maxLength(final int maxLength) {
        textField.setMaxLength(maxLength);
        return this;
    }

    public FluentTextField immediate(final boolean immediate) {
        textField.setImmediate(immediate);
        return this;
    }

    /**
     * @return
     *         #immediate(true)
     */
    public FluentTextField immediate() {
        return this.immediate(true);
    }

    public FluentTextField addBlurListener(final com.vaadin.event.FieldEvents.BlurListener... blurListeners) {
        for (final com.vaadin.event.FieldEvents.BlurListener blurListener : blurListeners) {
            textField.addBlurListener(blurListener);
        }
        return this;
    }

    public FluentTextField addDetachListener(final com.vaadin.server.ClientConnector.DetachListener... detachListeners) {
        for (final com.vaadin.server.ClientConnector.DetachListener detachListener : detachListeners) {
            textField.addDetachListener(detachListener);
        }
        return this;
    }

    public FluentTextField requiredError(final String requiredError) {
        textField.setRequiredError(requiredError);
        required(requiredError != null);
        return this;
    }

    public FluentTextField buffered(final boolean buffered) {
        textField.setBuffered(buffered);
        return this;
    }

    /**
     * @return
     *         #buffered(true)
     */
    public FluentTextField buffered() {
        return this.buffered(true);
    }

    public FluentTextField caption(final String caption) {
        textField.setCaption(caption);
        return this;
    }

    public FluentTextField styleName(final String styleName) {
        textField.setStyleName(styleName);
        return this;
    }

    public FluentTextField required(final boolean required) {
        textField.setRequired(required);
        return this;
    }

    /**
     * @return
     *         #required(true)
     */
    public FluentTextField required() {
        return this.required(true);
    }

    public FluentTextField addTextChangeListener(final com.vaadin.event.FieldEvents.TextChangeListener... textChangeListeners) {
        for (final com.vaadin.event.FieldEvents.TextChangeListener textChangeListener : textChangeListeners) {
            textField.addTextChangeListener(textChangeListener);
        }
        return this;
    }

}
