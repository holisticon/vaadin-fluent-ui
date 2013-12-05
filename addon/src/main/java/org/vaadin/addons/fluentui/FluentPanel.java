package org.vaadin.addons.fluentui;


// CHECKSTYLE:OFF generated class
import java.util.Locale;
import javax.annotation.Generated;
import com.vaadin.event.Action;
import com.vaadin.event.ShortcutListener;
import com.vaadin.server.ErrorHandler;
import com.vaadin.server.ErrorMessage;
import com.vaadin.server.Resource;
import com.vaadin.ui.Component;
import com.vaadin.ui.Panel;

@Generated(value = "de.holisticon.toolbox.fluent.generator.FluentApiGenerator", date = "09.07.2013 13:44:33")
public final class FluentPanel {

    /**
     * delegate
     */
    private final Panel panel;

    /**
     * Hide constructor, use static factory methods.
     */
    private FluentPanel(final Panel panel) {
        this.panel = panel;
    }

    /**
     * @return
     *         the created instance
     */
    public final Panel get() {
        return panel;
    }

    public static FluentPanel panel() {
        return new FluentPanel(new Panel());
    }

    public static FluentPanel panel(final Component component0) {
        return new FluentPanel(new Panel(component0));
    }

    public static FluentPanel panel(final String string0) {
        return new FluentPanel(new Panel(string0));
    }

    public static FluentPanel panel(final String string0, final Component component1) {
        return new FluentPanel(new Panel(string0, component1));
    }

    public FluentPanel width(final String width) {
        panel.setWidth(width);
        return this;
    }

    public FluentPanel enabled(final boolean enabled) {
        panel.setEnabled(enabled);
        return this;
    }

    /**
     * @return
     *         #enabled(true)
     */
    public FluentPanel enabled() {
        return this.enabled(true);
    }

    public FluentPanel errorHandler(final ErrorHandler errorHandler) {
        panel.setErrorHandler(errorHandler);
        return this;
    }

    public FluentPanel data(final Object data) {
        panel.setData(data);
        return this;
    }

    public FluentPanel tabIndex(final int tabIndex) {
        panel.setTabIndex(tabIndex);
        return this;
    }

    public FluentPanel scrollTop(final int scrollTop) {
        panel.setScrollTop(scrollTop);
        return this;
    }

    public FluentPanel componentError(final ErrorMessage componentError) {
        panel.setComponentError(componentError);
        return this;
    }

    public FluentPanel scrollLeft(final int scrollLeft) {
        panel.setScrollLeft(scrollLeft);
        return this;
    }

    public FluentPanel primaryStyleName(final String primaryStyleName) {
        panel.setPrimaryStyleName(primaryStyleName);
        return this;
    }

    public FluentPanel addShortcutListener(final ShortcutListener... shortcutListeners) {
        for (final ShortcutListener shortcutListener : shortcutListeners) {
            panel.addShortcutListener(shortcutListener);
        }
        return this;
    }

    public FluentPanel icon(final Resource icon) {
        panel.setIcon(icon);
        return this;
    }

    public FluentPanel height(final String height) {
        panel.setHeight(height);
        return this;
    }

    public FluentPanel addListener(final Component.Listener... listeners) {
        for (final Component.Listener listener : listeners) {
            panel.addListener(listener);
        }
        return this;
    }

    public FluentPanel locale(final Locale locale) {
        panel.setLocale(locale);
        return this;
    }

    public FluentPanel addAttachListener(final com.vaadin.server.ClientConnector.AttachListener... attachListeners) {
        for (final com.vaadin.server.ClientConnector.AttachListener attachListener : attachListeners) {
            panel.addAttachListener(attachListener);
        }
        return this;
    }

    public FluentPanel caption(final String caption) {
        panel.setCaption(caption);
        return this;
    }

    public FluentPanel description(final String description) {
        panel.setDescription(description);
        return this;
    }

    public FluentPanel visible(final boolean visible) {
        panel.setVisible(visible);
        return this;
    }

    /**
     * @return
     *         #visible(true)
     */
    public FluentPanel visible() {
        return this.visible(true);
    }

    public FluentPanel addStyleName(final String... styleNames) {
        for (final String styleName : styleNames) {
            panel.addStyleName(styleName);
        }
        return this;
    }

    public FluentPanel immediate(final boolean immediate) {
        panel.setImmediate(immediate);
        return this;
    }

    /**
     * @return
     *         #immediate(true)
     */
    public FluentPanel immediate() {
        return this.immediate(true);
    }

    public FluentPanel addActionHandler(final Action.Handler... actionHandlers) {
        for (final Action.Handler actionHandler : actionHandlers) {
            panel.addActionHandler(actionHandler);
        }
        return this;
    }

    public FluentPanel readOnly(final boolean readOnly) {
        panel.setReadOnly(readOnly);
        return this;
    }

    /**
     * @return
     *         #readOnly(true)
     */
    public FluentPanel readOnly() {
        return this.readOnly(true);
    }

    public FluentPanel addDetachListener(final com.vaadin.server.ClientConnector.DetachListener... detachListeners) {
        for (final com.vaadin.server.ClientConnector.DetachListener detachListener : detachListeners) {
            panel.addDetachListener(detachListener);
        }
        return this;
    }

    public FluentPanel addComponentAttachListener(final com.vaadin.ui.HasComponents.ComponentAttachListener... componentAttachListeners) {
        for (final com.vaadin.ui.HasComponents.ComponentAttachListener componentAttachListener : componentAttachListeners) {
            panel.addComponentAttachListener(componentAttachListener);
        }
        return this;
    }

    public FluentPanel content(final Component content) {
        panel.setContent(content);
        return this;
    }

    public FluentPanel styleName(final String styleName) {
        panel.setStyleName(styleName);
        return this;
    }

    public FluentPanel addComponentDetachListener(final com.vaadin.ui.HasComponents.ComponentDetachListener... componentDetachListeners) {
        for (final com.vaadin.ui.HasComponents.ComponentDetachListener componentDetachListener : componentDetachListeners) {
            panel.addComponentDetachListener(componentDetachListener);
        }
        return this;
    }

    public FluentPanel addClickListener(final com.vaadin.event.MouseEvents.ClickListener... clickListeners) {
        for (final com.vaadin.event.MouseEvents.ClickListener clickListener : clickListeners) {
            panel.addClickListener(clickListener);
        }
        return this;
    }

}
