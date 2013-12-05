package org.vaadin.addons.fluentui;


// CHECKSTYLE:OFF generated class
import java.util.Locale;
import javax.annotation.Generated;
import com.vaadin.data.Container;
import com.vaadin.data.Validator;
import com.vaadin.data.util.converter.Converter;
import com.vaadin.event.ShortcutListener;
import com.vaadin.event.dd.DropHandler;
import com.vaadin.server.ErrorHandler;
import com.vaadin.server.ErrorMessage;
import com.vaadin.server.Resource;
import com.vaadin.shared.ui.MultiSelectMode;
import com.vaadin.ui.Table;
import com.vaadin.ui.TableFieldFactory;

@Generated(value = "de.holisticon.toolbox.fluent.generator.FluentApiGenerator", date = "09.07.2013 13:44:33")
public final class FluentTable {

    /**
     * delegate
     */
    private final Table table;

    /**
     * Hide constructor, use static factory methods.
     */
    private FluentTable(final Table table) {
        this.table = table;
    }

    /**
     * @return
     *         the created instance
     */
    public final Table get() {
        return table;
    }

    public static FluentTable table() {
        return new FluentTable(new Table());
    }

    public static FluentTable table(final String string0) {
        return new FluentTable(new Table(string0));
    }

    public static FluentTable table(final String string0, final Container container1) {
        return new FluentTable(new Table(string0, container1));
    }

    public FluentTable width(final String width) {
        table.setWidth(width);
        return this;
    }

    public FluentTable invalidCommitted(final boolean invalidCommitted) {
        table.setInvalidCommitted(invalidCommitted);
        return this;
    }

    /**
     * @return
     *         #invalidCommitted(true)
     */
    public FluentTable invalidCommitted() {
        return this.invalidCommitted(true);
    }

    public FluentTable locale(final Locale locale) {
        table.setLocale(locale);
        return this;
    }

    public FluentTable tabIndex(final int tabIndex) {
        table.setTabIndex(tabIndex);
        return this;
    }

    public FluentTable sortContainerPropertyId(final Object sortContainerPropertyId) {
        table.setSortContainerPropertyId(sortContainerPropertyId);
        return this;
    }

    public FluentTable currentPageFirstItemIndex(final int currentPageFirstItemIndex) {
        table.setCurrentPageFirstItemIndex(currentPageFirstItemIndex);
        return this;
    }

    public FluentTable data(final Object data) {
        table.setData(data);
        return this;
    }

    public FluentTable columnIcons(final Resource[] columnIcons) {
        table.setColumnIcons(columnIcons);
        return this;
    }

    public FluentTable itemDescriptionGenerator(final com.vaadin.ui.AbstractSelect.ItemDescriptionGenerator itemDescriptionGenerator) {
        table.setItemDescriptionGenerator(itemDescriptionGenerator);
        return this;
    }

    public FluentTable addActionHandler(final com.vaadin.event.Action.Handler... actionHandlers) {
        for (final com.vaadin.event.Action.Handler actionHandler : actionHandlers) {
            table.addActionHandler(actionHandler);
        }
        return this;
    }

    public FluentTable selectable(final boolean selectable) {
        table.setSelectable(selectable);
        return this;
    }

    /**
     * @return
     *         #selectable(true)
     */
    public FluentTable selectable() {
        return this.selectable(true);
    }

    public FluentTable addItemClickListener(final com.vaadin.event.ItemClickEvent.ItemClickListener... itemClickListeners) {
        for (final com.vaadin.event.ItemClickEvent.ItemClickListener itemClickListener : itemClickListeners) {
            table.addItemClickListener(itemClickListener);
        }
        return this;
    }

    public FluentTable nullSelectionItemId(final Object nullSelectionItemId) {
        table.setNullSelectionItemId(nullSelectionItemId);
        return this;
    }

    public FluentTable addShortcutListener(final ShortcutListener... shortcutListeners) {
        for (final ShortcutListener shortcutListener : shortcutListeners) {
            table.addShortcutListener(shortcutListener);
        }
        return this;
    }

    public FluentTable cacheRate(final double cacheRate) {
        table.setCacheRate(cacheRate);
        return this;
    }

