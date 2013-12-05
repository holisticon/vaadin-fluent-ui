package org.vaadin.addons.fluentui;

// CHECKSTYLE:OFF generated class

import java.util.Collection;
import java.util.Locale;

import javax.annotation.Generated;

import com.vaadin.data.Container;
import com.vaadin.data.Validator;
import com.vaadin.data.util.converter.Converter;
import com.vaadin.event.ShortcutListener;
import com.vaadin.server.ErrorHandler;
import com.vaadin.server.ErrorMessage;
import com.vaadin.server.Resource;
import com.vaadin.shared.ui.combobox.FilteringMode;
import com.vaadin.ui.ComboBox;

@Generated(value = "de.holisticon.toolbox.fluent.generator.FluentApiGenerator", date = "09.07.2013 13:44:32")
public final class FluentComboBox {

    /**
     * delegate
     */
    private final ComboBox comboBox;

    /**
     * Hide constructor, use static factory methods.
     */
    private FluentComboBox(final ComboBox comboBox) {
        this.comboBox = comboBox;
    }

    /**
     * @return
     *         the created instance
     */
    public final ComboBox get() {
        return comboBox;
    }

    public static FluentComboBox comboBox() {
        return new FluentComboBox(new ComboBox());
    }

    public static FluentComboBox comboBox(final String caption, final Collection<?> options) {
        return new FluentComboBox(new ComboBox(caption, options));
    }

    public static FluentComboBox comboBox(final String caption, final Container dataSource) {
        return new FluentComboBox(new ComboBox(caption, dataSource));
    }

    public static FluentComboBox comboBox(final String caption) {
        return new FluentComboBox(new ComboBox(caption));
    }

    public FluentComboBox width(final String width) {
        comboBox.setWidth(width);
        return this;
    }

    public FluentComboBox enabled(final boolean enabled) {
        comboBox.setEnabled(enabled);
        return this;
    }

    /**
     * @return
     *         #enabled(true)
     */
    public FluentComboBox enabled() {
        return this.enabled(true);
    }

    public FluentComboBox invalidCommitted(final boolean invalidCommitted) {
        comboBox.setInvalidCommitted(invalidCommitted);
        return this;
    }

    /**
     * @return
     *         #invalidCommitted(true)
     */
    public FluentComboBox invalidCommitted() {
        return this.invalidCommitted(true);
    }

    public FluentComboBox textInputAllowed(final boolean textInputAllowed) {
        comboBox.setTextInputAllowed(textInputAllowed);
        return this;
    }

    /**
     * @return
     *         #textInputAllowed(true)
     */
    public FluentComboBox textInputAllowed() {
        return this.textInputAllowed(true);
    }

    public FluentComboBox locale(final Locale locale) {
        comboBox.setLocale(locale);
        return this;
    }

    public FluentComboBox addBlurListener(final com.vaadin.event.FieldEvents.BlurListener... blurListeners) {
        for (final com.vaadin.event.FieldEvents.BlurListener blurListener : blurListeners) {
            comboBox.addBlurListener(blurListener);
        }
        return this;
    }

    public FluentComboBox tabIndex(final int tabIndex) {
        comboBox.setTabIndex(tabIndex);
        return this;
    }

    public FluentComboBox filteringMode(final FilteringMode filteringMode) {
        comboBox.setFilteringMode(filteringMode);
        return this;
    }

    public FluentComboBox data(final Object data) {
        comboBox.setData(data);
        return this;
    }

    public FluentComboBox nullSelectionItemId(final Object nullSelectionItemId) {
        comboBox.setNullSelectionItemId(nullSelectionItemId);
        return this;
    }

    public FluentComboBox addShortcutListener(final ShortcutListener... shortcutListeners) {
        for (final ShortcutListener shortcutListener : shortcutListeners) {
            comboBox.addShortcutListener(shortcutListener);
        }
        return this;
    }

    public FluentComboBox height(final String height) {
        comboBox.setHeight(height);
        return this;
    }

    public FluentComboBox scrollToSelectedItem(final boolean scrollToSelectedItem) {
        comboBox.setScrollToSelectedItem(scrollToSelectedItem);
        return this;
    }

    /**
     * @return
     *         #scrollToSelectedItem(true)
     */
    public FluentComboBox scrollToSelectedItem() {
        return this.scrollToSelectedItem(true);
    }

