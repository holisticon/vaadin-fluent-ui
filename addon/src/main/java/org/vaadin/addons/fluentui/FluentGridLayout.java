package org.vaadin.addons.fluentui;


// CHECKSTYLE:OFF generated class
import java.util.Locale;
import javax.annotation.Generated;
import com.vaadin.event.ShortcutListener;
import com.vaadin.server.ErrorHandler;
import com.vaadin.server.ErrorMessage;
import com.vaadin.server.Resource;
import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.ui.Component;
import com.vaadin.ui.GridLayout;

@Generated(value = "de.holisticon.toolbox.fluent.generator.FluentApiGenerator", date = "09.07.2013 13:44:32")
public final class FluentGridLayout {

    /**
     * delegate
     */
    private final GridLayout gridLayout;

    /**
     * Hide constructor, use static factory methods.
     */
    private FluentGridLayout(final GridLayout gridLayout) {
        this.gridLayout = gridLayout;
    }

    /**
     * @return
     *         the created instance
     */
    public final GridLayout get() {
        return gridLayout;
    }

    public static FluentGridLayout gridLayout(final int int0, final int int1, final Component... components) {
        return new FluentGridLayout(new GridLayout(int0, int1, components));
    }

    public static FluentGridLayout gridLayout() {
        return new FluentGridLayout(new GridLayout());
    }

    public static FluentGridLayout gridLayout(final int int0, final int int1) {
        return new FluentGridLayout(new GridLayout(int0, int1));
    }

    public FluentGridLayout width(final String width) {
        gridLayout.setWidth(width);
        return this;
    }

    public FluentGridLayout enabled(final boolean enabled) {
        gridLayout.setEnabled(enabled);
        return this;
    }

    /**
     * @return
     *         #enabled(true)
     */
    public FluentGridLayout enabled() {
        return this.enabled(true);
    }

    public FluentGridLayout errorHandler(final ErrorHandler errorHandler) {
        gridLayout.setErrorHandler(errorHandler);
        return this;
    }

    public FluentGridLayout addLayoutClickListener(final com.vaadin.event.LayoutEvents.LayoutClickListener... layoutClickListeners) {
        for (final com.vaadin.event.LayoutEvents.LayoutClickListener layoutClickListener : layoutClickListeners) {
            gridLayout.addLayoutClickListener(layoutClickListener);
        }
        return this;
    }

    public FluentGridLayout data(final Object data) {
        gridLayout.setData(data);
        return this;
    }

    public FluentGridLayout componentError(final ErrorMessage componentError) {
        gridLayout.setComponentError(componentError);
        return this;
    }

    public FluentGridLayout primaryStyleName(final String primaryStyleName) {
        gridLayout.setPrimaryStyleName(primaryStyleName);
        return this;
    }

    public FluentGridLayout addShortcutListener(final ShortcutListener... shortcutListeners) {
        for (final ShortcutListener shortcutListener : shortcutListeners) {
            gridLayout.addShortcutListener(shortcutListener);
        }
        return this;
    }

    public FluentGridLayout icon(final Resource icon) {
        gridLayout.setIcon(icon);
        return this;
    }

    public FluentGridLayout height(final String height) {
        gridLayout.setHeight(height);
        return this;
    }

    public FluentGridLayout addListener(final Component.Listener... listeners) {
        for (final Component.Listener listener : listeners) {
            gridLayout.addListener(listener);
        }
        return this;
    }

    public FluentGridLayout spacing(final boolean spacing) {
        gridLayout.setSpacing(spacing);
        return this;
    }

    /**
     * @return
     *         #spacing(true)
     */
    public FluentGridLayout spacing() {
        return this.spacing(true);
    }

    public FluentGridLayout locale(final Locale locale) {
        gridLayout.setLocale(locale);
        return this;
    }

    public FluentGridLayout rows(final int rows) {
        gridLayout.setRows(rows);
        return this;
    }

    public FluentGridLayout addComponent(final Component... components) {
        for (final Component component : components) {
            gridLayout.addComponent(component);
        }
        return this;
    }

    public FluentGridLayout addComponentAttachListener(final com.vaadin.ui.HasComponents.ComponentAttachListener... componentAttachListeners) {
        for (final com.vaadin.ui.HasComponents.ComponentAttachListener componentAttachListener : componentAttachListeners) {
            gridLayout.addComponentAttachListener(componentAttachListener);
        }
        return this;
    }

    public FluentGridLayout addAttachListener(final com.vaadin.server.ClientConnector.AttachListener... attachListeners) {
        for (final com.vaadin.server.ClientConnector.AttachListener attachListener : attachListeners) {
            gridLayout.addAttachListener(attachListener);
        }
        return this;
    }

    public FluentGridLayout description(final String description) {
        gridLayout.setDescription(description);
        return this;
    }

    public FluentGridLayout columns(final int columns) {
        gridLayout.setColumns(columns);
        return this;
    }

    public FluentGridLayout visible(final boolean visible) {
        gridLayout.setVisible(visible);
        return this;
    }

    /**
     * @return
     *         #visible(true)
     */
    public FluentGridLayout visible() {
        return this.visible(true);
    }

    public FluentGridLayout addComponentDetachListener(final com.vaadin.ui.HasComponents.ComponentDetachListener... componentDetachListeners) {
        for (final com.vaadin.ui.HasComponents.ComponentDetachListener componentDetachListener : componentDetachListeners) {
            gridLayout.addComponentDetachListener(componentDetachListener);
        }
        return this;
    }

    public FluentGridLayout addStyleName(final String... styleNames) {
        for (final String styleName : styleNames) {
            gridLayout.addStyleName(styleName);
        }
        return this;
    }

    public FluentGridLayout margin(final boolean margin) {
        gridLayout.setMargin(margin);
        return this;
    }

    /**
     * @return
     *         #margin(true)
     */
    public FluentGridLayout margin() {
        return this.margin(true);
    }

    public FluentGridLayout margin(final MarginInfo margin) {
        gridLayout.setMargin(margin);
        return this;
    }

    public FluentGridLayout addComponents(final Component[]... componentss) {
        for (final Component[] components : componentss) {
            gridLayout.addComponents(components);
        }
        return this;
    }

    public FluentGridLayout immediate(final boolean immediate) {
        gridLayout.setImmediate(immediate);
        return this;
    }

    /**
     * @return
     *         #immediate(true)
     */
    public FluentGridLayout immediate() {
        return this.immediate(true);
    }

    public FluentGridLayout readOnly(final boolean readOnly) {
        gridLayout.setReadOnly(readOnly);
        return this;
    }

    /**
     * @return
     *         #readOnly(true)
     */
    public FluentGridLayout readOnly() {
        return this.readOnly(true);
    }

    public FluentGridLayout addDetachListener(final com.vaadin.server.ClientConnector.DetachListener... detachListeners) {
        for (final com.vaadin.server.ClientConnector.DetachListener detachListener : detachListeners) {
            gridLayout.addDetachListener(detachListener);
        }
        return this;
    }

    public FluentGridLayout caption(final String caption) {
        gridLayout.setCaption(caption);
        return this;
    }

    public FluentGridLayout styleName(final String styleName) {
        gridLayout.setStyleName(styleName);
        return this;
    }

    public FluentGridLayout cursorY(final int cursorY) {
        gridLayout.setCursorY(cursorY);
        return this;
    }

    public FluentGridLayout cursorX(final int cursorX) {
        gridLayout.setCursorX(cursorX);
        return this;
    }

}
