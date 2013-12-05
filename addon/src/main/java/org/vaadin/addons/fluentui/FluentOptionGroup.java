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
import com.vaadin.ui.OptionGroup;

@Generated(value = "de.holisticon.toolbox.fluent.generator.FluentApiGenerator", date = "09.07.2013 13:44:32")
public final class FluentOptionGroup {

    /**
     * delegate
     */
    private final OptionGroup optionGroup;

    /**
     * Hide constructor, use static factory methods.
     */
    private FluentOptionGroup(final OptionGroup optionGroup) {
        this.optionGroup = optionGroup;
    }

    /**
     * @return
     *         the created instance
     */
    public final OptionGroup get() {
        return optionGroup;
    }

    public static FluentOptionGroup optionGroup(final String string0) {
        return new FluentOptionGroup(new OptionGroup(string0));
    }

    public static FluentOptionGroup optionGroup(final String string0, final Collection<?> collection1) {
        return new FluentOptionGroup(new OptionGroup(string0, collection1));
    }

    public static FluentOptionGroup optionGroup(final String string0, final Container container1) {
        return new FluentOptionGroup(new OptionGroup(string0, container1));
    }

    public static FluentOptionGroup optionGroup() {
        return new FluentOptionGroup(new OptionGroup());
    }

    public FluentOptionGroup width(final String width) {
        optionGroup.setWidth(width);
        return this;
    }

    public FluentOptionGroup enabled(final boolean enabled) {
        optionGroup.setEnabled(enabled);
        return this;
    }

    /**
     * @return
     *         #enabled(true)
     */
    public FluentOptionGroup enabled() {
        return this.enabled(true);
    }

    public FluentOptionGroup invalidCommitted(final boolean invalidCommitted) {
        optionGroup.setInvalidCommitted(invalidCommitted);
        return this;
    }

    /**
     * @return
     *         #invalidCommitted(true)
     */
    public FluentOptionGroup invalidCommitted() {
        return this.invalidCommitted(true);
    }

    public FluentOptionGroup locale(final Locale locale) {
        optionGroup.setLocale(locale);
        return this;
    }

    public FluentOptionGroup tabIndex(final int tabIndex) {
        optionGroup.setTabIndex(tabIndex);
        return this;
    }

    public FluentOptionGroup data(final Object data) {
        optionGroup.setData(data);
        return this;
    }

    public FluentOptionGroup nullSelectionItemId(final Object nullSelectionItemId) {
        optionGroup.setNullSelectionItemId(nullSelectionItemId);
        return this;
    }

    public FluentOptionGroup addShortcutListener(final ShortcutListener... shortcutListeners) {
        for (final ShortcutListener shortcutListener : shortcutListeners) {
            optionGroup.addShortcutListener(shortcutListener);
        }
        return this;
    }

    public FluentOptionGroup height(final String height) {
        optionGroup.setHeight(height);
        return this;
    }

    public FluentOptionGroup addAttachListener(final com.vaadin.server.ClientConnector.AttachListener... attachListeners) {
        for (final com.vaadin.server.ClientConnector.AttachListener attachListener : attachListeners) {
            optionGroup.addAttachListener(attachListener);
        }
        return this;
    }

    public FluentOptionGroup invalidAllowed(final boolean invalidAllowed) {
        optionGroup.setInvalidAllowed(invalidAllowed);
        return this;
    }

    /**
     * @return
     *         #invalidAllowed(true)
     */
    public FluentOptionGroup invalidAllowed() {
        return this.invalidAllowed(true);
    }

    public FluentOptionGroup visible(final boolean visible) {
        optionGroup.setVisible(visible);
        return this;
    }

    /**
     * @return
     *         #visible(true)
     */
    public FluentOptionGroup visible() {
        return this.visible(true);
    }

    public FluentOptionGroup itemIconPropertyId(final Object itemIconPropertyId) {
        optionGroup.setItemIconPropertyId(itemIconPropertyId);
        return this;
    }

    public FluentOptionGroup containerDataSource(final Container containerDataSource) {
        optionGroup.setContainerDataSource(containerDataSource);
        return this;
    }