    public FluentComboBox addAttachListener(final com.vaadin.server.ClientConnector.AttachListener... attachListeners) {
        for (final com.vaadin.server.ClientConnector.AttachListener attachListener : attachListeners) {
            comboBox.addAttachListener(attachListener);
        }
        return this;
    }

    public FluentComboBox invalidAllowed(final boolean invalidAllowed) {
        comboBox.setInvalidAllowed(invalidAllowed);
        return this;
    }

    /**
     * @return
     *         #invalidAllowed(true)
     */
    public FluentComboBox invalidAllowed() {
        return this.invalidAllowed(true);
    }

    public FluentComboBox visible(final boolean visible) {
        comboBox.setVisible(visible);
        return this;
    }

    /**
     * @return
     *         #visible(true)
     */
    public FluentComboBox visible() {
        return this.visible(true);
    }

    public FluentComboBox itemIconPropertyId(final Object itemIconPropertyId) {
        comboBox.setItemIconPropertyId(itemIconPropertyId);
        return this;
    }

    public FluentComboBox pageLength(final int pageLength) {
        comboBox.setPageLength(pageLength);
        return this;
    }

    public FluentComboBox containerDataSource(final Container containerDataSource) {
        comboBox.setContainerDataSource(containerDataSource);
        return this;
    }

    public FluentComboBox styleName(final String styleName) {
        comboBox.setStyleName(styleName);
        return this;
    }

    public FluentComboBox addPropertySetChangeListener(final Container.PropertySetChangeListener... propertySetChangeListeners) {
        for (final Container.PropertySetChangeListener propertySetChangeListener : propertySetChangeListeners) {
            comboBox.addPropertySetChangeListener(propertySetChangeListener);
        }
        return this;
    }

    public FluentComboBox required(final boolean required) {
        comboBox.setRequired(required);
        return this;
    }

    /**
     * @return
     *         #required(true)
     */
    public FluentComboBox required() {
        return this.required(true);
    }

    public FluentComboBox addValueChangeListener(final com.vaadin.data.Property.ValueChangeListener... valueChangeListeners) {
        for (final com.vaadin.data.Property.ValueChangeListener valueChangeListener : valueChangeListeners) {
            comboBox.addValueChangeListener(valueChangeListener);
        }
        return this;
    }

    public FluentComboBox addReadOnlyStatusChangeListener(final com.vaadin.data.Property.ReadOnlyStatusChangeListener... readOnlyStatusChangeListeners) {
        for (final com.vaadin.data.Property.ReadOnlyStatusChangeListener readOnlyStatusChangeListener : readOnlyStatusChangeListeners) {
            comboBox.addReadOnlyStatusChangeListener(readOnlyStatusChangeListener);
        }
        return this;
    }

    public FluentComboBox errorHandler(final ErrorHandler errorHandler) {
        comboBox.setErrorHandler(errorHandler);
        return this;
    }

    public FluentComboBox addValidator(final Validator... validators) {
        for (final Validator validator : validators) {
            comboBox.addValidator(validator);
        }
        return this;
    }

    public FluentComboBox itemCaptionPropertyId(final Object itemCaptionPropertyId) {
        comboBox.setItemCaptionPropertyId(itemCaptionPropertyId);
        return this;
    }

    public FluentComboBox componentError(final ErrorMessage componentError) {
        comboBox.setComponentError(componentError);
        return this;
    }

    public FluentComboBox nullSelectionAllowed(final boolean nullSelectionAllowed) {
        comboBox.setNullSelectionAllowed(nullSelectionAllowed);
        return this;
    }

    /**
     * @return
     *         #nullSelectionAllowed(true)
     */
    public FluentComboBox nullSelectionAllowed() {
        return this.nullSelectionAllowed(true);
    }

    public FluentComboBox convertedValue(final Object convertedValue) {
        comboBox.setConvertedValue(convertedValue);
        return this;
    }

    public FluentComboBox primaryStyleName(final String primaryStyleName) {
        comboBox.setPrimaryStyleName(primaryStyleName);
        return this;
    }

    public FluentComboBox icon(final Resource icon) {
        comboBox.setIcon(icon);
        return this;
    }