    public FluentTable columnAlignments(final Table.Align[] columnAlignments) {
        table.setColumnAlignments(columnAlignments);
        return this;
    }

    public FluentTable height(final String height) {
        table.setHeight(height);
        return this;
    }

    public FluentTable columnReorderingAllowed(final boolean columnReorderingAllowed) {
        table.setColumnReorderingAllowed(columnReorderingAllowed);
        return this;
    }

    /**
     * @return
     *         #columnReorderingAllowed(true)
     */
    public FluentTable columnReorderingAllowed() {
        return this.columnReorderingAllowed(true);
    }

    public FluentTable sortAscending(final boolean sortAscending) {
        table.setSortAscending(sortAscending);
        return this;
    }

    /**
     * @return
     *         #sortAscending(true)
     */
    public FluentTable sortAscending() {
        return this.sortAscending(true);
    }

    public FluentTable multiSelectMode(final MultiSelectMode multiSelectMode) {
        table.setMultiSelectMode(multiSelectMode);
        return this;
    }

    public FluentTable addAttachListener(final com.vaadin.server.ClientConnector.AttachListener... attachListeners) {
        for (final com.vaadin.server.ClientConnector.AttachListener attachListener : attachListeners) {
            table.addAttachListener(attachListener);
        }
        return this;
    }

    public FluentTable invalidAllowed(final boolean invalidAllowed) {
        table.setInvalidAllowed(invalidAllowed);
        return this;
    }

    /**
     * @return
     *         #invalidAllowed(true)
     */
    public FluentTable invalidAllowed() {
        return this.invalidAllowed(true);
    }

    public FluentTable columnHeaderMode(final Table.ColumnHeaderMode columnHeaderMode) {
        table.setColumnHeaderMode(columnHeaderMode);
        return this;
    }

    public FluentTable itemIconPropertyId(final Object itemIconPropertyId) {
        table.setItemIconPropertyId(itemIconPropertyId);
        return this;
    }

    public FluentTable newItemsAllowed(final boolean newItemsAllowed) {
        table.setNewItemsAllowed(newItemsAllowed);
        return this;
    }

    /**
     * @return
     *         #newItemsAllowed(true)
     */
    public FluentTable newItemsAllowed() {
        return this.newItemsAllowed(true);
    }

    public FluentTable addColumnResizeListener(final Table.ColumnResizeListener... columnResizeListeners) {
        for (final Table.ColumnResizeListener columnResizeListener : columnResizeListeners) {
            table.addColumnResizeListener(columnResizeListener);
        }
        return this;
    }

    public FluentTable cellStyleGenerator(final Table.CellStyleGenerator cellStyleGenerator) {
        table.setCellStyleGenerator(cellStyleGenerator);
        return this;
    }

    public FluentTable tableFieldFactory(final TableFieldFactory tableFieldFactory) {
        table.setTableFieldFactory(tableFieldFactory);
        return this;
    }

    public FluentTable styleName(final String styleName) {
        table.setStyleName(styleName);
        return this;
    }

    public FluentTable addPropertySetChangeListener(final Container.PropertySetChangeListener... propertySetChangeListeners) {
        for (final Container.PropertySetChangeListener propertySetChangeListener : propertySetChangeListeners) {
            table.addPropertySetChangeListener(propertySetChangeListener);
        }
        return this;
    }

    public FluentTable required(final boolean required) {
        table.setRequired(required);
        return this;
    }

    /**
     * @return
     *         #required(true)
     */
    public FluentTable required() {
        return this.required(true);
    }

    public FluentTable addValueChangeListener(final com.vaadin.data.Property.ValueChangeListener... valueChangeListeners) {
        for (final com.vaadin.data.Property.ValueChangeListener valueChangeListener : valueChangeListeners) {
            table.addValueChangeListener(valueChangeListener);
        }
        return this;
    }

    public FluentTable editable(final boolean editable) {
        table.setEditable(editable);
        return this;
    }

    /**
     * @return
     *         #editable(true)
     */
    public FluentTable editable() {
        return this.editable(true);
    }