    public FluentOptionGroup addFocusListener(final com.vaadin.event.FieldEvents.FocusListener... focusListeners) {
        for (final com.vaadin.event.FieldEvents.FocusListener focusListener : focusListeners) {
            optionGroup.addFocusListener(focusListener);
        }
        return this;
    }

    public FluentOptionGroup styleName(final String styleName) {
        optionGroup.setStyleName(styleName);
        return this;
    }

    public FluentOptionGroup addPropertySetChangeListener(final Container.PropertySetChangeListener... propertySetChangeListeners) {
        for (final Container.PropertySetChangeListener propertySetChangeListener : propertySetChangeListeners) {
            optionGroup.addPropertySetChangeListener(propertySetChangeListener);
        }
        return this;
    }

    public FluentOptionGroup required(final boolean required) {
        optionGroup.setRequired(required);
        return this;
    }

    /**
     * @return
     *         #required(true)
     */
    public FluentOptionGroup required() {
        return this.required(true);
    }

    public FluentOptionGroup addValueChangeListener(final com.vaadin.data.Property.ValueChangeListener... valueChangeListeners) {
        for (final com.vaadin.data.Property.ValueChangeListener valueChangeListener : valueChangeListeners) {
            optionGroup.addValueChangeListener(valueChangeListener);
        }
        return this;
    }

    public FluentOptionGroup addReadOnlyStatusChangeListener(final com.vaadin.data.Property.ReadOnlyStatusChangeListener... readOnlyStatusChangeListeners) {
        for (final com.vaadin.data.Property.ReadOnlyStatusChangeListener readOnlyStatusChangeListener : readOnlyStatusChangeListeners) {
            optionGroup.addReadOnlyStatusChangeListener(readOnlyStatusChangeListener);
        }
        return this;
    }

    public FluentOptionGroup errorHandler(final ErrorHandler errorHandler) {
        optionGroup.setErrorHandler(errorHandler);
        return this;
    }

    public FluentOptionGroup addValidator(final Validator... validators) {
        for (final Validator validator : validators) {
            optionGroup.addValidator(validator);
        }
        return this;
    }

    public FluentOptionGroup addItemWithCaption(final Object itemId, final String caption) {
        optionGroup.addItem(itemId);
        optionGroup.setItemCaption(itemId, caption);
        return this;
    }

    public FluentOptionGroup addItemWithCaption(final String caption) {
        return addItemWithCaption(caption, caption);
    }

    public FluentOptionGroup itemCaptionPropertyId(final Object itemCaptionPropertyId) {
        optionGroup.setItemCaptionPropertyId(itemCaptionPropertyId);
        return this;
    }

    public FluentOptionGroup componentError(final ErrorMessage componentError) {
        optionGroup.setComponentError(componentError);
        return this;
    }

    public FluentOptionGroup nullSelectionAllowed(final boolean nullSelectionAllowed) {
        optionGroup.setNullSelectionAllowed(nullSelectionAllowed);
        return this;
    }

    /**
     * @return
     *         #nullSelectionAllowed(true)
     */
    public FluentOptionGroup nullSelectionAllowed() {
        return this.nullSelectionAllowed(true);
    }

    public FluentOptionGroup convertedValue(final Object convertedValue) {
        optionGroup.setConvertedValue(convertedValue);
        return this;
    }

    public FluentOptionGroup primaryStyleName(final String primaryStyleName) {
        optionGroup.setPrimaryStyleName(primaryStyleName);
        return this;
    }

    public FluentOptionGroup icon(final Resource icon) {
        optionGroup.setIcon(icon);
        return this;
    }

    public FluentOptionGroup multiSelect(final boolean multiSelect) {
        optionGroup.setMultiSelect(multiSelect);
        return this;
    }

    /**
     * @return
     *         #multiSelect(true)
     */
    public FluentOptionGroup multiSelect() {
        return this.multiSelect(true);
    }

    public FluentOptionGroup addListener(final com.vaadin.ui.Component.Listener... listeners) {
        for (final com.vaadin.ui.Component.Listener listener : listeners) {
            optionGroup.addListener(listener);
        }
        return this;
    }

