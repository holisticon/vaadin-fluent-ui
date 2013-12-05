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
import com.vaadin.ui.FormLayout;

@Generated(value = "de.holisticon.toolbox.fluent.generator.FluentApiGenerator", date = "09.07.2013 13:44:32")
public final class FluentFormLayout {

    /**
     * delegate
     */
    private final FormLayout formLayout;

    /**
     * Hide constructor, use static factory methods.
     */
    private FluentFormLayout(final FormLayout formLayout) {
        this.formLayout = formLayout;
    }

    /**
     * @return
     *         the created instance
     */
    public final FormLayout get() {
        return formLayout;
    }

    public static FluentFormLayout formLayout() {
        return new FluentFormLayout(new FormLayout());
    }

    public static FluentFormLayout formLayout(final Component... components) {
        return new FluentFormLayout(new FormLayout(components));
    }

    public FluentFormLayout width(final String width) {
        formLayout.setWidth(width);
        return this;
    }

    public FluentFormLayout enabled(final boolean enabled) {
        formLayout.setEnabled(enabled);
        return this;
    }

    /**
     * @return
     *         #enabled(true)
     */
    public FluentFormLayout enabled() {
        return this.enabled(true);
    }

    public FluentFormLayout margin(final boolean margin) {
        formLayout.setMargin(margin);
        return this;
    }

    /**
     * @return
     *         #margin(true)
     */
    public FluentFormLayout margin() {
        return this.margin(true);
    }

    public FluentFormLayout margin(final MarginInfo margin) {
        formLayout.setMargin(margin);
        return this;
    }

    public FluentFormLayout errorHandler(final ErrorHandler errorHandler) {
        formLayout.setErrorHandler(errorHandler);
        return this;
    }

    public FluentFormLayout data(final Object data) {
        formLayout.setData(data);
        return this;
    }

    public FluentFormLayout componentError(final ErrorMessage componentError) {
        formLayout.setComponentError(componentError);
        return this;
    }

    public FluentFormLayout addComponent(final Component... components) {
        for (final Component component : components) {
            formLayout.addComponent(component);
        }
        return this;
    }

    public FluentFormLayout primaryStyleName(final String primaryStyleName) {
        formLayout.setPrimaryStyleName(primaryStyleName);
        return this;
    }

    public FluentFormLayout addShortcutListener(final ShortcutListener... shortcutListeners) {
        for (final ShortcutListener shortcutListener : shortcutListeners) {
            formLayout.addShortcutListener(shortcutListener);
        }
        return this;
    }

    public FluentFormLayout icon(final Resource icon) {
        formLayout.setIcon(icon);
        return this;
    }

    public FluentFormLayout height(final String height) {
        formLayout.setHeight(height);
        return this;
    }

    public FluentFormLayout addListener(final Component.Listener... listeners) {
        for (final Component.Listener listener : listeners) {
            formLayout.addListener(listener);
        }
        return this;
    }

    public FluentFormLayout locale(final Locale locale) {
        formLayout.setLocale(locale);
        return this;
    }

    public FluentFormLayout addComponentAttachListener(final com.vaadin.ui.HasComponents.ComponentAttachListener... componentAttachListeners) {
        for (final com.vaadin.ui.HasComponents.ComponentAttachListener componentAttachListener : componentAttachListeners) {
            formLayout.addComponentAttachListener(componentAttachListener);
        }
        return this;
    }

    public FluentFormLayout addAttachListener(final com.vaadin.server.ClientConnector.AttachListener... attachListeners) {
        for (final com.vaadin.server.ClientConnector.AttachListener attachListener : attachListeners) {
            formLayout.addAttachListener(attachListener);
        }
        return this;
    }

    public FluentFormLayout description(final String description) {
        formLayout.setDescription(description);
        return this;
    }

    public FluentFormLayout spacing(final boolean spacing) {
        formLayout.setSpacing(spacing);
        return this;
    }

    /**
     * @return
     *         #spacing(true)
     */
    public FluentFormLayout spacing() {
        return this.spacing(true);
    }

    public FluentFormLayout visible(final boolean visible) {
        formLayout.setVisible(visible);
        return this;
    }

    /**
     * @return
     *         #visible(true)
     */
    public FluentFormLayout visible() {
        return this.visible(true);
    }

    public FluentFormLayout addComponentDetachListener(final com.vaadin.ui.HasComponents.ComponentDetachListener... componentDetachListeners) {
        for (final com.vaadin.ui.HasComponents.ComponentDetachListener componentDetachListener : componentDetachListeners) {
            formLayout.addComponentDetachListener(componentDetachListener);
        }
        return this;
    }

    public FluentFormLayout addComponentAsFirst(final Component... componentAsFirsts) {
        for (final Component componentAsFirst : componentAsFirsts) {
            formLayout.addComponentAsFirst(componentAsFirst);
        }
        return this;
    }

    public FluentFormLayout addStyleName(final String... styleNames) {
        for (final String styleName : styleNames) {
            formLayout.addStyleName(styleName);
        }
        return this;
    }

    public FluentFormLayout addComponents(final Component[]... componentss) {
        for (final Component[] components : componentss) {
            formLayout.addComponents(components);
        }
        return this;
    }

    public FluentFormLayout immediate(final boolean immediate) {
        formLayout.setImmediate(immediate);
        return this;
    }

    /**
     * @return
     *         #immediate(true)
     */
    public FluentFormLayout immediate() {
        return this.immediate(true);
    }

    public FluentFormLayout readOnly(final boolean readOnly) {
        formLayout.setReadOnly(readOnly);
        return this;
    }

    /**
     * @return
     *         #readOnly(true)
     */
    public FluentFormLayout readOnly() {
        return this.readOnly(true);
    }

    public FluentFormLayout addDetachListener(final com.vaadin.server.ClientConnector.DetachListener... detachListeners) {
        for (final com.vaadin.server.ClientConnector.DetachListener detachListener : detachListeners) {
            formLayout.addDetachListener(detachListener);
        }
        return this;
    }

    public FluentFormLayout caption(final String caption) {
        formLayout.setCaption(caption);
        return this;
    }

    public FluentFormLayout addLayoutClickListener(final com.vaadin.event.LayoutEvents.LayoutClickListener... layoutClickListeners) {
        for (final com.vaadin.event.LayoutEvents.LayoutClickListener layoutClickListener : layoutClickListeners) {
            formLayout.addLayoutClickListener(layoutClickListener);
        }
        return this;
    }

    public FluentFormLayout styleName(final String styleName) {
        formLayout.setStyleName(styleName);
        return this;
    }

}