    public FluentTable addReadOnlyStatusChangeListener(final com.vaadin.data.Property.ReadOnlyStatusChangeListener... readOnlyStatusChangeListeners) {
        for (final com.vaadin.data.Property.ReadOnlyStatusChangeListener readOnlyStatusChangeListener : readOnlyStatusChangeListeners) {
            table.addReadOnlyStatusChangeListener(readOnlyStatusChangeListener);
        }
        return this;
    }

    public FluentTable errorHandler(final ErrorHandler errorHandler) {
        table.setErrorHandler(errorHandler);
        return this;
    }

    public FluentTable rowHeaderMode(final Table.RowHeaderMode rowHeaderMode) {
        table.setRowHeaderMode(rowHeaderMode);
        return this;
    }

    public FluentTable addFooterClickListener(final Table.FooterClickListener... footerClickListeners) {
        for (final Table.FooterClickListener footerClickListener : footerClickListeners) {
            table.addFooterClickListener(footerClickListener);
        }
        return this;
    }

    public FluentTable addValidator(final Validator... validators) {
        for (final Validator validator : validators) {
            table.addValidator(validator);
        }
        return this;
    }

    public FluentTable footerVisible(final boolean footerVisible) {
        table.setFooterVisible(footerVisible);
        return this;
    }

    /**
     * @return
     *         #footerVisible(true)
     */
    public FluentTable footerVisible() {
        return this.footerVisible(true);
    }

    public FluentTable itemCaptionPropertyId(final Object itemCaptionPropertyId) {
        table.setItemCaptionPropertyId(itemCaptionPropertyId);
        return this;
    }

    public FluentTable currentPageFirstItemId(final Object currentPageFirstItemId) {
        table.setCurrentPageFirstItemId(currentPageFirstItemId);
        return this;
    }

    public FluentTable componentError(final ErrorMessage componentError) {
        table.setComponentError(componentError);
        return this;
    }

    public FluentTable nullSelectionAllowed(final boolean nullSelectionAllowed) {
        table.setNullSelectionAllowed(nullSelectionAllowed);
        return this;
    }

    /**
     * @return
     *         #nullSelectionAllowed(true)
     */
    public FluentTable nullSelectionAllowed() {
        return this.nullSelectionAllowed(true);
    }

    public FluentTable convertedValue(final Object convertedValue) {
        table.setConvertedValue(convertedValue);
        return this;
    }

    public FluentTable dragMode(final Table.TableDragMode dragMode) {
        table.setDragMode(dragMode);
        return this;
    }

    public FluentTable primaryStyleName(final String primaryStyleName) {
        table.setPrimaryStyleName(primaryStyleName);
        return this;
    }

    public FluentTable visible(final boolean visible) {
        table.setVisible(visible);
        return this;
    }

    /**
     * @return
     *         #visible(true)
     */
    public FluentTable visible() {
        return this.visible(true);
    }

    public FluentTable addColumnReorderListener(final Table.ColumnReorderListener... columnReorderListeners) {
        for (final Table.ColumnReorderListener columnReorderListener : columnReorderListeners) {
            table.addColumnReorderListener(columnReorderListener);
        }
        return this;
    }

    public FluentTable icon(final Resource icon) {
        table.setIcon(icon);
        return this;
    }

    public FluentTable multiSelect(final boolean multiSelect) {
        table.setMultiSelect(multiSelect);
        return this;
    }

    /**
     * @return
     *         #multiSelect(true)
     */
    public FluentTable multiSelect() {
        return this.multiSelect(true);
    }

    public FluentTable addListener(final com.vaadin.ui.Component.Listener... listeners) {
        for (final com.vaadin.ui.Component.Listener listener : listeners) {
            table.addListener(listener);
        }
        return this;
    }

    public FluentTable dropHandler(final DropHandler dropHandler) {
        table.setDropHandler(dropHandler);
        return this;
    }

    public FluentTable visibleColumns(final Object[] visibleColumns) {
        table.setVisibleColumns(visibleColumns);
        return this;
    }

    public FluentTable addItemSetChangeListener(final Container.ItemSetChangeListener... itemSetChangeListeners) {
        for (final Container.ItemSetChangeListener itemSetChangeListener : itemSetChangeListeners) {
            table.addItemSetChangeListener(itemSetChangeListener);
        }
        return this;
    }