    public FluentOptionGroup htmlContentAllowed(final boolean htmlContentAllowed) {
        optionGroup.setHtmlContentAllowed(htmlContentAllowed);
        return this;
    }

    /**
     * @return
     *         #htmlContentAllowed(true)
     */
    public FluentOptionGroup htmlContentAllowed() {
        return this.htmlContentAllowed(true);
    }

    public FluentOptionGroup addBlurListener(final com.vaadin.event.FieldEvents.BlurListener... blurListeners) {
        for (final com.vaadin.event.FieldEvents.BlurListener blurListener : blurListeners) {
            optionGroup.addBlurListener(blurListener);
        }
        return this;
    }

    public FluentOptionGroup addItemSetChangeListener(final Container.ItemSetChangeListener... itemSetChangeListeners) {
        for (final Container.ItemSetChangeListener itemSetChangeListener : itemSetChangeListeners) {
            optionGroup.addItemSetChangeListener(itemSetChangeListener);
        }
        return this;
    }

    public FluentOptionGroup description(final String description) {
        optionGroup.setDescription(description);
        return this;
    }

    public FluentOptionGroup conversionError(final String conversionError) {
        optionGroup.setConversionError(conversionError);
        return this;
    }

    public FluentOptionGroup validationVisible(final boolean validationVisible) {
        optionGroup.setValidationVisible(validationVisible);
        return this;
    }

    /**
     * @return
     *         #validationVisible(true)
     */
    public FluentOptionGroup validationVisible() {
        return this.validationVisible(true);
    }

    public FluentOptionGroup readOnly(final boolean readOnly) {
        optionGroup.setReadOnly(readOnly);
        return this;
    }

    /**
     * @return
     *         #readOnly(true)
     */
    public FluentOptionGroup readOnly() {
        return this.readOnly(true);
    }

    public FluentOptionGroup converter(final Converter<Object, ?> converter) {
        optionGroup.setConverter(converter);
        return this;
    }

    public FluentOptionGroup itemCaptionMode(final com.vaadin.ui.AbstractSelect.ItemCaptionMode itemCaptionMode) {
        optionGroup.setItemCaptionMode(itemCaptionMode);
        return this;
    }

    public FluentOptionGroup addStyleName(final String... styleNames) {
        for (final String styleName : styleNames) {
            optionGroup.addStyleName(styleName);
        }
        return this;
    }

    public FluentOptionGroup immediate(final boolean immediate) {
        optionGroup.setImmediate(immediate);
        return this;
    }

    /**
     * @return
     *         #immediate(true)
     */
    public FluentOptionGroup immediate() {
        return this.immediate(true);
    }

    public FluentOptionGroup newItemHandler(final com.vaadin.ui.AbstractSelect.NewItemHandler newItemHandler) {
        optionGroup.setNewItemHandler(newItemHandler);
        return this;
    }

    public FluentOptionGroup value(final Object value) {
        optionGroup.setValue(value);
        return this;
    }

    public FluentOptionGroup addDetachListener(final com.vaadin.server.ClientConnector.DetachListener... detachListeners) {
        for (final com.vaadin.server.ClientConnector.DetachListener detachListener : detachListeners) {
            optionGroup.addDetachListener(detachListener);
        }
        return this;
    }

    public FluentOptionGroup requiredError(final String requiredError) {
        optionGroup.setRequiredError(requiredError);
        required(requiredError != null);
        return this;
    }

    public FluentOptionGroup buffered(final boolean buffered) {
        optionGroup.setBuffered(buffered);
        return this;
    }

    /**
     * @return
     *         #buffered(true)
     */
    public FluentOptionGroup buffered() {
        return this.buffered(true);
    }

    public FluentOptionGroup caption(final String caption) {
        optionGroup.setCaption(caption);
        return this;
    }

    public FluentOptionGroup newItemsAllowed(final boolean newItemsAllowed) {
        optionGroup.setNewItemsAllowed(newItemsAllowed);
        return this;
    }

    /**
     * @return
     *         #newItemsAllowed(true)
     */
    public FluentOptionGroup newItemsAllowed() {
        return this.newItemsAllowed(true);
    }

}