    public FluentComboBox addListener(final com.vaadin.ui.Component.Listener... listeners) {
        for (final com.vaadin.ui.Component.Listener listener : listeners) {
            comboBox.addListener(listener);
        }
        return this;
    }

    public FluentComboBox inputPrompt(final String inputPrompt) {
        comboBox.setInputPrompt(inputPrompt);
        return this;
    }

    public FluentComboBox addFocusListener(final com.vaadin.event.FieldEvents.FocusListener... focusListeners) {
        for (final com.vaadin.event.FieldEvents.FocusListener focusListener : focusListeners) {
            comboBox.addFocusListener(focusListener);
        }
        return this;
    }

    public FluentComboBox addItemSetChangeListener(final Container.ItemSetChangeListener... itemSetChangeListeners) {
        for (final Container.ItemSetChangeListener itemSetChangeListener : itemSetChangeListeners) {
            comboBox.addItemSetChangeListener(itemSetChangeListener);
        }
        return this;
    }

    public FluentComboBox addItemWithCaption(final Object itemId, final String caption) {
        comboBox.addItem(itemId);
        comboBox.setItemCaption(itemId, caption);
        return this;
    }

    public FluentComboBox addItemWithCaption(final String caption) {
        return addItemWithCaption(caption, caption);
    }

    public FluentComboBox description(final String description) {
        comboBox.setDescription(description);
        return this;
    }

    public FluentComboBox conversionError(final String conversionError) {
        comboBox.setConversionError(conversionError);
        return this;
    }

    public FluentComboBox validationVisible(final boolean validationVisible) {
        comboBox.setValidationVisible(validationVisible);
        return this;
    }

    /**
     * @return
     *         #validationVisible(true)
     */
    public FluentComboBox validationVisible() {
        return this.validationVisible(true);
    }

    public FluentComboBox readOnly(final boolean readOnly) {
        comboBox.setReadOnly(readOnly);
        return this;
    }

    /**
     * @return
     *         #readOnly(true)
     */
    public FluentComboBox readOnly() {
        return this.readOnly(true);
    }

    public FluentComboBox converter(final Converter<Object, ?> converter) {
        comboBox.setConverter(converter);
        return this;
    }

    public FluentComboBox itemCaptionMode(final com.vaadin.ui.AbstractSelect.ItemCaptionMode itemCaptionMode) {
        comboBox.setItemCaptionMode(itemCaptionMode);
        return this;
    }

    public FluentComboBox addStyleName(final String... styleNames) {
        for (final String styleName : styleNames) {
            comboBox.addStyleName(styleName);
        }
        return this;
    }

    public FluentComboBox immediate(final boolean immediate) {
        comboBox.setImmediate(immediate);
        return this;
    }

    /**
     * @return
     *         #immediate(true)
     */
    public FluentComboBox immediate() {
        return this.immediate(true);
    }

    public FluentComboBox newItemHandler(final com.vaadin.ui.AbstractSelect.NewItemHandler newItemHandler) {
        comboBox.setNewItemHandler(newItemHandler);
        return this;
    }

    public FluentComboBox value(final Object value) {
        comboBox.setValue(value);
        return this;
    }

    public FluentComboBox addDetachListener(final com.vaadin.server.ClientConnector.DetachListener... detachListeners) {
        for (final com.vaadin.server.ClientConnector.DetachListener detachListener : detachListeners) {
            comboBox.addDetachListener(detachListener);
        }
        return this;
    }

    public FluentComboBox requiredError(final String requiredError) {
        comboBox.setRequiredError(requiredError);
        required(requiredError != null);
        return this;
    }

    public FluentComboBox buffered(final boolean buffered) {
        comboBox.setBuffered(buffered);
        return this;
    }

    /**
     * @return
     *         #buffered(true)
     */
    public FluentComboBox buffered() {
        return this.buffered(true);
    }

    public FluentComboBox caption(final String caption) {
        comboBox.setCaption(caption);
        return this;
    }

    public FluentComboBox newItemsAllowed(final boolean newItemsAllowed) {
        comboBox.setNewItemsAllowed(newItemsAllowed);
        return this;
    }

    /**
     * @return
     *         #newItemsAllowed(true)
     */
    public FluentComboBox newItemsAllowed() {
        return this.newItemsAllowed(true);
    }

}