    public FluentTable pageLength(final int pageLength) {
        table.setPageLength(pageLength);
        return this;
    }

    public FluentTable description(final String description) {
        table.setDescription(description);
        return this;
    }

    public FluentTable conversionError(final String conversionError) {
        table.setConversionError(conversionError);
        return this;
    }

    public FluentTable validationVisible(final boolean validationVisible) {
        table.setValidationVisible(validationVisible);
        return this;
    }

    /**
     * @return
     *         #validationVisible(true)
     */
    public FluentTable validationVisible() {
        return this.validationVisible(true);
    }

    public FluentTable readOnly(final boolean readOnly) {
        table.setReadOnly(readOnly);
        return this;
    }

    /**
     * @return
     *         #readOnly(true)
     */
    public FluentTable readOnly() {
        return this.readOnly(true);
    }

    public FluentTable converter(final Converter<Object, ?> converter) {
        table.setConverter(converter);
        return this;
    }

    public FluentTable itemCaptionMode(final com.vaadin.ui.AbstractSelect.ItemCaptionMode itemCaptionMode) {
        table.setItemCaptionMode(itemCaptionMode);
        return this;
    }

    public FluentTable addStyleName(final String... styleNames) {
        for (final String styleName : styleNames) {
            table.addStyleName(styleName);
        }
        return this;
    }

    public FluentTable enabled(final boolean enabled) {
        table.setEnabled(enabled);
        return this;
    }

    /**
     * @return
     *         #enabled(true)
     */
    public FluentTable enabled() {
        return this.enabled(true);
    }

    public FluentTable immediate(final boolean immediate) {
        table.setImmediate(immediate);
        return this;
    }

    /**
     * @return
     *         #immediate(true)
     */
    public FluentTable immediate() {
        return this.immediate(true);
    }

    public FluentTable rowGenerator(final Table.RowGenerator rowGenerator) {
        table.setRowGenerator(rowGenerator);
        return this;
    }

    public FluentTable newItemHandler(final com.vaadin.ui.AbstractSelect.NewItemHandler newItemHandler) {
        table.setNewItemHandler(newItemHandler);
        return this;
    }

    public FluentTable value(final Object value) {
        table.setValue(value);
        return this;
    }

    public FluentTable addDetachListener(final com.vaadin.server.ClientConnector.DetachListener... detachListeners) {
        for (final com.vaadin.server.ClientConnector.DetachListener detachListener : detachListeners) {
            table.addDetachListener(detachListener);
        }
        return this;
    }

    public FluentTable requiredError(final String requiredError) {
        table.setRequiredError(requiredError);
        required(requiredError != null);
        return this;
    }

    public FluentTable buffered(final boolean buffered) {
        table.setBuffered(buffered);
        return this;
    }

    /**
     * @return
     *         #buffered(true)
     */
    public FluentTable buffered() {
        return this.buffered(true);
    }

    public FluentTable columnCollapsingAllowed(final boolean columnCollapsingAllowed) {
        table.setColumnCollapsingAllowed(columnCollapsingAllowed);
        return this;
    }

    /**
     * @return
     *         #columnCollapsingAllowed(true)
     */
    public FluentTable columnCollapsingAllowed() {
        return this.columnCollapsingAllowed(true);
    }

    public FluentTable addHeaderClickListener(final Table.HeaderClickListener... headerClickListeners) {
        for (final Table.HeaderClickListener headerClickListener : headerClickListeners) {
            table.addHeaderClickListener(headerClickListener);
        }
        return this;
    }

    public FluentTable containerDataSource(final Container containerDataSource) {
        table.setContainerDataSource(containerDataSource);
        return this;
    }

    public FluentTable caption(final String caption) {
        table.setCaption(caption);
        return this;
    }

    public FluentTable sortEnabled(final boolean sortEnabled) {
        table.setSortEnabled(sortEnabled);
        return this;
    }

    /**
     * @return
     *         #sortEnabled(true)
     */
    public FluentTable sortEnabled() {
        return this.sortEnabled(true);
    }

    public FluentTable columnHeaders(final String[] columnHeaders) {
        table.setColumnHeaders(columnHeaders);
        return this;
    }

}
